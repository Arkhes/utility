package com.database.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseConnectivity {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/j2ee_db";
		String query = "INSERT INTO student_info VALUES (?,?,?,?)";
		Properties prop = new Properties();
		try (FileReader fr = new FileReader("config/db.properties")) {
			// 1. load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			prop.load(fr);
			// "2.establish connection and 3.statement creation"
			try (Connection con = DriverManager.getConnection(url, prop);
			PreparedStatement ps = con.prepareStatement(query)) {
				ps.setInt(1, 1011);
				ps.setString(2,"d");
				ps.setString(3,"d");
				ps.setString(4,"d");
				ps.addBatch();
				ps.setInt(1, 1012);
				ps.setString(2,"d");
				ps.setString(3,"d");
				ps.setString(4,"d");
				ps.addBatch();
				ps.setInt(1, 1013);
				ps.setString(2,"d");
				ps.setString(3,"d");
				ps.setString(4,"d");
				ps.addBatch();
				int []x = ps.executeBatch();
				for(int i=0;i<x.length;i++) {
					System.out.println(x[i]);
				}
			}
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}