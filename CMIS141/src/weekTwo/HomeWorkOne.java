package weekTwo;
///////////////////////////////////////////////////////
// File: HomeWorkOne.java
// Author: Edward Owings
// Date: 8/25/2020
// Purpose: Take a user input and modify it to an output.
///////////////////////////////////////////////////////

// Uses java.util library for  Scanner
import java.util.*;

public class HomeWorkOne {
	
	public static void main(String[] args) {
		
		//integer variables.
		int emplId = 0,  ageInMonths = 0; 
		//double variables.
		double temperatureInCelsius = 0.0, quizOne, quizTwo, quizThree;
		//Constant Variables will be brought in after the needed doubles above have assigned data.
		
		// Assign "sc" as the variable to take input from user via Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Ask for user input
		System.out.print("Enter your Student EMPLID (0 - 999999): ");
		//Assign user input to variable.
		emplId = sc.nextInt();
		
		//Ask for user input
		System.out.print("Enter your quiz1 percentage score (0.0 – 100.0): ");
		//Assign user input to variable.
		quizOne = sc.nextDouble();
		
		//Ask for user input
		System.out.print("Enter your quiz2 percentage score (0.0 – 100.0): ");
		//Assign user input to variable.
		quizTwo = sc.nextDouble();
		
		//Ask for user input
		System.out.print("Enter your quiz3 percentage score (0.0 – 100.0): ");
		//Assign user input to variable.
		quizThree = sc.nextDouble();
		// Now that variables have data assigned initialize the constant variable.
		double AVGQUIZSCORE = (quizOne + quizTwo + quizThree) / 3;
		
		//Ask for user input
		System.out.print("Enter your age in months (0-1440): ");
		//Assign user input to variable.
		ageInMonths = sc.nextInt();
		// Now that variable has data assigned initialize the constant variable.
		double AGEINYEARS = ageInMonths / 12;
				
		//Ask for user input		
		System.out.print("Enter the current Temperature in degrees Celsius: ");
		//Assign user input to variable.
		temperatureInCelsius = sc.nextDouble();
		// Now that variable has data assigned initialize the constant variable.
		double FAHRENHEIT = temperatureInCelsius * 9.0/5.0 + 32;
		
		
		// Print everything out
		System.out.print("\n*** Thank You ***");
		System.out.print("\nStudent EMPLID: " + emplId);
		System.out.print("\nQuiz 1 Score: " + quizOne);
		System.out.print("\nQuiz 2 Score: " + quizTwo);
		System.out.print("\nQuiz 3 Score: " + quizThree);
		System.out.print("\nAverage quiz score: " + AVGQUIZSCORE);
		System.out.print("\nAge in months: " + ageInMonths);
		System.out.print("\nAge in years: " + AGEINYEARS);
		System.out.print("\nTemperature in Celsius: " + temperatureInCelsius + '°');
		System.out.print("\nTemperature in Fahrenheit: " + FAHRENHEIT + '°');
		
	}// End main

}// End Class
