package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
public class run {
	private static final String Boat_name = null;

	private Connection connect = null;

	private Statement statement = null;

	private PreparedStatement preparedStatement = null;

	private ResultSet resultSet = null;

	public void createDataBase() throws Exception {
		connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/houseboat", "postgres", "manky");
		statement = connect.createStatement();
		@SuppressWarnings("null")
		DatabaseMetaData dbm = connect.getMetaData();
		ResultSet rs = dbm.getTables(null, null, "Houseboat", null);
		ResultSet rs1 = dbm.getTables(null, null, "Owner", null);
		ResultSet rs2 = dbm.getTables(null, null, "Date", null);
		ResultSet rs3 = dbm.getTables(null, null, "Services", null);
		ResultSet rs4 = dbm.getTables(null, null, "Customer", null);
		if (rs.next())
			return;
		if (rs1.next())
			return;
		if (rs2.next())
			return;
		if (rs3.next())
			return;
		if (rs4.next())
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
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.resultSet.getInt(3)
					+ "\t" );
		}
		resultSet.close();
	}

	public void insert1(String Boat_id, String Boat_name, int Capacity) throws Exception {
		preparedStatement = connect.prepareStatement("insert into Houseboat values (?,?,?) ");
		preparedStatement.setString(1, Boat_id);
		preparedStatement.setString(2, Boat_name);
		preparedStatement.setint(3, Capacity);
	
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
		preparedStatement.setint(1, Number_of_boat);
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
		ResultSet resultSet = statement.executeQuery("select * from Owner where Boat_id="+id);
		System.out.println("Owner_id\tBoat_id\tFirst_name\tLast_name\tCity\tNumber_of_boat");
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
					+ "\t" + resultSet.getInt(4) + "\t");
		}
		resultSet.close();
	}
	public void insert2(String Boat_id, String dept, String name, int phone) throws Exception {
		preparedStatement = connect.prepareStatement("insert into Owner values (?,?,?,?) ");
		preparedStatement.setString(1, id);
		preparedStatement.setString(2, dept);
		preparedStatement.setString(3, name);
		preparedStatement.setLong(4, phone);
		preparedStatement.executeUpdate();

		preparedStatement.close();
	}
	public void display3() throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Student");
		System.out.println("ID\tName\tCourse\tPhoneno");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
					+ "\t" + resultSet.getInt(4) + "\t");
		}
		resultSet.close();
	}
	public void update3(int id, int phone) throws Exception {

		preparedStatement = connect.prepareStatement("update Student set phoneno = ? where studentid = ?");
		preparedStatement.setLong(1, phone);
		preparedStatement.setLong(2, id);
		preparedStatement.executeUpdate();
		preparedStatement.close();

	}
	public void select3(int id) throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Student where studentid="+id);
		System.out.println("ID\tName\tCourse\tPhoneno");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
					+ "\t" + resultSet.getInt(4) + "\t");
		}
		resultSet.close();
	}
	public void delete3(int id) throws Exception {
		preparedStatement = connect.prepareStatement("delete from Student where studentid = ?");
		preparedStatement.setLong(1, id);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
	public void insert3(int id, String Name, String course, int phone) throws Exception {
		preparedStatement = connect.prepareStatement("insert into Student values (?,?,?,?) ");
		preparedStatement.setLong(1, id);
		preparedStatement.setString(2, Name);
		preparedStatement.setString(3, course);
		preparedStatement.setLong(4, phone);
		preparedStatement.executeUpdate();

		preparedStatement.close();
	}
	public void display4() throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from studentleave");
		System.out.println("id\tleave type\tdays");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3));
		}
		resultSet.close();
	}
	public void update4(int days, int id) throws Exception {

		preparedStatement = connect.prepareStatement("update studentleave set days  = ? where studentid = ?");
		preparedStatement.setLong(1, days);
		preparedStatement.setLong(2, id);
		preparedStatement.executeUpdate();
		preparedStatement.close();

	}
	public void select4(int id) throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from studentleave where studentid="+id);
		System.out.println("id\tleave type\tdays");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3));
		}
		resultSet.close();
	}
	public void insert4(int id, String type, int days) throws Exception {
		preparedStatement = connect.prepareStatement("insert into studentleave values (?,?,?) ");
		preparedStatement.setLong(1, id);
		preparedStatement.setString(2, type);
		preparedStatement.setLong(3, days);
		preparedStatement.executeUpdate();

		preparedStatement.close();
	}
	public void display5() throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from facultyleave");
		System.out.println("id\tleave type\tdays");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3));
		}
		resultSet.close();
	}
	public void update5(int days, int id) throws Exception {

		preparedStatement = connect.prepareStatement("update facultyleave set days  = ? where facultyid = ?");
		preparedStatement.setLong(1, days);
		preparedStatement.setLong(2, id);
		preparedStatement.executeUpdate();
		preparedStatement.close();

	}
	public void select5(int id) throws Exception {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from facultyleave where facultyid="+id);
		System.out.println("id\tleave type\tdays");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3));
		}
		resultSet.close();
	}
	
	public void insert5(int id, String type, int days) throws Exception {
		preparedStatement = connect.prepareStatement("insert into facultyleave values (?,?,?) ");
		preparedStatement.setLong(1, id);
		preparedStatement.setString(2, type);
		preparedStatement.setLong(3, days);
		preparedStatement.executeUpdate();

		preparedStatement.close();
	}
}