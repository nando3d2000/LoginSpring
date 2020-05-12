package com.login.demo.Controlador;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.login.demo.entidades.Authorities;
import com.login.demo.servicios.customSecurityUser;

@Controller
public class appController {
	@GetMapping("/dashboard")
	public String getDashboard(@AuthenticationPrincipal customSecurityUser usuario, ModelMap model){
		String ruta="";
		System.out.println(usuario);
		model.put("usuario", usuario);
		Set<Authorities> Lista=new HashSet<>();
		Lista=usuario.getAuthorities();
		Iterator<Authorities> it=Lista.iterator();
		Authorities auth=(Authorities)it.next();
		if(auth.getAuthority().equals("ROLE_ADMIN"))
			ruta="dashboardadmin";
		else if(auth.getAuthority().equals("ROLE_USUARIO"))
			ruta="dashboarduser";
		return ruta;
	}
	@GetMapping({"/","/login"})
	public String getLogin(){
		return "login";
	}
}
