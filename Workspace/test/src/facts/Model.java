package facts;

/*MVC Notes:
	https://www.tomdalling.com/blog/software-design/model-view-controller-explained/
		Summary:
		Model View and Controller work best when separated
		Model		- holds data
		View		- loads data independently of the Model
		Controller	- provides model data to view, also performs operations on the data
		
		
	https://code.tutsplus.com/tutorials/mvc-for-noobs--net-10488
*/

public class Model {
	
	// static attributes
	// these are the pipes to the mainDatabase
	// keep this the same throughout the project
	// this will allow parallel development on the Controllers without much re-work
	private static final String jsFile = "C:/Users/Alex/Desktop/Screen-Cleaner/GitHub/SE-4367-Testing/Workspace/test/src/facts/facts.js";
	private static final String xmlFile = "C:/Users/Alex/Desktop/Screen-Cleaner/GitHub/SE-4367-Testing/Workspace/test/WebContent/WEB-INF/data/facts.xml";
	private static final String thisServlet = "http://localhost:8080/test/";

	
	protected static FactList FactHolder = new FactList();
	protected static Fact FactBufferObject = new Fact();;
	protected static Parser parser = new Parser(xmlFile);


	// constructors


   
	// here you have as much freedom as you want, as far as how the Model chooses to store the data
	// use any implementation you would like in the UserDatabase class
	// keep this method signature static and the mainDatabase and UserBufferObject static
	// the way the Controller can manipulate them
	
	public static void addFact(){
		System.out.println("\nAdding to FactHolder with Model");
		// use setter to add fact into the view with the model
		FactHolder.set(FactBufferObject);
	}
	
	public static Fact getRandomnFact(){
		// generate random fact
		FactHolder = parser.getFactList();
		FactBufferObject = FactHolder.getRandom();
		System.out.println("\n--successful call to native FactHolder function.");
		return FactBufferObject;
	}
}
