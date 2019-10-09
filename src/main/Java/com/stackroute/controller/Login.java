package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {
    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("username") String username,@RequestParam("password") String password){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        User user = new User(username,password);
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
