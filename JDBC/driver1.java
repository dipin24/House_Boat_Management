package JDBC;
import java.util.Scanner;

public class driver1 {

	public static void main(String[] args) throws Exception {
		
		/*mysql db = new mysql();
		Scanner input = new Scanner(System.in);
		db.createDataBase();
		int choice = 0;
		int table=0;
		
		while(table!=6)
		
		{ System.out.print("Enter your choice \n");
		System.out.println("    1. Houseboat Details\n"
				+ "    2. Owner Details\n"
				+ "    3. Service Details\n"
				+ "    4. Customer Details\n");
		 table = input.nextInt();
		 if(table==1)
		 {
		System.out.println("     1. Display the rows in the table\n"
				+ "    2. Update the subject of a given id\n"
				+ "    3. Delete the details of a member where the id is taken as an input\n"
				+ "    4. Insert a new faculty entry\n" + "  "
				+ "    5. Select an entry using id as input"		+ "    6. Return to menu");
		choice=0;
		while (choice != 6) {
			System.out.print("Enter your choice \n");
			choice = input.nextInt();
			if (choice == 1) {
				db.display1();
			}
			if (choice == 2) {
				System.out.print("\nEnter BOAT ID and Owner id\n");
				String Boat_id = input.nextLine();
				String Owner_id = input.nextLine();
				input.nextLine();
				db.update1(Boat_id, Owner_id);
			}
			if (choice == 3) {
				
				String Boat_id = input.nextLine();
				db.delete1(Boat_id);

			}
			if (choice == 4) {
				System.out.println("Enter ownerid, boatid, firstname, last name, city and no of boat");
				String Boat_id = input.nextLine();
				input.nextLine();
				String Owner_id = input.nextLine();
				String Boat_id = input.nextLine();
				String First_name = input.nextLine();
				String Last_name = input.nextLine();
				String City  = input.nextLine();
				int Number_of_boat = input.nextInt();
				input.nextLine();
				input.nextLine();
				input.nextLine();
				input.nextLine();
				input.nextLine();
				input.nextLine();
				db.insert1(Owner_id, Boat_id, First_name, Last_name,City,Number_of_boat);
			}
           if (choice == 5) {
				
				int id = input.nextInt();
				db.select1(Boat_id);

			}

		}
		}
		 else if(table==2)
		 { choice=0;
			 System.out.println("     1. Display the rows in the table\n"
						+ "    2. Update the number of boat of a given id\n"
						+ "    3. Delete the details of owner where the id is taken as an input\n"
						+ "    4. Insert a owner entry\n" 
						+ "    5. select an owner using id as input"   
						+ "    6. Return to menu");
				while (choice != 6) {
					System.out.print("Enter your choice \n");
					choice = input.nextInt();
					if (choice == 1) {
						db.display2();
					}
					if (choice == 2) {
						System.out.print("\nEnter ID and number of boat\n");
						int Boat_id = input.nextInt();
						int Number_of_boat = input.nextInt();
						db.update2(Boat_id, Number_of_boat);
					}
					if (choice == 3) {
						int id = input.nextInt();
						db.delete2(Boat_id);

					}
					if (choice == 4) {
						System.out.println("Enter ownerid , boatID, firstname, lastname, city, noofboat");
						int  Owner_id = input.Owner_id();
						input.nextLine();
						String Boat_id = input.nextLine();
						String First_name = input.nextLine();
						String  Last_name = input.nextLine();
						String City = input.nextLine();
						int Number_of_boat = input.nextInt();
						input.nextLine();
						input.nextLine();
						db.insert2(Owner_id, Boat_id,First_name, Last_name,City,Number_of_boat);
					}
					if (choice == 5) {
						
						int id = input.nextInt();
						db.select2(Boat_id);

					}
				}
		 }
		 else 
			 break;
		}
		input.close();
		}*/
}
}