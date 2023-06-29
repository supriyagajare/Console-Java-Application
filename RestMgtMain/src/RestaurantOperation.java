public interface RestaurantOperation {
	
	/***
	 * this is interface
	 * and have abstract methods
	 * only declaration happen
	 * */

	void login(String UserName, String Password);
	void logout();
	void toAddRestaurant(String restaurantName, int avgCost, int rating,String ownerName, int restaurantId);
	void toDisplayRestaurant();
	void toDisplayRestaurantById(int resId);
	void toSearchRestaurant(int resId);
	void toUpdateRestaurant(int resId);
	void toDeleteRestaurantById(int resId);
	void toDeleteRestaurants();
	void sortListELemsById();
	
	default void rulesAndRegulation()
	{
		System.out.println("Maintain Social Distance and Sanitize your hand");
	}
}