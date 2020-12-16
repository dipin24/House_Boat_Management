package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
public class mysql {
	private static final String Boat_name = null;

	private Connection connect = null;

	private Statement statement = null;

	private PreparedStatement preparedStatement = null;

	private ResultSet resultSet = null;

	public void createDataBase() throws Exception {
		connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "ananthan");
		statement = connect.createStatement();
		@SuppressWarnings("null")
		DatabaseMetaData dbm = connect.getMetaData();
		ResultSet rs = dbm.getTables(null, null, "Houseboat", null);
		ResultSet rs1 = dbm.getTables(null, null, "Owner", null);
		ResultSet rs2 = dbm.getTables(null, null, "Services", null);
		ResultSet rs3 = dbm.getTables(null, null, "Customer", null);
		if (rs.next())
			return;
		if (rs1.next())
			return;
		if (rs2.next())
			return;
		if (rs3.next())
			return;
	
	
		
	}

	public void display1() throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Houseboat");
		System.out.println("Boat_id\tBoat_name\tCapacity");
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3));
		}
		resultSet.close();
	}

	public void update1(String Boat_id,String Boat_name) throws Exception {

		preparedStatement = connect.prepareStatement("update Houseboat set Boat_name = ? where Boat_id = ?");
		preparedStatement.setString(1, Boat_name);
		preparedStatement.setString(2, Boat_id);
		preparedStatement.executeUpdate();
		preparedStatement.close();

	}

	public void delete1(String Boat_id) throws Exception {
		preparedStatement = connect.prepareStatement("delete from Houseboat where Boat_id = ?");
		preparedStatement.setString(1, Boat_id);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
	public void select1(String Boat_id) throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Houseboat where Boat_id="+Boat_id);
		System.out.println("Boat_id\tBoat_name\tCapacity");
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
					+ "\t" );
		}
		resultSet.close();
	}

	public void insert1(String Boat_id, String Boat_name, int Capacity) throws Exception {
		preparedStatement = connect.prepareStatement("insert into Houseboat values (?,?,?) ");
		preparedStatement.setString(1, Boat_id);
		preparedStatement.setString(2, Boat_name);
		preparedStatement.setInt(3, Capacity);
	
		preparedStatement.executeUpdate();

		preparedStatement.close();
	}
	public void display2() throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Owner");
		System.out.println("Owner_id \tBoat_id\tFirst_name\tLast_name\tCity\tNumber_of_boat");
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
					+ "\t" + resultSet.getString(4) + "\t" + resultSet.getString(5) + resultSet.getInt(4));
		}
		resultSet.close();
	}
	public void update2(String Boat_id, int Number_of_boat) throws Exception {

		preparedStatement = connect.prepareStatement("update  Owner set Number_of_boat = ? where Boat_id = ?");
		preparedStatement.setInt(1, Number_of_boat);
		preparedStatement.setString(2, Boat_id);
		preparedStatement.executeUpdate();
		preparedStatement.close();

	}
	public void delete2(String Boat_id) throws Exception {
		preparedStatement = connect.prepareStatement("delete from Owner where Boat_id = ?");
		preparedStatement.setString(1, Boat_id);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
	public void select2(String Boat_id) throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Owner where Boat_id="+Boat_id);
		System.out.println("Owner_id\tBoat_id\tFirst_name\tLast_name\tCity\tNumber_of_boat");
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
					+ "\t" + resultSet.getInt(4) + "\t");
		}
		resultSet.close();
	}
	public void insert2(String owner_id,String Boat_id, String First_name, String Last_name,String City, int Number_of_boat) throws Exception {
		preparedStatement = connect.prepareStatement("insert into Owner values (?,?,?,?) ");
		preparedStatement.setString(1, owner_id);
		preparedStatement.setString(2, Boat_id);
		preparedStatement.setString(3, First_name);
		preparedStatement.setString(4, Last_name);
		preparedStatement.setString(5, City);
		preparedStatement.setInt(6, Number_of_boat);
		preparedStatement.executeUpdate();

		preparedStatement.close();
	}
	public void display3() throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Services");
		System.out.println("Boat_id\tService_type\tRate,\tPayment_Status,\tPayment_Amount");
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3) 
					+  "\t" + resultSet.getBoolean(4) + "\t" + resultSet.getInt(5) + "\t");
		}
		resultSet.close();
	}
	public void update3(String Boat_id, int Rate) throws Exception {

		preparedStatement = connect.prepareStatement("update Owner set Rate = ? where Boat_id = ?");
		preparedStatement.setString(1, Boat_id);
		preparedStatement.setInt(2, Rate);
		preparedStatement.executeUpdate();
		preparedStatement.close();

	}
	public void select3(int id) throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Services where Boat_id="+id);
		System.out.println("Boat_id\tService_type\tRate\tPayment_Status\tPayment_Amount");
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
					+ "\t" + resultSet.getBoolean(4)
					+ "\t" +resultSet.getInt(5)
				
					+ "\t" + resultSet.getInt(6) + "\t");
		}
		resultSet.close();
	}
	public void delete3(String Boat_id) throws Exception {
		preparedStatement = connect.prepareStatement("delete from Services where Boat_id = ?");
		preparedStatement.setString(1, Boat_id);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
	public void insert3( String Boat_id, String Service_type , int Rate ,Boolean Payment_Status,   int Payment_Amount ) throws Exception {
		preparedStatement = connect.prepareStatement("insert into Services values (?,?,?,?,?) ");
	
		preparedStatement.setString(1, Boat_id);
		preparedStatement.setString(2, Service_type);
		preparedStatement.setInt(3, Rate);
		preparedStatement.setBoolean(4, Payment_Status);
		preparedStatement.setInt(3, Payment_Amount);
		
		preparedStatement.executeUpdate();

		preparedStatement.close();
	}
	public void display4() throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Customer");
		System.out.println("Customer_id\tBoat_id\tFirst_name\tLast_name\tPhone_Number\tCustomer_city");
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)+ "\t" + resultSet.getString(4)+ "\t" + resultSet.getInt(5) 
			+ "\t" +resultSet.getString(6));
		}
		resultSet.close();
	}
	public void update4(int Phone_Number, String Boat_id) throws Exception {

		preparedStatement = connect.prepareStatement("update Customer set Phone_Number  = ? where Boat_id = ?");
		preparedStatement.setInt(1, Phone_Number);
		preparedStatement.setString(2, Boat_id);
		preparedStatement.executeUpdate();
		preparedStatement.close();

	}
	public void delete4(String Boat_id) throws Exception {
		preparedStatement = connect.prepareStatement("delete from Customer where Boat_id = ?");
		preparedStatement.setString(1, Boat_id);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
	public void select4(int Boat_id) throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Customer where Boat_id="+Boat_id);
		System.out.println("Customer_id\\tBoat_id\\tFirst_name\\tLast_name\\tPhone_Number\\tCustomer_city");
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)+ "\t" + resultSet.getString(4)+ "\t" + resultSet.getInt(5) 
			+ "\t" +resultSet.getString(6));
		}
		resultSet.close();
	}
	public void insert4(String Customer_id,String Boat_id, String First_name, String Last_name,int Phone_Number,String Customer_city) throws Exception {
		preparedStatement = connect.prepareStatement("insert into Customer values (?,?,?,?,?,?) ");
		preparedStatement.setString(1, Customer_id);
		preparedStatement.setString(2, Boat_id);
		preparedStatement.setString(3, First_name);
		preparedStatement.setString(4, Last_name);
		preparedStatement.setInt(5, Phone_Number);
		preparedStatement.setString(6, Customer_city);
		preparedStatement.executeUpdate();
		

		preparedStatement.close();
	}
	
	}