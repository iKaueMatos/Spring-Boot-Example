package com.tx.user.controller;

import com.tx.user.entity.User;
import com.tx.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public User addUser() throws Exception {
        User user = new User("Kitty", new Date());
        user = userService.addUser(user);
        return user;
    }
}
