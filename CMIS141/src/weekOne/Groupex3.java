package weekOne;

import java.util.Scanner;

/**
 * Topic 1 code for CMIS 141 Class 1
 */
public class Groupex3 {

	  public static void main(String[] args) {
		 int weekDays = 5;
		 int weekEnds = 2;
		 int daysInProblem;
		 int week = weekDays + weekEnds;

		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Choose a number of days: ");
		 
		 daysInProblem = sc.nextInt();
		 
		 int weeksInProblem = daysInProblem / week;
		 int weeksDaysLeftOver = daysInProblem - weeksInProblem * week;
		 int weekDaysInProblem = weeksInProblem * weekDays + weeksDaysLeftOver;
		 int weekEndsInProblem = daysInProblem / week * weekEnds;
		 
		 System.out.println("There are " + weeksInProblem + " weeks and " + weeksDaysLeftOver + " days in " + daysInProblem + " days.");
		 
		 System.out.println("There are " + weekDaysInProblem + " week days in " + daysInProblem + " days.");
		 
		 System.out.println("There are " + weekEndsInProblem + " weekend days in " + daysInProblem + " days.");
		 
		sc.close(); 

	  }
	}

