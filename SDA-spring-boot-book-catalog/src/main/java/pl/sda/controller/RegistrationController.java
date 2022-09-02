package pl.sda.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.dto.UserDto;
import pl.sda.exception.EmptyUsernameException;
import pl.sda.exception.InvalidPasswordException;
import pl.sda.exception.PasswordMismatchException;
import pl.sda.exception.UsernameExistsException;
import pl.sda.service.UserService;

@Slf4j
@Controller
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/registration")
//    public String showRegistrationForm(ModelMap modelMap) {
//        modelMap.addAttribute("emptyUser", new UserDto());
//        return "registration";
//    }

    //powyższa implementacja jest równoważna
    @GetMapping("/registration")
    public ModelAndView showRegistrationForm() {
        ModelAndView modelAndView = new ModelAndView("registration");
        modelAndView.addObject("emptyUser", new UserDto());
        return modelAndView;
    }

    @PostMapping("/register")
    public String handleNewUser(@ModelAttribute("emptyUser") UserDto userDto, ModelMap modelMap) {
        log.info("Handle new user: " + userDto);

        try {
            userService.save(userDto);
        } catch (EmptyUsernameException | UsernameExistsException | PasswordMismatchException | InvalidPasswordException e) {
            log.error(e.getMessage());
            modelMap.addAttribute("exceptionMessage", e.getMessage());
            return "registration";
        }

        return "redirect:/login";
    }

}
