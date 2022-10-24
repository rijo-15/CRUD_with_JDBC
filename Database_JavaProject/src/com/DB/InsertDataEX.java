package com.DB;

import java.sql.*;

public class InsertDataEX {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url ="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome@123"); 
			PreparedStatement psmt = con.prepareStatement("INSERT INTO emp values(?,?,?)");
			psmt.setInt(1, 2);
			psmt.setString(2, "Tom");
			psmt.setString(3, "tom@gamil.com");
			
			int i = psmt.executeUpdate();
			
			System.out.println(i + " Record inserted successfully");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
