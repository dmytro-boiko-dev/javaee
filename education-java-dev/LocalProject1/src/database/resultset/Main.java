package database.resultset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String... args){
		DBWorker worker = new DBWorker();
		
		String query = "select * from users;";
		
		try {
			Statement statement = worker.getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next()){
				
				User user = new User();
				
			//simple implementation
				//int id = resultSet.getInt(1);
				//String name = resultSet.getString(2);
				
			//access by column ID
				/*
				user.setId(resultSet.getInt(1));
				user.setUsername(resultSet.getString(2));
				user.setPassword(resultSet.getString(3));
				*/
				
			//access by column name
				user.setId(resultSet.getInt("id"));
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("userpassword"));
				
				System.out.println(user);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
