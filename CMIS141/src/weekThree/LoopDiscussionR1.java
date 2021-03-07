package weekThree;
/*
Filename:    	LoopDiscussionR1.java
Programmer:  	John Fung
Date:  	     	9/3/2020
Version:	1.0.0
Class:  	CMIS 141
Instructor: 	Jeffery Marcus
Summary: 	Discussion Week 3 Particiaption.
https://stackoverflow.com/questions/25166215/how-to-add-delay-to-while-loop/25166297
The time to go through 10 iterations was too quick. Had to find a way in slowing down for the users.
Out of scope... I am a bad bad bad CMIS 141 student.
Revision 1: Amy Heyen 09/03/20 added art and prompt for user to acknowledge checklist
*/

import java.util.*;

class LoopDiscussionR1 {

	public static void main (String[] args) 
	throws InterruptedException {

		Scanner input = new Scanner(System.in);
		int countdown = 10;
		String checklistStatus = "yes";
		for (int i = 0; i < countdown; i++) {
    System.out.println(
			"          ___\n" +
      "    |     | |\n" +
    	"   / \\    | |\n" +
      "  |--o|===|-|\n" +
   		"  |---|   |N|\n" +
			" /     \\  |A|\n" +
      "| U     | |S|\n" +
			"| S     |=|A|\n" +
 			"| A     | | |\n" +
 			"|_______| |_|\n" +
			" | | | |  | |\n" +
			"__________|_|_\n"
		);
    
		}

		do { 
			// prompts user to complete checklist
			System.out.println("Have you completed your launch checklist? (yes/no/abort)");
			checklistStatus = input.nextLine().toLowerCase();
			// begin switch to process user input
			// initiates countdown if checklist is yes
			if (checklistStatus.equals("yes")) {
					while (countdown > 0){
						System.out.println("T-minus " + countdown);
						countdown--;
						Thread.sleep(1000);
					} // countdown while loop
					System.out.println("Houston, we have blast off!");
			} else if (checklistStatus.equals("no")) {
				System.out.println("You must complete the checklist to continue...\n");
			} else {
				System.out.println("ABORT ABORT ABORT"); // abort message
			} // if else if statement
		} while (checklistStatus.equals("no")); // do while statment
	} // main
}// class 