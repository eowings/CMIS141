package weekFour;


import java.util.*;

public class GroupFour {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Please enter your birth month: ");
	     int month = sc.nextInt();
	     System.out.println("Please enter your birth day: ");
	     int day = sc.nextInt();
	     System.out.println("Please enter your birth year: ");
	     int year = sc.nextInt();
	     CheckAge info = new CheckAge(month, day, year);
	    // int monthOne = info.getMonth();
	    // int dayOne = info.getDay();
	    // int yearOne = info.getYear();
	   //  System.out.println(monthOne);
	   //  System.out.println(dayOne);
	  //   System.out.println(yearOne);
	     String retireStat = info.Retire();
	     System.out.println(retireStat);
	     }
	}
