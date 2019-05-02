package br.com.monitora.conta.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Conta {
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String vencimento;
	private double valor;
	private boolean pago;

	public Conta(Integer id){
		this.id = id;
	}
	  public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	/**
     * @deprecated hibernate only
     */
    public Conta() {

    }
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getVencimento() {
		return vencimento;
	}
	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
