package JDBC;


import java.io.*;
public class DRIVER {
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to the house boat management System.");
		System.out.println("Enter 1 for display, 2 for update, 3 for search, 4 for delete, 5 for insert, 6 to exit.");
		int choice=Integer.parseInt(br.readLine());
		int capacity;
		String Boat_id,Boat_name;
		float price;
		switch(choice)
		{
		   case 1:Display d=new Display();
		          d.display();
		          break;
		  
		   case 2:Select s=new Select();
		          System.out.println("Enter the Boat_id )");
			      break;
		   case 3:Delete del=new Delete();
		          System.out.println("Enter the Boat_id");
			      id=Integer.parseInt(br.readLine());
			      del.delete(Boat_id);
		          break;
		   case 4:Insert in=new Insert();
		          System.out.println("Enter the Boat_id,Boat_name,Capacity,");
	              Boat_id=Integer.parseInt(br.readLine());
	              Boat_name=br.readLine();
	              
	            
	              Capacity=Integer.parseInt(br.readLine());
			      in.insert(Boat_id, Bot_name,Capacity);
	              break;
		   default:System.out.println("Thank you for using");
			      break;
		}
	}
}