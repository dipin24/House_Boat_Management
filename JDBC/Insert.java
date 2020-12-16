package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Insert {
public void insert(String Boat_id,String Boat_name,int Capacity) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/houseboat";
        String username = "postgres";
        String password = "manky";
        String sql1 = "insert into Houseboat values(?,?,?)";
    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        PreparedStatement stmt = conn.prepareStatement(sql1);) {
      stmt.setString(1, Boat_id);
      stmt.setString(2, Boat_name);
      stmt.setInt(5, capacity);
      stmt.executeUpdate();
      System.out.println();
    } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  
    public void insert(String Owner_id,String Boat_id,String First_name,String Last_name,String City,int Number_of_boat) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/houseboat";
        String username = "postgres";
        String password = "ananthan";
        String sql2 = "insert into Owner values(?,?,?,?,?,?)";
    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
    	        PreparedStatement stmt = conn.prepareStatement(sql2);) {
    	      stmt.setString(1, Owner_id);
    	      stmt.setString(2, Boat_id);
    	      stmt.setString(3, First_name);
    	      stmt.setString(4, Last_name);
    	      stmt.setString(5, City);
    	      stmt.setInt(6, Number_of_boat);
    	      stmt.executeUpdate();
    	      System.out.println();
    } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    public void insert(String Boat_id,date From_date,date To_date,int days) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/houseboat";
        String username = "postgres";
        String password = "ananthan";
        String sql3 = "insert into Date values(?,?,?,?)";
    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
    	    	        PreparedStatement stmt = conn.prepareStatement(sql3);) {
    	    	     
    	    	      stmt.setString(1, Boat_id);
    	    	      stmt.setdate(2, From_date);
    	    	      stmt.setdate(3, To_date);
    	    	      stmt.setInt(4, days);
    	    	      stmt.executeUpdate();
    	    	      System.out.println();
    } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    public void insert(String Boat_id,String Service_type,int Rate,bool Payment_Status,int Payment_Amount) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/houseboat";
        String username = "postgres";
        String password = "ananthan";
        String sql4 = "insert into Services values(?,?,?,?,?,?)";
    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
    	    	    	        PreparedStatement stmt = conn.prepareStatement(sql4);) {
    	    	    	     
    	    	    	      stmt.setString(1, Boat_id);
    	    	    	      stmt.setString(2, Service_type);
    	    	    	      stmt.setInt(3, Rate);
    	    	    	      stmt.setbool(4, Payment_Status); 
    	    	    	      stmt.setInt(4, Payment_Amount);
    	    	    	      stmt.executeUpdate();  
    	    	    	      System.out.println();
    } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    public void insert(String Customer_id,String Boat_id,String First_name,String Last_name,int Phone_number,String Customer_city) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/houseboat";
        String username = "postgres";
        String password = "ananthan";
        String sql5 = "insert into Customer values(?,?,?,?,?)";
    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
    	    	    	    	        PreparedStatement stmt = conn.prepareStatement(sql5);) {
    	    	    	    	     
    	    	    	    	      stmt.setString(1, Customer_id);
    	    	    	    	      stmt.setstring(2, Boat_id);
    	    	    	    	      stmt.setstring(3, First_name);
    	    	    	    	      stmt.setstring(4, Last_name);
    	    	    	    	      stmt.setInt(5, Phone_Number);
    	    	    	    	      stmt.setString(6, Customer_city);
    	    	    	    	      stmt.executeUpdate();      
      System.out.println();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
