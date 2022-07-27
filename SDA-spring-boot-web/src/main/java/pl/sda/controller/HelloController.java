package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String showWelcomePage(){
        return "welcome";
    }
    @GetMapping("/hello-msg")
    public String showWelcomePageWithMsg(ModelMap modelMap){
        modelMap.addAttribute("helloMsg", "tekst z kontrolera");
        modelMap.addAttribute("elements", Arrays.asList("one", "two", "three"));
        return "welcome-msg";
    }

}
