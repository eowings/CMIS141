package weekThree;

import java.util.*;

public class Group1 {
	
	public static void main(String[] args) {
		// Declare two of the three variables.
		String firstName, lastName;
		// Set "sc" as a variable to listen for input using Scanner in the util library
		Scanner sc = new Scanner(System.in);
		// for loop counts "i" for iteration, below it is set to run once.
		for (int i = 0; i < 1; i++ ) {
			// Ask user for first name.
			System.out.print("Please enter your first name:  ");
			// Assign input to variable.
			firstName = sc.next();
			// Ask user for last name.
			System.out.print("Please enter your last name:  ");
			// Assign input to variable.
			lastName = sc.next();
			// Declare and define the third variable, that uses the first two variables. 
			String lastNameFirst = lastName + ", " + firstName;
			// Print the third variable add line returns in case there are more than one iterations.
			System.out.print(lastNameFirst + " \n\n");
		
		}// End for loop	
		
	}// End Main

}// End Class
