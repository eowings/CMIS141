package weekTwo;

import java.util.*;

public class Group1 {

    public static void main(String[] args) {
    	
        int dayOfWeek;
        
        System.out.println("Enter a number that represents a day of the week\n(Sun = 1 Mon = 2 ect...)");
        Scanner sc = new Scanner(System.in);
       
	     while (true) {
	    	 dayOfWeek = sc.nextInt();
	    	 if (dayOfWeek < 1 || dayOfWeek > 7){
		    	 System.out.println("You did not enter a number between 1-7.\nPlease try again");
		    	 continue;
		    	 }
		     break;
	     }
        
        switch (dayOfWeek) {
            case 1:
                System.out.println("You entered 1 for Sunday!");
                break;
            case 2:
                System.out.println("You entered 2 for Monday!");
                break;
            case 3:
                System.out.println("You entered 3 for Tuesday!");
                break;
            case 4:
                System.out.println("You entered 4 for Wednesday!");
                break;
            case 5:
                System.out.println("You entered 5 for Thursday!");
                break;
            case 6:
                System.out.println("You entered 6 for Friday!");
                break;
            case 7:
                System.out.println("You entered 7 for Saturday2!");
                break;

        }

        System.out.println("Thank you!");
    }
}
