package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javacrudzarparbahia.MySqlConnection;

import model.Pacotedeviagem;

public class PacotedeviagenDao implements CRUD1 {
	private static Connection connection = MySqlConnection.createconnection();
	private static String sql;

	
	public static void create(Pacotedeviagem pacotedeviagem) {
		sql = "INSERT INTO pacotedeviagem VALUES (null,?,?,?,?,?,?,?)";
		
		try { PreparedStatement preparedStatement = connection.prepareStatement(sql);
		  preparedStatement.setString(1,pacotedeviagem.getNomepacote());
		  preparedStatement.setString(2,pacotedeviagem.getValordopacote());
		  preparedStatement.setString(3,pacotedeviagem.getDatainicio());
		  preparedStatement.setString(4,pacotedeviagem.getDestino());
		  preparedStatement.setString(5,pacotedeviagem.getOrigem());
		  preparedStatement.setString(6, pacotedeviagem.getPagamento());
		 
		  
		  preparedStatement.execute();
		  
		  System.out.println("--inseriu os dados");
		
		}catch(SQLException e){
			System.out.println("--inseriu os dadose" + e.getMessage() );
			
			
		}
		
		
	};
	
	 public static void delete(int idviagem) {
		 sql = "DELETE FROM contato WHERE idviagem = ?";
		 try{
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
		 preparedStatement.setInt(1, idviagem);
		 preparedStatement.executeUpdate();
		 
		 System.out.println("--correto o delete " );
		 }catch(SQLException e) {
			 System.out.println("--incorreto delete" + e.getMessage() );
			 
		 }
		
	};
	
	public static  List<Pacotedeviagem>find(String pesquisa){
		 
		sql = String.format("SELECT * FROM pacotedeviagem WHERE nome like '%s%%' OR cpf LIKE '%s%%' ", pesquisa, pesquisa);
		List<Pacotedeviagem> pacotedeviagens = new ArrayList<Pacotedeviagem>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
	         while (resultSet.next()){
	        	 
	        	Pacotedeviagem pacotedeviagem1 = new Pacotedeviagem();
	        	 
	        	pacotedeviagem1.setIdviagem(resultSet.getInt("idviagem"));
	        	pacotedeviagem1.setNomepacote(resultSet.getString("nomepacote"));
	        	pacotedeviagem1.setValordopacote(resultSet.getString("valordopacote"));
	        	pacotedeviagem1.setDatainicio(resultSet.getString("Datainicio"));
	        	pacotedeviagem1.setDestino(resultSet.getString("Destino"));
	        	pacotedeviagem1.setOrigem(resultSet.getString("Origem"));
	        	pacotedeviagem1.setPagamento(resultSet.getString("Pagamento"));
	        
	        	
	        	pacotedeviagens.add(pacotedeviagem1);
	        			 		 
	         }
	          System.out.println("---pacotedeviagem find correto");
	          return pacotedeviagens;
		}catch(SQLException e) {
			System.out.println("---incorreto find pacotedeviagem" + e.getMessage());
		return null;
		}
		}
	
	public static  Pacotedeviagem findbyPk(int idviagem) {
		sql = String.format("SELECT * FROM contato WHERE idcadastro = %d",idviagem);
		
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			Pacotedeviagem pacotedeviagem = new Pacotedeviagem();
			
	         while (resultSet.next()){
	        	 
	        	
	        	 
	        	    pacotedeviagem.setIdviagem(resultSet.getInt("idviagem"));
		        	pacotedeviagem.setNomepacote(resultSet.getString("nomepacote"));
		        	pacotedeviagem.setValordopacote(resultSet.getString("valordopacote"));
		        	pacotedeviagem.setDatainicio(resultSet.getString("Datainicio"));
		        	pacotedeviagem.setDestino(resultSet.getString("Destino"));
		        	pacotedeviagem.setOrigem(resultSet.getString("Origem"));
		        	pacotedeviagem.setPagamento(resultSet.getString("Pagamento"));
	        	
	        	
	        			 		 
	         }
	          System.out.println("---correto find pacotedeviagem");
	          return pacotedeviagem;
		}catch(SQLException e) {
			System.out.println("---incorreto find pacotedeviagem" + e.getMessage());
		return null;
		}
		
		
	}
	
	public static  void update (Pacotedeviagem pacotedeviagem) {
  sql = "UPDATE   pacotedeviagem SET nomepacote=?, valordopacote=?, Datainicio=?, Destino=?, Origem=?, Pagamento WHERE idviagem=?";
		
		try { 
		 PreparedStatement preparedStatement = connection.prepareStatement(sql);
		 
		 
		  preparedStatement.setString(1,pacotedeviagem.getNomepacote());
		  preparedStatement.setString(2,pacotedeviagem.getValordopacote());
		  preparedStatement.setString(3,pacotedeviagem.getDatainicio());
		  preparedStatement.setString(4,pacotedeviagem.getDestino());
		  preparedStatement.setString(5,pacotedeviagem.getOrigem());
		  preparedStatement.setString(6, pacotedeviagem.getPagamento());
		 
		  
		 
		  preparedStatement.setInt(8,  pacotedeviagem.getIdviagem());
		  
		
		  preparedStatement.executeUpdate();
		  
		  System.out.println("--correto update os dados");
		
		}catch(SQLException e){
			System.out.println("--incorreto update dados" + e.getMessage() );
			
				
	}
	}
	}


