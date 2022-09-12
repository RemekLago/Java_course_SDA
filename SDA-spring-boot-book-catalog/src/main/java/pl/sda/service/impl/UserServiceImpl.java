package pl.sda.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.dto.UserDto;
import pl.sda.exception.EmptyUsernameException;
import pl.sda.exception.InvalidPasswordException;
import pl.sda.exception.PasswordMismatchException;
import pl.sda.exception.UsernameExistsException;
import pl.sda.model.Role;
import pl.sda.model.User;
import pl.sda.repository.RoleRepository;
import pl.sda.repository.UserRepository;
import pl.sda.service.UserService;
import pl.sda.util.PasswordValidator;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordValidator passwordValidator;

    private final RoleRepository roleRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordValidator passwordValidator, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.passwordValidator = passwordValidator;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    /*
       1. czy username jest puste - jeśli tak - rzuć wyjątek EmptyUsernameException
       2. czy username jest unikalne - jeśli nie - rzuć wyjątek UsernameExistsException
       3. czy hasło i powtórzone hasło są tymi samymi ciągami znaków - jeśli nie - rzuć wyjątek PasswordMismatchExcpetion
       4. czy hasło spełnia parametry? jeśli nie -rzuć wyjątek - InvalidPasswordException
       5. zamienić obiekt UserDto na User
       6. do obiektu User przypisać rolę USER
       7. na obiekcie User zakodować hasło
       8. zapisz obiekt User
       * */
    @Override
    public void save(UserDto userDto) throws EmptyUsernameException, UsernameExistsException, PasswordMismatchException, InvalidPasswordException {
        validateUserDto(userDto);
        Role role = roleRepository.findByName("USER");
        User newUser = new User(null, userDto.getUsername(), userDto.getPassword(), Arrays.asList(role));
        newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
        userRepository.save(newUser);
    }

    private void validateUserDto(UserDto userDto) throws EmptyUsernameException, UsernameExistsException, PasswordMismatchException, InvalidPasswordException {
        if (userDto.getUsername() == null || userDto.getUsername().isBlank()) {
            throw new EmptyUsernameException("Username can not be empty!");
        }

        if (userRepository.existsByUsername(userDto.getUsername())) {
            throw new UsernameExistsException("User with username " + userDto.getUsername() + " exists!");
        }

        if (userDto.getPassword() == null
                || userDto.getRepeatedPassword() == null
                || !userDto.getPassword().equals(userDto.getRepeatedPassword())) {
            throw new PasswordMismatchException("Passwords does not mismatch!");
        }

        if (!passwordValidator.isPasswordValid(userDto.getPassword())) {
            throw new InvalidPasswordException("Password is not valid!");
        }
    }
}
