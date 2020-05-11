package com.login.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.demo.entidades.Usr;

@Repository
public interface usrRepository extends JpaRepository<Usr,Long> {


	public Usr findByUsername(String username);

}
