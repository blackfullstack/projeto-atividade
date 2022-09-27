package Dao;
import java.sql.ResultSet;
import model.Pacotedeviagem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacotedeviagemDAO {
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
	
	public void inserirCliente(Pacotedeviagem  pacotedeviagem) {
		//Criar um objeto para receber o camando em SQL
		String sql = "insert into pacotedeviagem (nomepacote,valordopacote,datainicio,destino,origem,pagamento) values (?,?,?,?,?,?)";		
		try {
			//Abrir a conex�o com o BD
			Connection con = conectar();
			//Criar um stattement
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1,pacotedeviagem.getNomepacote());
			stm.setString(2,pacotedeviagem.getValordopacote());
			stm.setString(3,pacotedeviagem.getDatainicio());
			stm.setString(4,pacotedeviagem.getDestino());
			stm.setString(5,pacotedeviagem.getOrigem());
			stm.setString(6, pacotedeviagem.getPagamento());
			
			//Executar a Query
			stm.execute();
			//Fechar a conex o com o BD
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
	
	



	public ArrayList<Pacotedeviagem>	listarClientes() {
    	//Criar a lista de clientes com os dados dos clientes
    	ArrayList<Pacotedeviagem> pacotedeviagens = new ArrayList<>();
    	
    	//Criar um objeto para receber o camando em SQL
    	String sql = "select * from pacotedeviagem order by nomepacote";
    	try {
    		//Abrir a conex o com o BD
    		Connection con = conectar();
    		//Criar o statement
    		PreparedStatement stm = con.prepareStatement(sql);
    		ResultSet result = stm.executeQuery();
    		//Preencher os dados da lista clientes
    		while (result.next()) {
    			String idviagem = result.getString(1);
    			String nomepacote = result.getString(2);
    			String valordopacote = result.getString(3);
    			String datainicio = result.getString(4);
    			String destino= result.getString(5);
    			String origem = result.getString(6);
    			String pagamento = result.getString(7);
    			
    			
    			pacotedeviagens.add(new Pacotedeviagem (idviagem,nomepacote,valordopacote,datainicio, destino, origem, pagamento));
    		}
    		//Fechar a conex o com o BD
    		con.close();
    		return pacotedeviagens;
    	} catch (Exception e) {
    		System.out.println(e);
    		return null;
    	}
    	
    }
    
    public void selecionarCliente(Pacotedeviagem pacotedeviagem) {
    	//Criar um objeto para receber o camando em SQL
    	String sql = "select * from pacotedeviagem where idviagem = ?";
    	
    	try {
    		//Abrir a conex o com o BD
    		Connection con = conectar();
    		//Criar statement
    		PreparedStatement stm = con.prepareStatement(sql);
    		stm.setString(1, pacotedeviagem.getIdviagem());
    		//Executar o statement
    		ResultSet result = stm.executeQuery();
    		//Preencher os dados do cliente
    		while (result.next()) {
    			pacotedeviagem.setIdviagem(result.getString(1));
    			pacotedeviagem.setNomepacote(result.getString(2));
    			pacotedeviagem.setValordopacote(result.getString(3));
    			pacotedeviagem.setDatainicio(result.getString(4));
    			pacotedeviagem.setDestino(result.getString(5));
    			pacotedeviagem.setOrigem(result.getString(6));
    			pacotedeviagem.setPagamento(result.getString(7));
    			
    		}
    		con.close();
    	} catch (Exception e) {
    		System.out.println(e);
    	}
    }

    public void alterarCliente(Pacotedeviagem pacotedeviagem) {
    	//Criar um objeto para receber o camando em SQL
    	String sql = "update pacotedeviagem set nomepacote=?,valordopacote=?,datainicio=?,destino=?,origem=?,pagamento=? where idviagem=?";
    	
    	try {
    		//Abrir a conex o com o BD
    		Connection con = conectar();
    		//Criar statement
    		PreparedStatement stm = con.prepareStatement(sql);
    		stm.setString(1,pacotedeviagem.getNomepacote());
			stm.setString(2,pacotedeviagem.getValordopacote());
			stm.setString(3,pacotedeviagem.getDatainicio());
			stm.setString(4,pacotedeviagem.getDestino());
			stm.setString(5,pacotedeviagem.getOrigem());
			stm.setString(6, pacotedeviagem.getPagamento());
			stm.setString(7,pacotedeviagem.getIdviagem());
    		//Executar o statement
    		stm.executeUpdate();
    		//Fechar a conex o
    		con.close();
    	} catch (Exception e) {
    		System.out.println(e);
    	}
    }
    
	public void deletarCliente(Pacotedeviagem pacotedeviagem) {
		// Criar o objeto que vai receber o comando em SQL
		String sql = "delete from pacotedeviagem where idviagem=?";		
		try {
			// Abrir uma conex o com o BD
			Connection con = conectar();
			//Criar o statement 
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, pacotedeviagem.getIdviagem());
			//Executar o statement
			stm.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	

}










	





