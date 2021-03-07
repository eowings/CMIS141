package weekTwo;

import java.util.*;

public class Group3 {
	
	public static void main(String[] args) {
		 double checkBalance, savingsBalance, fee = 25;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("What is your checking account balance?");
		 checkBalance = sc.nextDouble();
		 System.out.println("You Entered $" + checkBalance + " as your current checking account balance.");
		 System.out.println("Now please enter your savings account balance?");
		 savingsBalance = sc.nextDouble();
		 System.out.println("You Entered $" + savingsBalance + " as your current checking account balance.");
		 
		 if (checkBalance >= 1000.00) {
			 System.out.println("You will not be charged a fee because your checking account balance is over $1000.00. "); 
		 } else if (checkBalance + savingsBalance >= 5000) {
			 System.out.println("You will not be charged a fee because the sum of your checking and savings account's is over $5000.00. ");
		 } else {
			 System.out.println("You will be charged a fee of $" + fee + "." );
		 }
		 
		 
		 
	}

}
