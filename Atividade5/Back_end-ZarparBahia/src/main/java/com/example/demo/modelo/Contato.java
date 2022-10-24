package com.example.demo.modelo;


	


	import java.util.Objects;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="contato")
	public class Contato {
		 @Id
		  @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private long idcadastro;
		 @Column(name="_nome")
		   private String nome;
		 @Column(name="nascimento_")
		   private String nascimento;
		 @Column(name="cpf")
		   private String cpf;
		 @Column(name="cep")
		   private String cep;
		 @Column(name="celular")
		   private String celular;
		 @Column(name="email")
		   private String email;
		 @Column(name="senha")
		   private String senha;
		 
		 @Override
		public int hashCode() {
			return Objects.hash(idcadastro);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contato other = (Contato) obj;
			return idcadastro == other.idcadastro;
		}

		public long getIdcadastro() {
			return idcadastro;
		}
		

		public Contato() {
		}
			 public Contato(Long idcadastro, String nome, String nascimento,String cpf,String cep,String celular, String email,String senha) {
					super();
					this.idcadastro = idcadastro;
					this.nome = nome;
					this.nascimento=nascimento;
					this.cpf = cpf;
					this.cep = cep;
					this.celular = celular;
					this.senha = senha;
					this.email = email;
					
		}


		public void setIdcadastro(long idcadastro) {
			this.idcadastro = idcadastro;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNascimento() {
			return nascimento;
		}
		public void setNascimento(String nascimento) {
			this.nascimento = nascimento;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getCelular() {
			return celular;
		}
		public void setCelular(String celular) {
			this.celular = celular;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
	}



