package weekFour;

// Import scanner
import java.util.*;

public class WeekFour {
	
	public static void main(String[] args) {
		// int for the while loop
		int i = 1;
		// String for making a list of all contacts.
		String all = "";
		// Scanner class to take user input.
		Scanner sc = new Scanner(System.in);
		// Ask user how many entries they would like to make.
		System.out.println("How many contacts would you like to add today? : ");
		// Record users requested number as contacts variable.
		int contacts = sc.nextInt();
		// Start loop for number of contacts iterations.
		while (i <= contacts) {
			// Collect data for the fields in PhoneContacts Class.
			System.out.println("Please enter first name: ");
			String first = sc.next();
			System.out.println("Please enter last name: ");
			String last = sc.next();
			System.out.println("Please enter 10 digit phone number: ");
			int phone = sc.nextInt();
			// Create an instance of PhoneContacts called userOneContactList.
			PhoneContacts userOneContactList = new PhoneContacts(first, last, phone);
			// Tell each iteration how to store the data using getters from Phone Contacts.
			String entry = "Contact " + i + ": " + 
							userOneContactList.getName() + 
							"\n" +
							"Phone Number: " + 
							userOneContactList.getPhoneNumber() +
							"\n";
			// Record to memory each iteration under the all variable.
			all += entry+ "\n";
			// Plus one to i
			i++;
			}// End while loop.
		 
		 System.out.println("Your phone contacts are:\n ");
		 System.out.println(all);
		 System.out.println("Goodbye.");
		 
	}// End Main.
	
}// End Class.
