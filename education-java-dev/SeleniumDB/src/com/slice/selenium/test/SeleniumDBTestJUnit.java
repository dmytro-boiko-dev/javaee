package com.slice.selenium.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;
import static org.junit.Assert.*;

public class SeleniumDBTestJUnit {
	

	@Test
	public void testTotalCounts() {

		
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

			String sqlTotal = "select * from((select count(1) from mtmdb5.aggr_bbx_day)) t";
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
				
	//JUnit new code
			assertEquals(result.getString("count(1)"), equals(resultEtalon.getString("count(1)")));

				
		} //try
		
		
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			if(conn!=null){
				conn = null;
			}
		}
		
	} //@test end

	
	@Test
	public void testDataQuality() {
		

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
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery(sqlQuerry);
			
			
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
				
	//JUnit
				assertEquals(result.getString("from_addr"), resultEtalon.getString("from_addr"));
				
				
				
		}  // end try
		
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			if(conn!=null){
				conn = null;
			}
		}
	} //end @test
	
	
}
