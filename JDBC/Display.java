package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Display {

	public void display() {
		Connection c = null;
		Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/houseboat", "postgres", "manky");
	         
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM Houseboat ;" );
	         while ( rs.next() ) {
	        	 String Boat_id = rs.getInt("Boat_id");
	            String Boat_name = rs.getString("Boat_name");
	            int Capacity = rs.getInt("Capacity");
	            System.out.println( "Boat_id = " + Boat_id );
	            System.out.println( "Boat_name = " + Boat_name);
	            System.out.println( "Capacity = " + Capacity );
	            System.out.println();
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Operation Done successfully");
		
	}
	public void display1() {
		Connection c = null;
		Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/houseboat", "postgres", "manky");
	         
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM Owner ;" );
	         while ( rs.next() ) {
	        	 String Owner_id = rs.getInt("Owner_id");
	            String Boat_id = rs.getInt("Boat_id");
	            String First_name = rs.getString("First_name");
	            String Last_name = rs.getString("Last_name");
	            String City = rs.getString("City");
	            int Number_of_boat = rs.getInt("Number_of_boat");
	            system.out.println( "Owner_id = " + Owner_id );
	            System.out.println( "Boat_id = " + Boat_id );
	            System.out.println( "First_name = " + First_name);
	            System.out.println( "Last_name = " + Last_name);
	            System.out.println( "Last_name = " + Last_name);
	            System.out.println( "City = " + City );
	            System.out.println( "Number_of_boat = " + Number_of_boat );
	            System.out.println();
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Operation Done successfully");
		
	}
	public void display() {
		Connection c = null;
		Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Houseboat", "postgres", "ananthan");
	         
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM Date ;" );
	         while ( rs.next() ) {
	        	 
	            String Boat_id = rs.getInt("Boat_id");
	            date From_date = rs.getdate("From_date");
	            date To_date = rs.getdate("To_date");
	            int days = rs.getInt("days");
	            System.out.println( "Boat_id = " + Boat_id );
	            System.out.println( "From_date = " + From_date);
	            System.out.println( "To_date = " + To_date);
	           
	            System.out.println( "days = " + days );
	            System.out.println();
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Operation Done successfully");
		
	}
	

	public void display() {
		Connection c = null;
		Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Houseboat", "postgres", "ananthan");
	         
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM Services ;" );
	         while ( rs.next() ) {
	            String Boat_id = rs.getInt("Boat_id");
	            String Service_type = rs.getString("Service_type");
	            int Rate = rs.getInt("Rate");
	            bool Payment_Status = rs.getbool("Payment_Status");
	            int Payment_Amount = rs.getInt("Payment_Amount");
	     
	            System.out.println( "Boat_id = " + Boat_id );
	            System.out.println( "Service_type = " + Service_type);
	            System.out.println( "Rate = " + Rate);
	            System.out.println( "Payment_Status = " + Payment_Status);
	            System.out.println( "City = " + City );
	            System.out.println( "Payment_Amount = " + Payment_Amount );
	            System.out.println();
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Operation Done successfully");
		
	}
	
	
	

	public void display() {
		Connection c = null;
		Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Houseboat", "postgres", "ananthan");
	         
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM Customer  ;" );
	         while ( rs.next() ) {
	        	 String Customer_id = rs.getInt("Customer_id ");
	            String Boat_id = rs.getInt("Boat_id");
	            String First_name = rs.getString("First_name");
	            String Last_name = rs.getString("Last_name");
	            int Phone_Number = rs.getInt("Phone_Number");
	            String Customer_city = rs.getString("Customer_city");
	            System.out.println( "Customer_id = " + Customer_id );
	            System.out.println( "Boat_id = " + Boat_id );
	            System.out.println( "First_name = " + First_name);
	            System.out.println( "Last_name = " + Last_name);
	            System.out.println( "Phone_Number = " + Phone_Number );
	            System.out.println( "Customer_city = " + Customer_city );
	            System.out.println();
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Operation Done successfully");
		
	}
	
}