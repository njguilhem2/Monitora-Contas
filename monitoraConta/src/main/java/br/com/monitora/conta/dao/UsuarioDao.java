package br.com.monitora.conta.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.monitora.conta.modelo.Usuario;

public class UsuarioDao {
	@PersistenceContext
	EntityManager manager;
	@Autowired
	Usuario usuario;
	public boolean existeUsuario(Usuario usuario) {
	

		try {
			System.out.println("Entrei");
			 manager.createQuery("Select c from usuario where login = c and senha = c")
			.setParameter(1, usuario.getLogin())
			.setParameter(2, usuario.getSenha())
			.getResultList();
			 
			 boolean encontrado = true;
					
			return encontrado;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}
