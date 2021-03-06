/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekEight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * File: ReadEmails.java
 * Author: Dr. Robertson
 * Date: January 1, XXXX
 * Purpose: This program reads
 * emails from a file and displays them
 * to standard output.
 */
public class ReadEmails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader inputStream = null;

        String fileLine;
        try {
            inputStream = new BufferedReader(new FileReader("EmailAddresses.txt"));

            System.out.println("Email Addresses:");
            // Read one Line using BufferedReader
            while ((fileLine = inputStream.readLine()) != null) {
                System.out.println(fileLine);
            }
        } catch (IOException io) {
            System.out.println("File IO exception" + io.getMessage());
        }finally {
            // Need another catch for closing 
            // the streams          
            try {               
                if (inputStream != null) {
                inputStream.close();
            }                
            } catch (IOException io) {
                System.out.println("Issue closing the Files" + io.getMessage());
            }
        
        }
    }
}


