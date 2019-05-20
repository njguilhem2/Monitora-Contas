package br.com.monitora.conta.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Conta {
	
	
	@Id
	@GeneratedValue
	private Integer id;
	@NotEmpty
	private String nome;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotEmpty
	private String vencimento;
	@Digits(integer=5, fraction=2)
	@Column(name = "weight")
	@NotEmpty
	private BigDecimal valor;
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
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	/**
     * @deprecated hibernate only
     */
    public Conta() {

    }
}
