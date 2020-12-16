package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Delete {

	  public void delete(int Boat_id) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/Houseboat";
        String username = "postgres";
        String password = "manky";
        String sql1 = " delete from Houseboat where Boat_id=?";
    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        PreparedStatement stmt = conn.prepareStatement(sql1);) {
      stmt.setLong(1, Boat_id);
      stmt.executeUpdate();
      System.out.println();
    } catch (SQLException e) {
        e.printStackTrace();
      }
    }

	  public void delete3(int Boat_id) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/Houseboat";
        String username = "postgres";
        String password = "manky";
        String sql2 = " delete from Owner where Boat_id=?";
    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        PreparedStatement stmt = conn.prepareStatement(sql2);) {
      stmt.setLong(1, Boat_id);
      stmt.executeUpdate();
      System.out.println();
    } catch (SQLException e) {
        e.printStackTrace();
      }
    }

	  	  public void delete2(int Boat_id) {
	          String jdbcUrl = "jdbc:postgresql://localhost:5432/Houseboat";
	          String username = "postgres";
	          String password = "manky";
	          String sql3 = " delete from Date where Boat_id=?";
	      try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
	          PreparedStatement stmt = conn.prepareStatement(sql3);) {
	        stmt.setLong(1, Boat_id);
	        stmt.executeUpdate();
	        System.out.println();
	      } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	    
	  	  
	  	 public void delete11(int Boat_id) {
	          String jdbcUrl = "jdbc:postgresql://localhost:5432/Houseboat";
	          String username = "postgres";
	          String password = "ananthan";
	          String sql4 = " delete from Services where Boat_id=?";
	      try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
	          PreparedStatement stmt = conn.prepareStatement(sql4);) {
	        stmt.setLong(1, Boat_id);
	        stmt.executeUpdate();
	        System.out.println();
	      } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	  	 
	  	public void delete1(int Boat_id) {
	          String jdbcUrl = "jdbc:postgresql://localhost:5432/Houseboat";
	          String username = "postgres";
	          String password = "ananthan";
	          String sql5 = " delete from Customer  where Boat_id=?";
	      try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
	          PreparedStatement stmt = conn.prepareStatement(sql5);) {
	        stmt.setLong(1, Boat_id);
	        stmt.executeUpdate();
	        System.out.println();
	      } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
}
    
