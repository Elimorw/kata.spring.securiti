package ru.kata.spring.securiti.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.securiti.models.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public String startPageUser(@AuthenticationPrincipal User user, ModelMap model) {
        model.addAttribute("user", user);
        return "pages/user";
    }
}
