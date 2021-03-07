package weekFour;
///////////////////////////////////////////////////////
//File: Guitar.java Revision 1
//Author: Edward Owings
//Date: 9/12/2020
//Purpose: This class will use four fields, two constructors
//four getters, one random method and a string all
//to create details of a guitar.
///////////////////////////////////////////////////////
import java.awt.Color;
import java.util.*;

public class Guitar {
	// Four Private Fields. 
	private int numStrings;
	private double guitarLength;
	private String guitarManufacturer;
	private Color guitarColor;
	
	// Default Constructor
	public Guitar () {
		numStrings = 6;
		guitarLength = 28.2;
		guitarManufacturer = "Gibson";
		guitarColor = Color.RED;
	}// End Default Constructor.
	
	// Constructor will have named variables passing entered data 
	// from and instance into each field below.
	public Guitar (int strings,
					double length,
					String make,
					Color color) {
		numStrings = strings;
		guitarLength = length;
		guitarManufacturer = make;
		guitarColor = color;
	}// End Constructor.

	// Getter Methods for each Field.	
	public int getStrings() {
		return numStrings;
	} 
	public double getLength() {
		return guitarLength;
	} 
	public String getMake() {
		return guitarManufacturer;
	} 
	public Color getColor() {
		return guitarColor;
	}// Close getter getColor.
	
	// Play Guitar Method Creates a random char and uses a random int to select
	// one of the six different duration choices, returns both side by side as String.
	public String playGuitar () {
		String both = "", start = "[", end = "]";
		int i = 0;
		while (i < 16) {
			i++;
			String num;
			String letters = "ABCDEFG";
			Random randomLetter = new Random();
			int letterNum = letters.length();
			char getRandLetter = letters.charAt(randomLetter.nextInt(letterNum));
			Random randomNumber = new Random();
			int getRandInt = randomNumber.nextInt(7 - 1) + 1;
			// Randomly pick one statement below based on random int generated.
			if (getRandInt <= 1) {
				num = "(1)";
			} else if (getRandInt <= 2) {
				num = "(2)";
			} else if (getRandInt <= 3) {
				num = "(3)";
			} else if (getRandInt <= 4) {
				num = "(4)";
			} else if (getRandInt <= 5) {
				num = "(0.5)";	
			} else {
				num = "(0.25)";
			}// End if selection for random picks.
			// if statement comma or no comma.
			if (i < 16) {
				both += getRandLetter + num + ", ";
			} else {
			both += getRandLetter + num;
			}// End if statement 
		}//End while
		// Allow my guitar to gently weep.
		return start + both + end;
	}// End Play Guitar Method
	
    // toString method
	public String toString() {
    	String str = "(" + "numStrings="+ numStrings + 
    					", " + "guitarLength="+ guitarLength + 
    					", " + "guitarManufacturer=" + guitarManufacturer + 
    					", " + "guitarColor="+ guitarColor + ")";
    	return str;
    }// End toString


}// End Guitar
