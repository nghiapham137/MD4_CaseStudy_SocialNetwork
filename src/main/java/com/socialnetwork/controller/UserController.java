//package com.socialnetwork.controller;
//
//import com.socialnetwork.model.App_User;
//import com.socialnetwork.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//@RequestMapping("/user")
//public class UserController {
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("")
//    public ModelAndView showNewFeed(@ModelAttribute("user") App_User user) {
//        ModelAndView modelAndView = new ModelAndView("/newfeed");
//        modelAndView.addObject("user", user);
//        return modelAndView;
//    }
//
//    @GetMapping("/${username}")
//    public ModelAndView showUserProfile(@ModelAttribute("user")App_User user) {
//        ModelAndView modelAndView = new ModelAndView("/profile");
//        modelAndView.addObject("user", user);
//        return modelAndView;
//    }
//
//
//
//}
