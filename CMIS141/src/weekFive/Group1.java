package weekFive;
//////////////////////////////////////////////////
// Author: Group 1
// Date: 9/17/2020
// Purpose: https://learn.umgc.edu/d2l/le/525196/discussions/threads/20489106/View
// Binary Search https://www.geeksforgeeks.org/binary-search-a-string/
// Sort names https://beginnersbook.com/2018/10/java-program-to-sort-strings-in-an-alphabetical-order/
//////////////////////////////////////////////////
// Used for Scanner and Binary Search
import java.util.*;

public class Group1 {
	//Found this code at: https://www.geeksforgeeks.org/binary-search-a-string/
	static int binarySearch(String[] names, String yourName) {
		int l = 0, r = names.length - 1 ;
		while (l <= r) {
			int m = l + (r - l) / 2;
			int res = yourName.compareTo(names[m]);
			// Check if x is present at mid
			if (res == 0)
				return m;
			// If x greater, ignore left half
			if (res > 0)
				l = m + 1;
			// If x is smaller, ignore right half
			else
				r = m - 1;
		}
		return -1;
	} 
	

	public static void main(String[] args) {
		int numNames = 5;
		String[] names = new String[numNames];
		String yourName;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		yourName = sc.nextLine();
		
		System.out.println ("Enter five names each follwed by return.");
		for  ( int i = 0; i < numNames; i++){
			names[i] = sc.nextLine();
		}
	
        //Sorting the names
		String temp;
        for (int i = 0; i < numNames; i++) 
        {
            for (int j = i + 1; j < numNames; j++) { 
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
		int result = binarySearch(names, yourName);
		if (result == -1)
			System.out.println("Your name is not listed below");
		else
			System.out.println("Your name is lised at name " + (result+1) +" below");
		

        //Displaying the strings after sorting them based on alphabetical order
        System.out.print("Strings in Sorted Order:\n");
        for (int i = 0; i <= numNames - 1; i++) {
            System.out.print((i+1) +". " + names[i] + "\n");
        }

	}

}
