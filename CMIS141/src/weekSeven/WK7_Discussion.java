package weekSeven;



/*
File: WK7_Discussion
Local path: C:\Users\Joe\Desktop\Uni\CMIS 141\7
Author: Joe Ware
Date: 6 Oct 2020
Instructor: J. Marcus
Course: CMIS 141
Purpose: Test passing arguments from command line to generate random numbers.
*/
import java.util.Random;

public class WK7_Discussion {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		Random randomInt = new Random();

		System.out.println("\nGenerate "+ args[0] + " random numbers between 0 and " + args[1]);

		for (int i = 0; i < x; i++) {
			int randomNumber = randomInt.nextInt(y);
			System.out.println(randomNumber);
		} //end loop
	
	} //end main
} //end class
	