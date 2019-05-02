package br.com.monitora.conta.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.monitora.conta.modelo.Conta;

@Repository
public class ContaDao {
	private static final int Conta = 0;
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
	//testar um sys para ver o q ele pegar;
	public Conta findOne(Integer id) {
		return manager.find(Conta.class, id);
	}
	public List<Conta> altera(Integer id) {
		List<Conta> conta;
		javax.persistence.Query query = manager.createQuery("select c from Conta as c where c.id = :paramId");
		conta = (List<br.com.monitora.conta.modelo.Conta>) query.setParameter("paramId", id);
		
		return conta;
	}
	


}
