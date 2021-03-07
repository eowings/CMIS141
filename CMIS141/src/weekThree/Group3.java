package weekThree;

import java.util.*;

public class Group3 {
	
	public static void main(String[] args) {
		// Declare variables. Had to use float vs double as double 
		// returned too many decimals.
		float sine, cosine, sineAngle, cosineAngle, radians;
		boolean same;
		// Set "sc" as a variable to listen for input using Scanner in the util library
		Scanner sc = new Scanner(System.in);
		// do loop continues if true and stops if false.
		do{
			// Ask user for sine.
			System.out.println("Enter the sine in degrees ");
			// Record sineAngle.
			sineAngle = sc.nextFloat();
			// The program now goes down the next two
			// lines to equate the value of sine.
			// These lines use the Trigonometric Functions builtin to Java seen in week 3 readings.
			// The below URL has these functions explanations. 
			// https://www.geeksforgeeks.org/trigonometric-functions-in-java-with-examples/
			radians = (float) Math.toRadians(sineAngle); 
			sine = (float) Math.sin(radians);
			// Ask user for cosine.
			System.out.println("Enter the cosine in degrees ");
			// Record cosineAngle.
			cosineAngle = sc.nextFloat();
			// The program now goes down the next two
			// lines to equate the value of cosine.
			// These lines use the Trigonometric Functions builtin to Java.
			// The below URL has these functions explanations. 
			// https://www.tutorialspoint.com/java/lang/math_cos.htm
			radians = (float) Math.toRadians(cosineAngle); 
			cosine = (float) Math.cos(radians); 
			// Assign an argument for the boolean "same".
			same = sine == cosine ; 
			// Tell program to print statement if same equals true.
			if (same == true) {
			System.out.println("A Sine of " + sine + " and Cosine of " + cosine + " are the same.\nTry entering a sine and cosine that are different. \n\n");
			}// End if statement
					// Tell program to continue loop while same equals true.
					} while (same);
		// Same equals false so the following statement will print to notify user.
		System.out.println("A Sine of " + sine + " and Cosine of " + cosine + " are NOT the same!");
		System.out.println("Goodbye.");

	}// End Main

}// End Class

