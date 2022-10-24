package com.example.demo.modelo;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="zarparbahia_login")

public class zarparbahia_login {
	private long identrar;
	 @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)

	public long getIdentrar() {
		return identrar;
	}

	public void setIdentrar(long identrar) {
		this.identrar = identrar;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identrar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		zarparbahia_login other = (zarparbahia_login) obj;
		return identrar == other.identrar;
	}


	
}


