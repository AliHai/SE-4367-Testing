package facts;

// this file wraps the Model View Controller object instantiation for main to us

import java.awt.Container;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MVCWrapper extends JFrame implements ActionListener{
	
	// ATTRIBUTES
	static JButton b1 = new JButton("Display Fact");
	static Model myModel;
	static View myView;
	static Controller myController;
	
	MVCWrapper(){
		//Create and set up the window.
		JFrame frame = new JFrame("Facts");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//Size and display the window.
		Insets insets = frame.getInsets();
		frame.setSize(440,550);
		frame.setVisible(true);
		
		// add to frame
		frame.setLayout(null);
		frame.add(b1);
		Dimension size = b1.getPreferredSize();
		b1.setBounds(150 + insets.left, 15 + insets.top,size.width + 50, size.height + 20);		
		
		//add action listener
		b1.addActionListener(this);
	}
	// methods
 
	public void actionPerformed  (ActionEvent e){

		// display new fact
		if(e.getSource() == b1)
		{
		System.out.println("\nListener decteded fact button click.");
		
		// access data as follows
		// use controller
		// to get data from model
		// pipe back into controller
		// use controller
		// to pipe data into view
		Fact myRandomFact = Model.getRandomnFact();

		// print it
		//String myAuthor = myRandomFact.getAuthor();
		//System.out.println(myAuthor);
		}
	}
   
	public static void main(String[] args) {
		System.out.println("\nMain started.");
		System.out.println("\nModel View Controller Wrapper will now instantiate GUI.");
		myModel = new Model();
		myView  = new View();
		myController = new Controller();
		
		myController.setView(myView);
		myController.setModel(myModel);
		
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	MVCWrapper myWrapper = new MVCWrapper();
            }
        });		
	   
	} 	
    
}
