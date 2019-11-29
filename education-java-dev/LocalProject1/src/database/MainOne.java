package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.fabric.jdbc.FabricMySQLDriver;


public class MainOne {
	
	private static final String URL = "jdbc:mysql://localhost:3306/java_test_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	
	public static void main(String... args){
		Connection connection;
		
		try {
		Driver driver = new FabricMySQLDriver();
		DriverManager.registerDriver(driver);
		
		connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		//check if connection open
		if(!connection.isClosed()){
			System.out.println("Connection successful.");
		}
		
		//close connection and check
		connection.close();
		
		if(connection.isClosed()){
			System.out.println("Connection closed.");
		}
		
		} catch (SQLException e){
			e.printStackTrace();
		}
	}

}
