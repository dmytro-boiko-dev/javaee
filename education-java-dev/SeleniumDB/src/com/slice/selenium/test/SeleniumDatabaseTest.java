package com.slice.selenium.test;

import java.sql.*;

public class SeleniumDatabaseTest {

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

			
			//query execution
			String sqlQuerry = "SELECT * FROM fact_message_history WHERE message_history_id = 2309110420";
			//String sqlTotal = "select * from((select count(1) from mtmdb5.aggr_bbx_day)) t";
			Statement statement = conn.createStatement();
			//CallableStatement statement = conn.prepareCall( "call multi_query()" ); 
			
			ResultSet result = statement.executeQuery(sqlQuerry);
			//result2 = statement.executeQuery(sqlTotal);
			
			
			//show results mtmdb5
			result.next();
			System.out.println("------------ mtmdb5 -----------");
			System.out.println(result.getString("param1"));
			System.out.println(result.getString("sent_date"));
			System.out.println(result.getString("from_addr"));
			System.out.println(result.getString("passed_template_id"));
			//System.out.println(result2.getString("count(1)")); // new

			
	//etalon
			connEtalon = DriverManager.getConnection(url+databaseEtalon, username, password);
			
			String sqlQuerryEtalon = "SELECT * FROM fact_message_history WHERE message_history_id = 2309110420";
			Statement statementEtalon = connEtalon.createStatement();
			ResultSet resultEtalon = statementEtalon.executeQuery(sqlQuerryEtalon);
			
			resultEtalon.next();
			System.out.println("------------ etalon -----------");
			System.out.println(resultEtalon.getString("param1"));
			System.out.println(resultEtalon.getString("sent_date"));
			System.out.println(resultEtalon.getString("from_addr"));
			System.out.println(resultEtalon.getString("passed_template_id"));
			
			
			
	//testing
			if(!result.getString("from_addr").equals(resultEtalon.getString("from_addr"))){
				
				System.out.println("------------ test result -----------");
				System.out.println("Incorrect from_addr");
			}
				
				
				
				
		}  // end try
		
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			if(conn!=null){
				conn = null;
			}
		}
		
	} //end main

}
