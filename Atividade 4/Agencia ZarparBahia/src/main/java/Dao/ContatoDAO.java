package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Contato;




public class ContatoDAO {
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/zarparbahia";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "xxxxxxxx";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private Connection conectar() throws ClassNotFoundException {
		Connection con = null;	
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	public void inserirCliente(Contato contato) {
		//Criar um objeto para receber o camando em SQL
		String sql = "insert into contato (nome,nascimento,cpf,cep,celular,email,senha) values (?,?,?,?,?,?,?)";		
		try {
			//Abrir a conex�o com o BD
			Connection con = conectar();
			//Criar um stattement
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1,contato.getNome());
			stm.setString(2,contato.getNascimento());
			stm.setString(3,contato.getCpf());
			stm.setString(4,contato.getCep());
			stm.setString(5,contato.getCelular());
			stm.setString(6,contato.getEmail());
			stm.setString(7,contato.getSenha());
			//Executar a Query
			stm.execute();
			//Fechar a conex�o com o BD
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
	
	
    public ArrayList<Contato>	listarClientes() {
    	//Criar a lista de clientes com os dados dos clientes
    	ArrayList<Contato> contatos = new ArrayList<>();
    	
    	//Criar um objeto para receber o camando em SQL
    	String sql = "select * from contato order by nome";
    	try {
    		//Abrir a conex�o com o BD
    		Connection con = conectar();
    		//Criar o statement
    		PreparedStatement stm = con.prepareStatement(sql);
    		ResultSet result = stm.executeQuery();
    		//Preencher os dados da lista clientes
    		while (result.next()) {
    			String idcadastro = result.getString(1);
    			String nome = result.getString(2);
    			String nascimento = result.getString(3);
    			String cpf = result.getString(4);
    			String cep = result.getString(5);
    			String celular = result.getString(6);
    			String email = result.getString(7);
    			String senha = result.getString(8);
    			
    			contatos.add(new Contato (idcadastro,nome,nascimento,cpf, cep, celular, email, senha));
    		}
    		//Fechar a conex�o com o BD
    		con.close();
    		return contatos;
    	} catch (Exception e) {
    		System.out.println(e);
    		return null;
    	}
    	
    }
    
    public void selecionarCliente(Contato contato) {
    	//Criar um objeto para receber o camando em SQL
    	String sql = "select * from contato where idcadastro = ?";
    	
    	try {
    		//Abrir a conex o com o BD
    		Connection con = conectar();
    		//Criar statement
    		PreparedStatement stm = con.prepareStatement(sql);
    		stm.setString(1, contato.getIdcadastro());
    		//Executar o statement
    		ResultSet result = stm.executeQuery();
    		//Preencher os dados do cliente
    		while (result.next()) {
    			contato.setIdcadastro(result.getString(1));
    			contato.setNome(result.getString(2));
    			contato.setNascimento(result.getString(3));
    			contato.setCpf(result.getString(4));
    			contato.setCep(result.getString(5));
    			contato.setCelular(result.getString(6));
    			contato.setEmail(result.getString(7));
    			contato.setSenha(result.getString(8));
    		}
    		con.close();
    	} catch (Exception e) {
    		System.out.println(e);
    	}
    }

    public void alterarCliente(Contato contato) {
    	//Criar um objeto para receber o camando em SQL
    	String sql = "update contato set nome=?,nascimento=?,cpf=?,cep=?,celular=?,email=?,senha=? where idcadastro=?";
    	
    	try {
    		//Abrir a conex�o com o BD
    		Connection con = conectar();
    		//Criar statement
    		PreparedStatement stm = con.prepareStatement(sql);
    		stm.setString(1,contato.getNome());
			stm.setString(2,contato.getNascimento());
			stm.setString(3,contato.getCpf());
			stm.setString(4,contato.getCep());
			stm.setString(5,contato.getCelular());
			stm.setString(6,contato.getEmail());
			stm.setString(7,contato.getSenha());
			stm.setString(8,contato.getIdcadastro());
    		//Executar o statement
    		stm.executeUpdate();
    		//Fechar a conex�o
    		con.close();
    	} catch (Exception e) {
    		System.out.println(e);
    	}
    }
    
	public void deletarCliente(Contato contato) {
		// Criar o objeto que vai receber o comando em SQL
		String sql = "delete from contato where idcadastro=?";		
		try {
			// Abrir uma conex�o com o BD
			Connection con = conectar();
			//Criar o statement 
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, contato.getIdcadastro());
			//Executar o statement
			stm.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}



}
