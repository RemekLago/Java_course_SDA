package pl.sda.controller;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import pl.sda.dto.UserDto;
import pl.sda.model.User;
import pl.sda.repository.UserRepository;
import pl.sda.service.BookService;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class RegistrationControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void shouldRegisterUser() throws Exception {
        UserDto userDto = getTestUserDto();
//        userService.save(userDto);

        mockMvc.perform(MockMvcRequestBuilders.post("/register")
                        .param("username", userDto.getUsername())
                        .param("password", userDto.getPassword())
                        .param("repeatedPassword", userDto.getRepeatedPassword())
                )//zakończenie metody perform
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.view().name("redirect:/books/list"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/books/list"));

        User userFromDB = userRepository.findByUsername(userDto.getUsername());
        Assertions.assertEquals(userDto.getUsername(), userFromDB.getUsername());
    }

    private UserDto getTestUserDto() {
        return new UserDto("testuser", "Pass123!", "Pass123!");
    }

}
