
abstract public class AbstractRestaurant implements RestaurantOperation {
/**
 * from the interface RestaurantOperation 
 * implement the abstract methods 
 * and use annotations
 * */
	@Override
	public void login(String userName, String password) {
				if(userName.equals("Akshata") && password.equals("123"))
				{
					System.out.println("=====Logged in successfully======");
				}
				else
				{
					System.out.println("-------------Loggin Failed--------------");
					//System.out.println("Please Enter correct username and password");
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					System.exit(1);
				}
		
	}
	
	@Override
	public void logout() {
		System.out.println("|-----------------------------|");
		System.out.println("|Thank you...visit us again.. |");
		System.out.println("|-----------------------------|");
	}
	
	/*abstract methods for abstract restaurants*/
	abstract void getFirstElement();
	abstract void getLastElement();

	public abstract void sortListELemsById();
	
}
