package com.login.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.login.Login.LoginController;

@SpringBootApplication
public class Login1Application {

	public static void main(String[] args) {
		SpringApplication.run(Login1Application.class, args);
		LoginController lc=new LoginController();
		
		
		
		System.out.print("Hii"+lc);

	}
	

}
