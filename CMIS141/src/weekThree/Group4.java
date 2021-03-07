package weekThree;
///////////////////////////////////////////////////////
//File: Group4.java
//Authors: Group Four Members
//Date: 9/3/2020
//Purpose: Uses for loops to print a multiplication table
///////////////////////////////////////////////////////


public class Group4 {

public static void main(String[] args) {

// Print top row with single for loop
for (int i = 1; i <= 9; i++) {
// Add three spaces to line up with the table below
System.out.print("   " + i);
}// End first for loop
// Separate top row from nested loop with a break or return.
System.out.println();
// Begin second for loop to print multiplication table 
for(int j = 1; j <= 9; j++) {
// Print an extra column for "j" 1 - 9 will appear on left
System.out.print(j);
// Begin nested for loop to make X * Y multiplication argument (or j * k).
for(int k = 1; k <= j; k++) {
// Print multiplication table
System.out.print("  " + j * k);
}// End nested for loop inside second for loop
System.out.println();
}// End second for loop

}// End Main

}// End Class
