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

public class FactsGUIController {
	// attributes
	protected Model model;
	protected View view;
	// constructors

	// methods
	public void addUser(User inputUser1){
		System.out.println("\nAdding User to Model with Controller");

		try{
			System.out.println("\nSetting static field in Model with Controller");
			Model.UserBufferObject = inputUser1;
			Model.addUser();
		}
	    catch (Exception e)
	    {
	      System.err.println("Controller encountered exception while adding User to Model!");
	      System.err.println(e.getMessage());
	    }
		
	}	
	
	// setters for assembling the pieces in main Make Calendar
    public void setModel(Model m){
    	System.out.println("\nSetting Model for Controller");
    	this.model = m;
    	
    }
    public void setView(View v){
    	System.out.println("\nSetting View for Controller");
    	this.
}
