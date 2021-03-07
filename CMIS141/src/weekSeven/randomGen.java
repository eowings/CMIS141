package weekSeven;

/*
*File: randomGen.Java
*Author: William Frick:
*Date: 30 September 2020
*Purpose: This program will generate random numbers between X and Y, with the values being set by the user.
*/

//Import statements 
import java.util.Random;

public class randomGen {
    public static void main(String[] args) {
        
        Random randomInt = new Random();

        System.out.println("\nHello! your numbers selected are: " + args[0] + " and " + args[1]);
        System.out.println("Let's get to randomizing!");
        System.out.println("\nyour random numbers are:\n ");
    
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        for (int count = 0; count < x; count++) {
            int randomNumber = randomInt.nextInt(y);
            System.out.println(randomNumber);
        }
    
    }
}