package br.com.monitora.conta.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.monitora.conta.modelo.Login;

@Repository
public class LoginDao {
	@Autowired
	EntityManager manager;
	
	
	public void salva(Login login) {
		manager.persist(login);
	}
}
