package com.login.demo.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appController {
	@GetMapping("/dashboard")
	public String getDashboard(){
		return "dashboard";
	}
	@GetMapping({"/","/login"})
	public String getLogin(){
		return "login";
	}

}
