package com.login.demo.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.login.demo.entidades.Usr;
import com.login.demo.repositorios.usrRepository;

@Service
public class userDetailService implements UserDetailsService{

	@Autowired
	private usrRepository usrRepo;
		
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		Usr usuario=usrRepo.findByUsername(username);
		
		if(usuario== null)
			throw new UsernameNotFoundException("Usuario y password incorrectos");
		
		return new customSecurityUser(usuario);
	}

}
