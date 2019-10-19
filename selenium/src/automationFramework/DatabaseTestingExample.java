package automationFramework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTestingExample {

	public static void main(String[] args) {
		 String dbClass = "com.mysql.jdbc.Driver";
		 try {
			 
			Class.forName(dbClass).newInstance();
			
			// Get connection to DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capp_db", "admin", "admin");
			
			Statement st = con.createStatement();con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                    ResultSet.CONCUR_UPDATABLE);  
			ResultSet rs =  st.executeQuery("SELECT * FROM USER where name like 'A%' ");
			while (rs.next()) {
				System.out.println("Name : " + rs.getString("name"));
				System.out.println("Phone Number : " + rs.getString("phone"));
				
		 }

			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
