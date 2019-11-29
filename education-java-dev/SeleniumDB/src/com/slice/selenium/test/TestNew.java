package com.slice.selenium.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class TestNew {
	
	static {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Test
	public void test1() {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtmdb5","root","root")) {
			try (Statement statement = connection.createStatement()) {
				try (ResultSet resultSet = statement.executeQuery("select * from `dates_dim` limit 10")) {
					while (resultSet.next()) {
						Map<String, Object> row = getRow(resultSet);
						//System.out.println(row.get("date_id") + " (" + row.get("date_id").getClass().getName() + ")");
						System.out.println(row.get("date_id") + " | " + row.get("date") + " | " + row.get("day" + " |"));
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private Map<String, Object> getRow(ResultSet resultSet) {
		try {
			Map<String, Object> row = new LinkedHashMap<>();
			ResultSetMetaData metaData = resultSet.getMetaData();
			int columnCount = metaData.getColumnCount();
			for (int i = 1; i <= columnCount; i++) {
				row.put(metaData.getColumnName(i), resultSet.getObject(i));
			}
			return row;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
