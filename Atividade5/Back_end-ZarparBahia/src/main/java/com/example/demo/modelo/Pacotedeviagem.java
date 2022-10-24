package com.example.demo.modelo;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pacotedeviagem")
public class Pacotedeviagem {
	 @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String  idviagem ;
	 @Column(name="_Nomepacote")
	private String Nomepacote;
	 @Column(name="_Valordopacote")
	private String Valordopacote;
	 @Column(name="_Datainicio")
	private String Datainicio ;
	 @Column(name="_Destino")
	private String Destino;
	 @Column(name="_Origem")
	private String Origem ;
	 @Column(name="_Pagamento")
	private String Pagamento;
	
	

public Pacotedeviagem (String idviagem, String nomepacote,String valordopacote,String datainicio,String destino, String origem,String pagamento) {
	super();
	this.idviagem = idviagem;
	this.Nomepacote = nomepacote;
	this.Valordopacote = valordopacote;
	this.Datainicio = datainicio;
	this.Destino = destino;
	this.Origem =origem;
	this.Pagamento = pagamento;}
	
	
	
	public String getIdviagem() {
		return idviagem;
	}
	public void setIdviagem(String idviagem) {
		this.idviagem = idviagem;
	}
	public String getNomepacote() {
		return Nomepacote;
	}
	public void setNomepacote(String nomepacote) {
		Nomepacote = nomepacote;
	}
	public String getValordopacote() {
		return Valordopacote;
	}
	public void setValordopacote(String valordopacote) {
		Valordopacote = valordopacote;
	}
	public String getDatainicio() {
		return Datainicio;
	}
	public void setDatainicio(String datainicio) {
		Datainicio = datainicio;
	}
	public String getDestino() {
		return Destino;
	}
	public void setDestino(String destino) {
		Destino = destino;
	}
	public String getOrigem() {
		return Origem;
	}
	public void setOrigem(String origem) {
		Origem = origem;
	}
	public String getPagamento() {
		return Pagamento;
	}
	public void setPagamento(String pagamento) {
		Pagamento = pagamento;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idviagem);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pacotedeviagem other = (Pacotedeviagem) obj;
		return Objects.equals(idviagem, other.idviagem);
	}
	
}
