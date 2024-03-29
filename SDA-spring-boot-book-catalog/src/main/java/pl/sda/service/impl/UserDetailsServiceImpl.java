package pl.sda.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.sda.model.User;
import pl.sda.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User userFromDB = userRepository.findByUsername(username);

        if (userFromDB == null) {
            throw new UsernameNotFoundException("User with username " + username + " not found!");
        }

        String [] roles = userFromDB.getRoles()
                .stream()
                .map(r -> r.getName())
                .toArray(String[]::new);

        return org.springframework.security.core.userdetails.User.builder()
                .username(userFromDB.getUsername())
                .password(userFromDB.getPassword())
                .roles(roles)
                .build();
    }
}

