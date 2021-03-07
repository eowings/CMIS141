package weekFour;

import java.util.*;

public class GroupOne {
	
	public static void main(String[] args) {
		// Variable used for if else statement, could also use boolean.
		int yes;
		Scanner sc = new Scanner(System.in);       
        // Prompt user for entry.                
        System.out.println("Enter your Social Security number "); 
        // Construct a SSN and assign s1 as the user value
        SSN s1 = new SSN(sc.nextLong()); 
        // Call the getter method from SSN
        long s1Ssn = s1.getSsnNumber();
        // Print results and ask to confirm.
         System.out.print("Is " + s1Ssn + " correct?"
        		+ "\n(enter 1 for Yes or 2 for No)");
        // Start if else statement
        yes = sc.nextInt();
        // If user types 1 for yes present exit message.
        if (yes == 1) {
        	System.out.print("Great, thank you!");
        	}// End if
        // If user types anything besides 1, prompt for new entry.
        else {
        	// Ask for correct entry.
         	System.out.print("Please enter your correct social: ");
         	// Use the setter to record new ssnNumber
        	s1.setSsnNumber(sc.nextLong());
        	// Assign a new local variable to s1 so it can be read in the print statement.
        	long s2Ssn = s1.getSsnNumber();
        	// Print exit message.
            System.out.print("Your correct social Security Number is " + s2Ssn);
        	}// End else
	}// End Main
}// End Class
