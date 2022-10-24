package com.DB;
  
import java.sql.*;

public class JDBCExample1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MYSQL Driver");
			String url ="jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "welcome123");
			 Statement st= con.createStatement(); 
			ResultSet rs = st.executeQuery("SELECT * FROM complain_tbl");
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) +" " +  rs.getString(3) + " " +
			     rs.getString(4) +" " +  rs.getString(5) + " " + rs.getString(6));
			}
			
			System.out.println("Get Connected");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
