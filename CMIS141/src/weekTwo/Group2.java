package weekTwo;

import java.util.*;

public class Group2 {
	
	public static void main(String[] args) {
		
		 double loanAmount, monthlySalary, creditCardDebt;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("How much would you like to borrow? ");
		 loanAmount = sc.nextDouble();
		 System.out.println("You Entered $" + loanAmount + " as the amount you would like to borrow.");
		 System.out.println("Now please enter your monthly salary. ");
		 monthlySalary = sc.nextDouble();
		 System.out.println("You Entered $" + monthlySalary + " as your monthly salary.");
		 System.out.println("Now please enter the whole sum of your current credit card debt. ");
		 creditCardDebt = sc.nextDouble();
		 System.out.println("You Entered $" + creditCardDebt + " as your current credit card debt.");
		 
		 if (loanAmount < monthlySalary * 12 && creditCardDebt < monthlySalary * 2 || creditCardDebt < 1000.00) {
			 System.out.println("Congratulations we will be happy to loan you $" + loanAmount + "."); 
		 } else if (loanAmount > monthlySalary * 12) {
			 System.out.println("We are sorry, the loan exceeds your current annual salary\nwhich means we can not approve your loan.");
		 } else {
			 System.out.println("We are sorry, your current credit card debt exceeds two months salary\nwhich means we can not approve your loan.");
		 }
		 
		 
		 
	}

}