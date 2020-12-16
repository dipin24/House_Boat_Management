package JDBC;

public void Houseboat(String Boat_id) throws Exception {
	Statement statement = connect.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from Houseboat where Boat_id="+Boat_id);
	System.out.println("Boat_id\tBoat_name\tCapacity ");
	while (resultSet.next()) {
		System.out.println(resultSet.getStringt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
				
	}
	resultSet.close();
}

public void Owner(String Boat_id) throws Exception {
	Statement statement = connect.createStatement();
	ResultSet resultSet = statement.executeQuery("SELECT * FROM Owner where Boat_id="+Boat_id);
	System.out.println("Owner_id\tBoat_id\tFirst_name\tLast_name\tCity\tNumber_of_boat");
	while (resultSet.next()) {
		System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
		+ resultSet.getString(4) + resultSet.getString(5) + "\t" + resultSet.getInt(6) + "\t");
	}
	resultSet.close();
}

public void  Date(int id) throws Exception {
	Statement statement = connect.createStatement();
	ResultSet resultSet = statement.executeQuery("sSELECT * FROM Date  where  Boat_id=\"+Boat_id);
	System.out.println("Boat_id\tFrom_date\tTo_date\tdays");
	while (resultSet.next()) {
		System.out.println(resultSet.getString(1) + "\t" + resultSet.getdate + "\t" + resultSet.getdate(3)
				+ "\t" + resultSet.getInt(4) + "\t");
	}
	resultSet.close();
}
public void Services(String Boat_id) throws Exception {
	Statement statement = connect.createStatement();
	ResultSet resultSet = statement.executeQuery("SELECT * FROM  Services where Boat_id="+Boat_id);
	System.out.println("Boat_id\tService_type\tRate\tPayment_Status\tNumber_of_boat\tCity\tPayment_Amount");
	while (resultSet.next()) {
		System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
		+ resultSet.getbool(4) + resultSet.getInt(5) + "\t");
	}
	resultSet.close();
}


public void  Customer(int id) throws Exception {
	Statement statement = connect.createStatement();
	ResultSet resultSet = statement.executeQuery("sSELECT * FROM Customer   where  Boat_id=\"+Boat_id);
	System.out.println("Customer_id\tBoat_id\tFirst_name\tLast_name\tPhone_Number\tCustomer_city");
	while (resultSet.next()) {
		System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
				+ "\t" + resultSet.getString(4) +"\t" + resultSet.getInt(5) + "\t" +resultSet.getString(4));
	}
	resultSet.close();
}