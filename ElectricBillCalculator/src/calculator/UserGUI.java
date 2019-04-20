
package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class UserGUI extends JFrame implements ActionListener {
	
	private String fileName;
	private static Customer[] customers;
	
	
	// declare all GUI components below
	
	
	// constructor
	UserGUI(String fileName){

	
		
	}

	private void initComponenet(){
		// intialize the GUI components
		  
	}

   private void doTheLayout(){
		// Organize the components into GUI window
	   
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		//call appropriate methods as required based on user actions

		
	}

	private void submitButtonClicked(){
		// code to be executed once the submit button is clicked
		//add customer object to the customers[] array
		//display the customer objects followed by sum and average
		
		
		
	}

	private void closeButtonClicked(){
		// code to be executed once the close button is clicked
		//write sorted output to file
		
		
		// It must show a goodbye message and terminate the program

	}


	public static void main(String[] args) {
		UserGUI frame = new UserGUI("customers.txt");

	}

}

