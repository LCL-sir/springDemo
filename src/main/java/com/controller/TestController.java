package com.controller;


import com.service.TestUserService;
import com.entity.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    private TestUserService testUserService;

    @GetMapping("/usersList")
    public List<users> usersList(){
        return testUserService.usersList();
    }
}
