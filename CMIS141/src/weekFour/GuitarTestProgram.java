package weekFour;
///////////////////////////////////////////////////////
//File: GuitarTestProgram.java
//Author: Edward Owings
//Date: 9/12/2020
//Purpose: This will test the guitar class.
///////////////////////////////////////////////////////
import java.awt.Color;
public class GuitarTestProgram {

	public static void main(String[] args) {
		
		//Default constructor
		System.out.print("\n\nDefault:");
		Guitar nochange = new Guitar();
		System.out.print("\ntoString():" + nochange.toString());
		System.out.print("\ngetNumStrings():" + nochange.getStrings());
		System.out.print("\ngetGuitarLength():" + nochange.getLength());
		System.out.print("\ngetGuitarManufacturer():" + nochange.getMake());
		System.out.print("\ngetGuitarColor():" + nochange.getColor());
		System.out.print("\nplayGuitar():" + nochange.playGuitar());
		// Construct three Guitars with fields set.
		System.out.print("\n\nGuitar one:");
		Guitar first = new Guitar(9,25.5,"Dreadnought",Color.red);
		// Print out all the fields using toString and getters.
		System.out.print("\ntoString():" + first.toString());
		System.out.print("\ngetNumStrings():" + first.getStrings());
		System.out.print("\ngetGuitarLength():" + first.getLength());
		System.out.print("\ngetGuitarManufacturer():" + first.getMake());
		System.out.print("\ngetGuitarColor():" + first.getColor());
		System.out.print("\nplayGuitar():" + first.playGuitar());
		System.out.print("\n\nGuitar two");
		Guitar second = new Guitar(12,38.0,"Ibanez",Color.black);
		// Print out all the fields using toString and getters.
		System.out.print("\ntoString():" + second.toString());
		System.out.print("\ngetNumStrings():" + second.getStrings());
		System.out.print("\ngetGuitarLength():" + second.getLength());
		System.out.print("\ngetGuitarManufacturer():" + second.getMake());
		System.out.print("\ngetGuitarColor():" + second.getColor());
		System.out.print("\nplayGuitar():" + second.playGuitar());
		System.out.print("\n\nGuitar three");
		Guitar third = new Guitar(6,27.5,"Les Paul",Color.green);
		// Print out all the fields using toString and getters.
		System.out.print("\ntoString():" + third.toString());
		System.out.print("\ngetNumStrings():" + third.getStrings());
		System.out.print("\ngetGuitarLength():" + third.getLength());
		System.out.print("\ngetGuitarManufacturer():" + third.getMake());
		System.out.print("\ngetGuitarColor():" + third.getColor());
		System.out.print("\nplayGuitar():" + third.playGuitar());
	}// End Main
}// End GuitarTestProgram
