package com.DB;

import java.sql.*;

public class DeleteDataEX {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url ="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome@123"); 
			PreparedStatement psmt = con.prepareStatement("UPDATE emp SET email =? where empno =?");
			
			psmt.setString(1, "tom1@gmail.com");
			psmt.setInt(2, 2);

			
			
			
			int i = psmt.executeUpdate();
			
			System.out.println(i + " Record Updated successfully");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
