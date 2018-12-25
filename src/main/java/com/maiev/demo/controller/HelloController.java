package com.maiev.demo.controller;

import com.maiev.demo.pojo.User;
import com.maiev.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;

@Controller
public class HelloController{

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(Model model){

        User map = userService.getUser3(31);
        User user1 = userService.getUser2(17);
        model.addAttribute("user1", user1);
        model.addAttribute("hello", "maiev");
        model.addAttribute(map);
        return "tbj/hello";
    }

}
