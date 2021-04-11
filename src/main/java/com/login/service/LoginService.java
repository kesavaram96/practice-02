package com.login.service;

import org.springframework.stereotype.Service;

import com.login.Model.User;
import com.login.Model.UserRepo;

@Service
public class LoginService {
	
	private UserRepo uRepo;
	
	public User adduser(User user) {
		return uRepo.save(user);
	}
}
