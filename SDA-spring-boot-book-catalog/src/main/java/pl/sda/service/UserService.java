package pl.sda.service;

import pl.sda.dto.UserDto;
import pl.sda.exception.EmptyUsernameException;
import pl.sda.exception.InvalidPasswordException;
import pl.sda.exception.PasswordMismatchException;
import pl.sda.exception.UsernameExistsException;

public interface UserService {

    void save(UserDto userDto) throws EmptyUsernameException, UsernameExistsException, PasswordMismatchException, InvalidPasswordException;

}
