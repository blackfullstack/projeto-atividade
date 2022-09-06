package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





import javacrudzarparbahia.MySqlConnection;
import model.Contato;

public class ContatoDao implements CRUD {
	
	private static Connection connection = MySqlConnection.createconnection();
	private static String sql;
	
	public static void create(Contato contato) {
		sql = "INSERT INTO contato VALUES (null,?,?,?,?,?,?,?)";
		
		try { PreparedStatement preparedStatement = connection.prepareStatement(sql);
		  preparedStatement.setString(1,contato.getNome());
		  preparedStatement.setString(2,contato.getNascimento());
		  preparedStatement.setString(3,contato.getCpf());
		  preparedStatement.setString(4,contato.getCep());
		  preparedStatement.setString(5, contato.getCelular());
		  preparedStatement.setString(6, contato.getEmail());
		  preparedStatement.setString(7, contato.getSenha());
		  
		  preparedStatement.execute();
		  
		  System.out.println("--inseriu os dados");
		
		}catch(SQLException e){
			System.out.println("--inseriu os dadose" + e.getMessage() );
			
			
		}
		
		
	};
	
	 public static void delete(int idcadastro) {
		 sql = "DELETE FROM contato WHERE idcadastro = ?";
		 try{
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
		 preparedStatement.setInt(1, idcadastro);
		 preparedStatement.executeUpdate();
		 
		 System.out.println("--correto o delete " );
		 }catch(SQLException e) {
			 System.out.println("--incorreto delete" + e.getMessage() );
			 
		 }
		
	};
	
	public static  List<Contato>find(String pesquisa){
		 
		sql = String.format("SELECT * FROM contato WHERE nome like '%s%%' OR cpf LIKE '%s%%' ", pesquisa, pesquisa);
		List<Contato> contatos = new ArrayList<Contato>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
	         while (resultSet.next()){
	        	 
	        	Contato contato = new Contato();
	        	 
	        	contato.setIdcadastro(resultSet.getInt("idcadastro"));
	        	contato.setNome(resultSet.getString("nome"));
	        	contato.setNascimento(resultSet.getString("nascimento"));
	        	contato.setCpf(resultSet.getString("cpf"));
	        	contato.setCep(resultSet.getString("cep"));
	        	contato.setCelular(resultSet.getString("celular"));
	        	contato.setEmail(resultSet.getString("email"));
	        	contato.setSenha(resultSet.getString("senha"));
	        	
	        	contatos.add(contato);
	        			 		 
	         }
	          System.out.println("---correto find contato");
	          return contatos;
		}catch(SQLException e) {
			System.out.println("---incorreto find contato" + e.getMessage());
		return null;
		}
		}
	
	public static  Contato findbyPk(int idcadastro) {
		sql = String.format("SELECT * FROM contato WHERE idcadastro = %d",idcadastro);
		
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Contato contato = new Contato();
			
	         while (resultSet.next()){
	        	 
	        	
	        	 
	        	contato.setIdcadastro(resultSet.getInt("idcadastro"));
	        	contato.setNome(resultSet.getString("nome"));
	        	contato.setNascimento(resultSet.getString("nascimento"));
	        	contato.setCpf(resultSet.getString("cpf"));
	        	contato.setCep(resultSet.getString("cep"));
	        	contato.setCelular(resultSet.getString("celular"));
	        	contato.setEmail(resultSet.getString("email"));
	        	contato.setSenha(resultSet.getString("senha"));
	        	
	        	
	        			 		 
	         }
	          System.out.println("---correto find contato");
	          return contato;
		}catch(SQLException e) {
			System.out.println("---incorreto find contato" + e.getMessage());
		return null;
		}
		
		
	}
	
	public static  void update (Contato contato) {
  sql = "UPDATE   contato SET nome=?, nascimento=?, cpf=?, cep=?, celular=?, email=?, senha=? WHERE idcadastro=?";
		
		try { 
		 PreparedStatement preparedStatement = connection.prepareStatement(sql);
		 
		  preparedStatement.setString(1,contato.getNome());
		  preparedStatement.setString(2,contato.getNascimento());
		  preparedStatement.setString(3,contato.getCpf());
		  preparedStatement.setString(4,contato.getCep());
		  preparedStatement.setString(5, contato.getCelular());
		  preparedStatement.setString(6, contato.getEmail());
		  preparedStatement.setString(7, contato.getSenha());
		  preparedStatement.setInt(8, contato.getIdcadastro());
		  
		
		  preparedStatement.executeUpdate();
		  
		  System.out.println("--correto update os dados");
		
		}catch(SQLException e){
			System.out.println("--incorreto update dados" + e.getMessage() );
			
				
	}
	}
	}
		
		
	


