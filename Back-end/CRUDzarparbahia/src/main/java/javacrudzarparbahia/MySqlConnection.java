package javacrudzarparbahia;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class MySqlConnection {
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/zarparbahia";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "xxxx";
	
	public static Connection createconnection()  {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found");
			
		}catch(ClassNotFoundException e) {
		System.out.println("Driver not found" + e.getLocalizedMessage());	
				
		}
		try { 
			Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
		System.out.println("connected to database");
        return connection;
			}catch(SQLException e) {
			System.out.println("Not connected to database");
            return null;
		} 
	
		}

	
}


