package weekTwo;

import java.util.Scanner;

//rename file to match public class: UMGC_BuggyProgram///////////////////////////////////////////////BUGGY 
public class UMGC_BuggyProgram { 

	public static void main(String[] args) { 
		// Change int to double to match console calling to read for nextDouble for x, y, z.
		// int x, y, z; /////////////////////////////////////////////////////////////////////BUGGY
		   double x, y, z;

		Scanner console = new Scanner(System.in);
			
		System.out.print("What is the value of X");	
		x = console.nextDouble();

		System.out.print("What is the value of Y");	
		y = console.nextDouble();

		System.out.print("What is the value of Z");	
		z = console.nextDouble();
			
	      // change X, Y & Z outside of quatations to lowercase, add + in between all calls.
	      // System.out.println("You entered X= " + X ", Y = " + Y ", Z = " + Z); //////////////BUGGY
		System.out.println("You entered X= " + x + ", Y = " + y + ", Z = " + z);

	} 
} 