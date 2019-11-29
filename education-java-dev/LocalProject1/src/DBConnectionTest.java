import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DBConnectionTest {

	public static void main(String[] args) throws Exception{

		createTable();
		//insert();
		List<String> select = select();
		System.out.println("----------------------------");
		String collect = select.stream().collect(Collectors.joining(System.lineSeparator()));
		System.out.println(collect);
		System.out.println("----------------------------");
	}
	
	public static List<String> select() throws Exception {
		try{
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT name,lastname FROM test_table ");
			
			ResultSet result = statement.executeQuery();
			
			List<String> array1 = new LinkedList<String>();
			while(result.next()){
				/*
				System.out.print(result.getString("name"));
				System.out.print(" ");
				System.out.println(result.getString("lastname"));
				*/
				
				array1.add(result.getString("name") + " " + result.getString("lastname"));
				
			}
			//System.out.println("Fuck The Police - SELECT EXECUTED");
			return array1;
			
			
		}catch(Exception e){System.out.println(e);}
		return null;
		
	}
	
	public static void insert() throws Exception{
		final String name1 = "Joe";
		final String name2 = "Dou";
		
		try{
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement("INSERT INTO test_table (name, lastname) VALUES ('"+name1+"', '"+name2+"')");
			insert.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		finally{System.out.println("Insert successfull.");}
	}
	
	
	public static void createTable() throws Exception{
		try{
			Connection con = getConnection();
			//System.out.println("Database 'java_dev_db' is using.");
			
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS test_table("
					+ "id int NOT NULL AUTO_INCREMENT, name varchar(255), lastname varchar(255), PRIMARY KEY(id))");
			create.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		
		//finally{System.out.println("Table created successfully.");}
	} 
	
	public static Connection getConnection() throws Exception{
		try{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/java_dev_db";
			String username = "root";
			String password = "root";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			//System.out.println("Connected.");
			return conn;
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
		return null;
	}

}
