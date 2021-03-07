package weekSeven;

import java.util.*;


public class TestStatesDataEntry1 {
    public static void main(String[] args) {      
        
        Scanner sc = new Scanner(System.in);
        StatesDataEntry[] Group2One = new StatesDataEntry[3];
        for  ( int j = 0; j < Group2One.length; j++) {
        ArrayList<StatesDataEntry> theStateList = new ArrayList<StatesDataEntry>();

        /*
         * The program prompts the user to enter 
         * a State and prints both the State bird and flower.
         */
        System.out.print("\nEnter a State or 'None' to exit: ");
        String stateInput = sc.nextLine();
        /*
         * State data entry is case insensitive. 
         * State data may also contain leading and trailing white spaces.
         * 
         * The program continues to prompt the user to enter a state until 
         * “None” is entered.
         * 
         * For each of the objects constructed, the use of each of the 
         * methods was demonstrated
         */
        while (!stateInput.trim().equalsIgnoreCase ("None")) {
            StatesDataEntry entry = new StatesDataEntry (stateInput);
            theStateList.add (entry);             
            if (!entry.isFound()) {
                System.out.println (stateInput + " is not a valid name");
                
            } else {
                System.out.println ("Bird: " + entry.getStateBird() );
                System.out.println ("Flower: " + entry.getStateFlower() );
                } // else
            System.out.print("\nEnter a State or 'None' to exit: ");
            stateInput = sc.nextLine();
            
        } // while
        
        /*
         * After all data has been entered by the user, the 
         * program displays a summary report of all state requests.
         */
        System.out.println("**** Thank you *****");
        System.out.println("A summary report for each State, Bird, and Flower is:");
        
        for(int i=0; i < theStateList.size(); i++){
            System.out.println(theStateList.get(i));            
        }
        System.out.println("Please visit our site again!");
        
        }
        
    
    }

}
