package br.com.monitora.conta.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Permissao implements GrantedAuthority{
	
	@Id
	private String nome;
	
	
	public Permissao(String nome) {
		this.nome = nome;
	}
	
	/*
	 * @deprecated hibernate only
	 */
	public Permissao() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getAuthority() {
		
		return nome;
	}
	
}
