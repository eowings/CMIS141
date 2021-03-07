package weekEight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EddyReadData {
    public static void main(String[] args) {
        BufferedReader inputStream = null;
        String fileRead;
        int charCounter = 0;
        
        try {
            System.out.println("");
            inputStream = new BufferedReader(new FileReader("KCvsNE.txt"));
            System.out.println("Scoring plays from KC vs NE game: \n");
            while ((fileRead = inputStream.readLine() ) != null) {
                System.out.println(fileRead);
                charCounter += fileRead.length();
            }
            System.out.println("\nThis .txt file contains " + charCounter + " characters.");
        }  catch (IOException io) {
            System.out.println("File IO exception " + io.getMessage());
            
        }
        
    }
    
}
