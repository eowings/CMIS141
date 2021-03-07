package weekEight;

/*
*File: fileReader.java
*Author: William Frick
*Date: 4 October 2020
*Purpose: This program will read the int numbers inside the text document called "numbers"
*The program will the print the numbers read, and the amount of numbers read.
*Edited by Eddy Owings to output to a file "NumbersOut.txt"
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class fileReaderRev1 {
	public static void main(String[] args) throws FileNotFoundException{
	    int num, counter = 0;
	    File file = new File("numbers.txt");
	    BufferedReader inputStream = null;
        BufferedWriter outputStream = null;
        
        try {            
            inputStream = new BufferedReader(new FileReader("numbers.txt"));
            outputStream = new BufferedWriter(new FileWriter("NumbersOut.txt"));
	        Scanner input = new Scanner(file);
	        System.out.println("The values read are: ");
	        outputStream.write("The values read are: \n");
	        while(input.hasNext()){
	            num = input.nextInt();
   				System.out.println(num);
   				outputStream.write(num + "\r\n");
				counter += 1 ;}
	        System.out.println("\n" + counter+ " data values were read");
	        outputStream.write("\n" + counter+ " lines were read");
	        } catch (IOException e) {
	            e.printStackTrace();	            
	        } finally {
	            try { 
	                if (inputStream != null) {
	                    inputStream.close();	                    
	                if (outputStream != null) {
	                    outputStream.close();	                    
	                }
	                }	                
	            } catch (IOException e) {
	                e.printStackTrace();
	                
	            }	            
	        }        
	}	
}
