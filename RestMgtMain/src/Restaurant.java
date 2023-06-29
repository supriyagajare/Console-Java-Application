import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Restaurant extends AbstractRestaurant implements Comparable<Restaurant>{ 
/**
 * Implement interface
 * definition of all abstarct methods
 * collections
 * have constructor 
 * constructor chaining
 * override methods
 * private members
 * 
 * **/


	private static final Scanner scan=new Scanner(System.in);
	
	private String restaurantName;
	private int avgCost;
	private int rating;
	private String ownerName;
	private int restaurantId;
	private List<Restaurant> restaurantList = new ArrayList<Restaurant>();

	/**
	 * Default Constructor*/
	Restaurant(){
		rulesAndRegulation();
	}

	
	public Restaurant(String restaurantName, int avgCost, int rating, String ownerName) {
		this.restaurantName = restaurantName;
		this.avgCost = avgCost;
		this.rating = rating;
		this.ownerName = ownerName;
	}
	
	/*
	 * Constructor Chaining*/
	public Restaurant(String restaurantName, int avgCost, int rating, String ownerName, int restaurantId) {
		this(restaurantName, avgCost, rating, ownerName);
		this.restaurantId = restaurantId;

	}

	/*
	 * Getter method*/
	public int getRestaurantId() {
		return restaurantId;
	}

	/*
	 * Insert Data*/
	@Override
	public void toAddRestaurant(String restaurantName, int avgCost, int rating,String ownerName, int restaurantId ) {
		Restaurant obj = new Restaurant(restaurantName, avgCost, rating, ownerName, restaurantId);
		restaurantList.add(obj);
		System.out.println("**Record Add Successfully**");
		System.out.println();
		
	}

	/*Show all Data*/
	@Override
	public void toDisplayRestaurant() {
		Iterator<Restaurant> restList = restaurantList.iterator();
		while(restList.hasNext()) {
			System.out.println(restList.next());
			}
		System.out.println();
	}

	public String toString()
	{
		return restaurantName + " " +avgCost +" "+ rating +" "+ ownerName +" "+restaurantId;
		
	}

	/*Search Specific Data*/
	@Override
	public void toSearchRestaurant(int resId) {
		Iterator<Restaurant> restList = restaurantList.iterator();
		boolean flag = false;
		while(restList.hasNext()) {
			Restaurant restaurant = restList.next();
			if(restaurant.getRestaurantId() == resId) {
				flag = true;
				System.out.println("Restaurant found");
				//sysout restau
				System.out.println(restaurant);
				break;
			}
		}
		if(flag == false)
			System.out.println("Restaurant not found");
		
		System.out.println();
		System.out.println();

	}
	
	/*Delete data by id*/
	public void toDeleteRestaurantById(int resId) {
		Iterator<Restaurant> restList = restaurantList.iterator();
		boolean flag = false;
		int index = -1;  //restIbj1(0) , restObj2(1)
		while(restList.hasNext()) {
			index++;  //1
			Restaurant restaurant = restList.next();
			if(restaurant.getRestaurantId() == resId) {  //102 == 1000
				flag = true;
				restaurantList.remove(index);
				System.out.println("record deleted");
				break;
			}
		}
		if(flag == false)
			System.out.println("Restaurant not found");
		
		System.out.println();
		System.out.println();

	}
	
	/*Update data*/
	public void toUpdateRestaurant(int resId) {
		// agarwals(15),restaurant1(30), bhanthindarrest(29)
		Iterator<Restaurant> restList = restaurantList.iterator();
		boolean flag = false;
		int index = -1;
		while(restList.hasNext()) {
			index++;//2
			Restaurant restaurant = restList.next();
			if(restaurant.getRestaurantId() == resId) {
				flag = true;
				
				System.out.println("Enter the New Restuarant Name:");
				String newRestName = scan.next();
				System.out.println("Enter the New Owner:");
				String newOwnerName = scan.next();
				System.out.println("Enter the Average Cost");
				int updatedAvgCost = scan.nextInt();
				System.out.println("Enter the Update Rate");
				int updatedRatings = scan.nextInt();
				restaurantList.set(index, new Restaurant(newRestName,updatedAvgCost, updatedRatings, newOwnerName,resId ));
				System.out.println("record updated Successfully");
				break;
			}
		}
		if(flag == false)
			System.out.println("Restaurant not found");
		
		System.out.println();

	}
	
	/*Delete all records*/
	@Override
	public void toDeleteRestaurants() {
		//do you really want to delete all? chcek cond for yes / no
		System.out.println("Enter the Yes If you want clear allthe records");
		String input=scan.next();
		if(input.equalsIgnoreCase("yes") && !restaurantList.isEmpty()) {
			if(restaurantList.size() != 0) 
				restaurantList.clear();
		System.out.println("all the records got cleared");
		}
		else if(input.equalsIgnoreCase("no"))
		{
		}
		else {
			//call showmenu / display all the records
			
			System.out.println("	|----------------|");
			System.out.println("	|List is Empty	 |");
			System.out.println("	|----------------|");

			//RestaurantDriver.showMenu();
		}
		
	}
	
//	@Override
//	  public int compareTo(Restaurant resObj) {
//		STring ownerName = resObj.getOwnerName();
//		return this.o - ownerName;  //ascendong   100 101 110
	//return this.owner - 
//		//return resId - this.restaurantId  //110 101 100
//	}
	
	@Override
	public void sortListELemsById() {
		Collections.sort(restaurantList);
		toDisplayRestaurant();
		
	}
	
	@Override
	public void toDisplayRestaurantById(int resId) {
		
		Iterator<Restaurant> restList = restaurantList.iterator();
		boolean flag = false;
		while(restList.hasNext()) {
			Restaurant restaurant = restList.next();
			if(restaurant.getRestaurantId() == resId) {
				flag = true;
				System.out.println(restaurant);
				break;
			}
		}
		if(flag == false)
			System.out.println("Restaurant not found");
		System.out.println();

	}
	
	public void getFirstElement(){
	//	List<Restaurant> sortedList = Collections.sort(restaurantId, 0);
		if(!restaurantList.isEmpty())
		System.out.println( restaurantList.get(0));
		else
			{
			System.out.println("	|----------------|");
			System.out.println("	|List is Empty	 |");
			System.out.println("	|----------------|");
			}
		System.out.println();

	}

	
	public void getLastElement(){
		 if(!restaurantList.isEmpty())
				System.out.println( restaurantList.get(restaurantList.size() - 1));
				else
					{
					System.out.println("	|----------------|");
					System.out.println("	|List is Empty	|");
					System.out.println("	|----------------|");
					}
		 System.out.println();
}


	@Override
	public int compareTo(Restaurant resObj) {
		
		int resId = resObj.getRestaurantId();
		return this.restaurantId - resId;  
	}
}
