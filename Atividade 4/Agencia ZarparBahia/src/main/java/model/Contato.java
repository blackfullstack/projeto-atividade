package model;

public class Contato {
	 private String idcadastro;
	   private String nome;
	   private String nascimento;
	   private String cpf;
	   private String cep;
	   private String celular;
	   private String email;
	   private String senha;
	   public Contato() {
			super();
		}

	   public Contato(String idcadastro, String nome, String nascimento,String cpf,String cep,String celular, String email,String senha) {
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
	   
	  
	public String getIdcadastro() {
		return idcadastro;
	}
	public void setIdcadastro(String idcadastro) {
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
