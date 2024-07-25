package com.example.JwtAuth.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JwtAuth.model.User;
import com.example.JwtAuth.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
    private UserService userService;
	
	
    @GetMapping("/user")
    public List<User> getUser() {
    	System.out.println("getting users");
    	return this.userService.getUsers();
    }


}