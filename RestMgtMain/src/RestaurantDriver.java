
import java.util.Scanner;

public class RestaurantDriver { 
	/***
	 * main method available
	 * call methods, constructor
	 * run time polymorphism
	 * 
	 * */

	private static final Scanner scan=new Scanner(System.in);
	private static final AbstractRestaurant restaurant = new Restaurant();  
	
	static void showMenu() {
		System.out.println("|===============================================|");
		System.out.println("|	Press 1 to add restaurant in system	|");
		System.out.println("|	Press 2 to display all restaurants	|");
		System.out.println("|	Press 3 to display restaurants by id	|");
		System.out.println("|	Press 4 to sort All Records		|");
		System.out.println("|	Press 5 to get First restaurant		|");
		System.out.println("|	Press 6 to get Last restaurant		|");
		System.out.println("|	Press 7 to search restaurant by id	|");
		System.out.println("|	Press 8 to Update restaurant		|");
		System.out.println("|	Press 9 to Delete Restaurant By rest Id	|");
		System.out.println("|	Press 10 to Delete Restaurants		|");
		System.out.println("|	Press 11 to logout			|");
		System.out.println("|	Press 12 to exit			|");
		System.out.println("|===============================================|");

	}
	
	public static void main(String args[])
	{
	
		/*
		 * Login
		 * username & Passwprd*/
		System.out.println("=============Welcome to Restaurants===========");
		System.out.println("Login into Restaurant:");
		System.out.println("Enter the username");
		String name = scan.next();
		System.out.println("Enter the password");
		String password = scan.next();
		restaurant.login(name, password);
		
		int option;
		do {
			showMenu();
			System.out.print("=========Enter your option=========");
			option = scan.nextInt();
			switch(option) {
			
			case 1:
				// Insert values
				System.out.println("Add the Restaurant:");
				System.out.println(" Enter Restaurant Name:");
				String restaurantName = scan.next();
				System.out.println("Enter Avg Cost");
				int avgCost = scan.nextInt();
				System.out.println("Enter the ratings");
				int ratings = scan.nextInt();
				System.out.println("Enter the owner Name");
				String ownerName = scan.next();
				System.out.println("Enter the resId");
				int resId= scan.nextInt();
				restaurant.toAddRestaurant(restaurantName, avgCost, ratings, ownerName, resId );
				break;
				
			case 2:
				// Show Available data
				System.out.println("Display the Restaurants:");
				restaurant.toDisplayRestaurant();
				break;
				
			case 3:
				//Show data by Specific id
				System.out.println("Display the Restaurants by id:");
				int restId;
				restId=scan.nextInt();
				restaurant.toDisplayRestaurantById(restId);
				break;
				
			case 4:
				//Data sort by id
				System.out.println("Sorted Data by id");
				restaurant.sortListELemsById();		
				break;
				
			case 5:
				//get first data
				System.out.println("Display first data");
				restaurant.getFirstElement();
				break;
				
			case 6:
				//get last data
				System.out.println("Display last data");
				restaurant.getLastElement();				
				break;
				
			case 7:
				//Search Specific Data
				System.out.println("Search the Restaurant:");
				System.out.println("Enter the RestId");
				int resId1 = scan.nextInt();
				restaurant.toSearchRestaurant(resId1);
				break;
				
			
			case 8:			
				//Update any Data
				int restID2;
				System.out.println("Enter the Id");
				restID2= scan.nextInt();
				System.out.println("Update the Restaurant:");
				restaurant.toUpdateRestaurant(restID2);
				break;
				
			case 9:
				//Delete Some Records
				System.out.println("Delete the Restaurant by id:");
				System.out.println("Enter the Restaurant ID");
				resId1=scan.nextInt();
				restaurant.toDeleteRestaurantById(resId1);
				break;
				
			case 10:
				//Delete All Data
				System.out.println("Delete All Restaurants:");
				restaurant.toDeleteRestaurants();
				break;
				
			case 11:
				//Logout
				restaurant.logout();
				break;
				
			case 12:
				//Exit from the System
				System.exit(1);
			
			default :
				if(option != 11)
					System.out.println("Enter proper options...");
			}
		}
		while(option != 11);

	}
}
