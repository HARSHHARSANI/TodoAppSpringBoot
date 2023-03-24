package com.example.todoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
		
	boolean authenticate(String username , String password) {
		
		boolean isValidUsername = username.equalsIgnoreCase("harsh");
		boolean isValidPassword = password.equalsIgnoreCase("harsani");
		
		
		return isValidUsername && isValidPassword;
	}
}
