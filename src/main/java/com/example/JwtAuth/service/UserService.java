package com.example.JwtAuth.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.JwtAuth.model.User;

@Service
public class UserService {
	
	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString() ,"Harsh kumar", "harsh@gmail.com") );
		store.add(new User(UUID.randomUUID().toString() ,"Anshu kumar", "anshu@gmail.com") );
		store.add(new User(UUID.randomUUID().toString() ,"Rahul kumar", "rahul@gmail.com") );
		store.add(new User(UUID.randomUUID().toString() ,"muskan kumar", "muskan@gmail.com") );
			
	}
	
	public List<User> getUsers() {
		return this.store;
	}
	
}
