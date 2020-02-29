package com.database.jdbc;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseInfo {
	public static void main(String[] args) throws ClassNotFoundException {
	String url = 	"jdbc:mysql://localhost:3306/j2ee_db";
Class.forName("com.mysql.cj.jdbc.Driver");
try(Connection con = DriverManager.getConnection(url, "root", "root");){
	DatabaseMetaData md =con.getMetaData();
	System.out.println("url "+md.getURL());
	System.out.println("version "+md.getDatabaseMajorVersion());
	System.out.println("product Name "+md.getDatabaseProductName() );
	System.out.println("product minor "+md.getDriverMinorVersion());
	System.out.println(md.getDatabaseProductVersion());
	System.out.println(md.getDriverName());
} catch (SQLException e) {
	e.printStackTrace();
}}}
