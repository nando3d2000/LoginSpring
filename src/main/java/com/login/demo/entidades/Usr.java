package com.login.demo.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Usr{
	@Id
	private Long id;
	private String username;
	private String password;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
	private Authorities authorities;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Authorities getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Authorities authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "Usr [id=" + id + ", username=" + username + ", password=" + password + ", authorities=" + authorities
				+ ", toString()=" + super.toString() + "]";
	}
	
}
