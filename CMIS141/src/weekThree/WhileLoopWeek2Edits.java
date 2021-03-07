package weekThree;

import java.util.Scanner;

public class WhileLoopWeek2Edits {
	public static void main(String[] args) throws InterruptedException {

	int number;
	Scanner sc = new Scanner(System.in);
	System.out.println("How many bottles of beer are on the wall?\n(It's best to enter a smaller number) ");
	number = sc.nextInt();

	while(number >= 1) {
		System.out.println(number + " bottles of beer on the wall, " + number + " bottles of beer.\n");
		int minusOne = number - 1;
		Thread.sleep(2000);
		System.out.println("Take one down and pass it around, " + minusOne + " bottles of beer on the wall.\n\n");
		number--;
		Thread.sleep(2000);
		}
	
	System.out.println("Time to go get more beer, drive safe!");
	System.out.println("Goodbye.");
	}
}