package weekTwo;

import java.util.*;

public class Group4 {

    public static void main(String[] args) {

        int yourAge;
        System.out.println("Whats your current age? ");
        Scanner sc = new Scanner(System.in);
        
        do {
            try {
            	yourAge = sc.nextInt();
                if (yourAge >= 0 && yourAge <= 100)                     
                break;                
            } catch (InputMismatchException e) {
            } finally {
                sc.nextLine();
            	}
            System.out.print("Input must be a number between 0 and 100: ");
        } while (true);
        
        int howManyYears = 65 - yourAge;
        if(yourAge >= 65) {
        	System.out.println("Congrats! You are old enough to retire!");

        } else {
        	System.out.println("You will be eligible to retire  " + howManyYears + " years.");
        }

        System.out.println("Thank you!");
    }
}
