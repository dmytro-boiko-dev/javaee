package database.resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {
	
	private final String HOST = "jdbc:mysql://localhost:3306/java_test_db";
	private final String USERNAME = "root";
	private final String PASSWORD = "root";
	
	private Connection connection;
	
	public DBWorker() {
		try {
			connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}
}
