package com.baoly.controller;

import com.baoly.bean.User;
import com.baoly.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping("/hello2")
    public List<String> getUsers() {
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            users.add("nightcat" + i);
        }
        return users;
    }

    @GetMapping("/hello3")
    public List<User> getAllUser() {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setAge(i);
            user.setUserName("nightcat" + i);
            user.setBirthday(new Date());
            users.add(user);
        }
        return users;

    }
}
