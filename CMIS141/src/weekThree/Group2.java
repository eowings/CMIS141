package weekThree;

import java.util.*;

public class Group2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double temperature, pressure;
		boolean safe;
		
		do{
			System.out.println("Core temp is: ");
			temperature = input.nextDouble();
			System.out.println("Core psi is: ");
			pressure = input.nextDouble();
			// error argument states OR and not AND also argument not closed with ;.
			// Original code:
			// safe = pressure <=1000.0 || temperature <= 1500.0
			safe = pressure <= 1000.0 && temperature <= 1500.0; 
					} while (safe);
		System.out.println("EMERGENCY!!!!");
		System.out.println("Start ECCS!");
		
	}
}
