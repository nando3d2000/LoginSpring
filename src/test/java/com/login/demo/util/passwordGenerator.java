package com.login.demo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class passwordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		
		System.out.println(passwordEncoder.encode("chepe123"));
	}

}
