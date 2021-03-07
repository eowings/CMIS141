package weekFour;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		ArrayList<Integer> itemAmounts = new ArrayList<Integer>();
		int c = 1;
		int x = 0;
		while(x!=-1){
	    System.out.print("Enter the number of Item "+c+" you would like to purchase: ");
	    //int x = sc.nextInt();
	    itemAmounts.add(sc.nextInt());
	    //itemAmounts.add(x);
	    c++;
	    }
	}

}
