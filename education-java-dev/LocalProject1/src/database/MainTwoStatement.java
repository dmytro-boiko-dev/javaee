package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

public class MainTwoStatement {
	
	private static final String URL = "jdbc:mysql://localhost:3306/java_test_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	public static void main(String... args){
		
		
		
		try{
			Driver driver = new FabricMySQLDriver();
			DriverManager.registerDriver(driver);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//if connection inside TRY - not needed to close it manually
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement statement = connection.createStatement();){
			 
		
			//statement.execute("INSERT INTO animals (animal_name,animal_description) VALUES('Betch','FullMetalBetch!')");
			//int res = statement.executeUpdate("UPDATE animals SET animal_name='New Betch' WHERE id=1;");
			//ResultSet res = statement.executeQuery("SELECT * FROM animals;");
			
			statement.addBatch("DELETE FROM animals WHERE id > 3");
			statement.addBatch("DELETE FROM animals WHERE id = 2");
			//statement.addBatch("INSERT INTO animals (animal_name,animal_description) VALUES('Betch2','Some shit 2');");
			//statement.addBatch("INSERT INTO animals (animal_name,animal_description) VALUES('Betch3','Some shit 3');");
			
			statement.executeBatch();
			statement.clearBatch();
			
			boolean status = statement.isClosed();
			
			System.out.println(status);
			
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		
	}

}
