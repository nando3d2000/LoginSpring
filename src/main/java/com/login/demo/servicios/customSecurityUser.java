package com.login.demo.servicios;



import java.util.HashSet;
import java.util.Set;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.login.demo.entidades.Authorities;
import com.login.demo.entidades.Usr;


@Service
public class customSecurityUser  implements UserDetails{

	private static final long serialVersionUID = -9063143449935990959L;
	private Set<Authorities> authorities = new HashSet<>();
	private String Password;
	private String Username;
	
	public customSecurityUser() {};
	
	public customSecurityUser(Usr usuario){
		Set<Authorities> aux=new HashSet<>();
		aux.add(usuario.getAuthorities());
		this.setAuthorities(aux);
		this.Username=usuario.getUsername();
		this.Password=usuario.getPassword();
	}
	


	public void setAuthorities(Set<Authorities> authorities) {
		this.authorities = authorities;
	}

	@Override
	public Set<Authorities> getAuthorities() {
		
		return authorities;
	}


	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}


	@Override
	public String getPassword() {
		return Password;
	}

	@Override
	public String getUsername() {
		return Username;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public void setUsername(String username) {
		Username = username;
	}
	
}
