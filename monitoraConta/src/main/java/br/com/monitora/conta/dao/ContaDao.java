package br.com.monitora.conta.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.monitora.conta.modelo.Conta;

@Repository
public class ContaDao {
	
	@PersistenceContext
	EntityManager manager;
	private Conta conta;

	public void salva(Conta conta) {
		manager.persist(conta);
	}

	public void delete(Integer id) {

		manager.remove(findOne(id));
		
	}

	public List<Conta> lista() {
		return manager.createQuery("select c from Conta c", Conta.class).getResultList();

	}
	
	public Conta findOne(Integer id) {
	  return manager.find(Conta.class, id);
	}
	public void alterar(Conta conta) {
			 manager.merge(conta);
	}

}
	



