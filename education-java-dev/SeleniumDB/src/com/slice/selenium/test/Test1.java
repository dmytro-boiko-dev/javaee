package com.slice.selenium.test;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Test1 {

	public static void main(String[] args) {

		
		

		Connection conn = null;
		Connection connEtalon = null;
		
		String url = "jdbc:mysql://localhost:3306/";
		String databaseMtmdb5 = "mtmdb5";
		String databaseEtalon = "etalon";
		String username = "root";
		String password = "root";
		

		try{
			// connect
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url+databaseMtmdb5, username, password);

			String sqlTotal = new String(Files.readAllBytes(Paths.get("")), StandardCharsets.UTF_8);
			//Statement statement = conn.createStatement();
			CallableStatement statement = conn.prepareCall( "call multi_query()" ); 
			
			ResultSet result = statement.executeQuery(sqlTotal);
			

			result.next();
			System.out.println("------------ mtmdb5 -----------");
			System.out.println(result.getString("count(1)"));

			
	//etalon
			connEtalon = DriverManager.getConnection(url+databaseEtalon, username, password);
			
			String sqlQuerryEtalon = "select * from((select count(1) from etalon.aggr_bbx_day)) t";
			Statement statementEtalon = connEtalon.createStatement();
			ResultSet resultEtalon = statementEtalon.executeQuery(sqlQuerryEtalon);
			
			resultEtalon.next();
			System.out.println("------------ etalon -----------");
			System.out.println(resultEtalon.getString("count(1)"));
			
					
			
	//testing
			if(!result.getString("count(1)").equals(resultEtalon.getString("count(1)"))){
				System.out.println("------------ test result -----------");
				System.out.println("Incorrect count");
			}

		}
		
	
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			if(conn!=null){
				conn = null;
			}
		}
		
	}


}
