package weekTwo;
///////////////////////////////////////////////////////
// File: WeekTwoDiscussion.java
// Author: Edward Owings
// Date: 8/25/2020
// Purpose: Take user Int and assign it to a month 
//          and then print message about month.
///////////////////////////////////////////////////////

//Import library
import java.util.*;

public class WeekTwoDiscussion {	
	static int month;
	public static void main(String[] args)  { 
		
		// Declare variables 
		
		String stringMonth = null;
	 
		// Display a Welcome note
	    System.out.println("Welcome to the Switch Demo");
	 
		// Use the Scanner class to input data
	     Scanner scannerIn = new Scanner(System.in);
	     
		System.out.println("Enter the Month (1-12):");	     
	     while (true) {
	    	// the nextInt() method scans the next int value only if it meets the if statement.
	    	 month = scannerIn.nextInt();
	    	 // ensures the int that is entered meets criteria.
		     if (month > 12 || month < 1){
		    	 System.out.println("You did not enter a number between 1-12.\nPlease try again");
		    	 // continues while loop until criteria is true
		    	 continue;
		    	 }
		     //breaks while loop and enters if control flow below
		     break;
	     }
	         
	     //if statement (control flow) will assign a string to the chosen int.	     	    	 
	     if (month == 1) {
	    	 stringMonth = "January";
	    	 }
	     else if (month == 2) {
	         stringMonth = "Febuary";
	         }
	     else if (month == 3) {
	         stringMonth = "March";
	         }
	     else if (month == 4) {
	         stringMonth = "April";
	         }
	     else if (month == 5) {
	         stringMonth = "May";
	         }
	     else if (month == 6) {
	         stringMonth = "June";
	         }
	     else if (month == 7) {
	         stringMonth = "July";
	         }
	     else if (month == 8) {
	         stringMonth = "August";
	         }
	     else if (month == 9) {
	         stringMonth = "September";
	         }
	     else if (month == 10) {
	         stringMonth = "October";
	         }
	     else if (month == 11) {
	         stringMonth = "November";
	         }
	     else if (month == 12){
	         stringMonth = "December";
	         }
	     // Verify the month  was entered
	     System.out.println("You Entered " + month + " which is the month of " + stringMonth);
	     
	     // Selection statement to determine Holiday Greetings
	     
	     switch (month) {
	     // Each case represents the number entered by the user for "int month" and prints a message for that number.
	     case 1: 
	    	 // Print out January Events
	    	 System.out.println("Happy New Year!");
	    	 System.out.println("Celebrate Martin Luther King's Birthday!");
	    	 break;
	     case 2: 
	    	 // Print out February Events
	    	 System.out.println("Happy Valentine's Day!");
	    	 System.out.println("Happy President's Day!");
	    	 break;
	     case 3: 
	    	 // Print out March Events
	    	 System.out.println("Enjoy St. Patrick's Day!");
	    	 break;		
	     case 4:
	    	 // Print out April Events
	    	 System.out.println("Thomas Jefferson was born in April!");
	    	 break;	
	     case 5:
	    	 // Print out May Events
	    	 System.out.println("Enjoy Memorial Day!");
	    	 System.out.println("Don't forget to Celebrate with Mom!");
	    	 break;	
	     case 6:
	    	 // Print out June Events		
	    	 System.out.println("Happy Father's Day!");
	    	 break;	
	     case 7:
	    	 // Print out July Events		
	    	 System.out.println("Happy 4th of July!");
	    	 break;	
	     case 8:
	    	 // Print out August Events		
	    	 System.out.println("Barack Obama was born in August!");
	    	 break;	
	     case 9:
	    	 // Print out September Events		
	    	 System.out.println("Celebrate Labor Day!");
	    	 break;	
	     case 10:
	    	 // Print out October Events		
	    	 System.out.println("Happy Halloween!");
	    	 break;	
	     case 11:
	    	 // Print out November Events		
	    	 System.out.println("Happy Thanksgiving Day!");
	    	 System.out.println("Remember to Thank a Vet!");
	    	 //break;	
	     case 12:
	    	 // Print out December Events		
	    	 System.out.println("Enjoy those Holidays with Family!");	
	    	 break;	         
	     default: 
	    	 System.out.println("Month is not a value between 1 and 12");
	    	 // Exit the application for invalid Months
	    	 System.exit(0);
	}
	
	// Output the number of days in the selected month
	System.out.println("Thank you for entering " + month + ", the month of " + stringMonth);	
	}
	     
	     
}


