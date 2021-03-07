package weekFour;

import java.util.Scanner;

public class GroupThree {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);   
		int type = 0;
        // Prompt user for entry.  
		for(int i = 1; type !=9 ; i++ ) {
			System.out.print("Press 5 for adult and 1 for kid 9 to quit.");
			
			Wally ticket = new Wally(sc.nextInt(), i, i);
		}
Wally sales = new Wally(type, type, type);

        
	}
        
        
}