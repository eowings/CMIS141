package weekFour;

import java.util.*;

public class GroupTwo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);   
		
        // Prompt user for entry.                
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your requested loan amount: ");
        double amount = sc.nextDouble();
        System.out.println("Please enter your monthly salary: ");
        double salary = sc.nextDouble();
        System.out.println("Please enter your credit debt: ");
        double debt = sc.nextDouble();
        LoanApplicant info = new LoanApplicant(name, age, amount, salary, debt);        
        // Test if things recorded
        String name1 = info.getName();
        double loan1 = info.getLoanAmt();
        System.out.println(name1 + "\n" + loan1);

        if (info.Approval()) {
        	System.out.println("Your loan is approved!");	
        } else {
        	System.out.println("Your loan is not approved!");	
        }
        
	}
	
}
