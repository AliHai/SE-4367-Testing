package facts.facts;

/*MVC Notes:
	https://www.tomdalling.com/blog/software-design/model-view-controller-explained/
		Summary:
		Model View and Controller work best when seperated
		Model		- holds data
		View		- loads data independently of the Model
		Controller	- provides model data to view, also performs operations on the data
		
		
	https://code.tutsplus.com/tutorials/mvc-for-noobs--net-10488
*/

public class FactsGUIModel {
	// static attributes
	// these are the pipes to the mainDatabase
	// keep this the same throughout the project
	// this will allow parallel development on the Controllers without much re-work
	
	
	protected static UserDatabase mainDatabase;
	protected static User UserBufferObject;
	
	
	// here you have as much freedom as you want, as far as how the Model chooses to store the data
	// use any implementation you would like in the UserDatabase class
	// keep this method signature static and the mainDatabase and UserBufferObject static
	// the way the Controller can manipulate them
	
	public static void addUser(){
		System.out.println("\nAdding to UserDataBase with Model");
		mainDatabase.addUser(UserBufferObject);
	}
	

}
