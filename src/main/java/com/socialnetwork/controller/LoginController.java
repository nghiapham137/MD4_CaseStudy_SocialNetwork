package com.socialnetwork.controller;

import com.socialnetwork.model.App_User;
import com.socialnetwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String loginPage(){
        return "login";
    }


    @RequestMapping("/admin")
    public String adminPage(){
        return "admin";
    }

    @GetMapping("/sign-up")
    public String signUpPage() {
        return "signup";
    }

    @PostMapping("/sign-up")
    public ModelAndView signUp(App_User user) {
        ModelAndView mav = new ModelAndView("/login");
        mav.addObject("user", user);
        String role = "ROLE_USER";
        user.setRoles(role);
        user.setActive(true);
        for (App_User user1 : userService.findAll()){
            if (user1.getUsername().equals(user.getUsername())) return mav.addObject("message");
        }
        userService.save(user);
        return mav;
    }

    @GetMapping("/cut")
    public String accessDenied() {
        return "";
    }
}
