package weekEight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Signal { 
    private
    double timeStep;// time between each data point
    int numberOfPoints;// number of data samples in array
    double [] acceleration = new double [1000];// acceleration data
    double [] velocity = new double [1000];// calculated velocity data
    double [] displacement = new double [1000];// calculated disp data
    
    // Constructor
    public Signal (String fileName) {
        String fileRead;
        int counter = 0;
        String timeSt = "";
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(fileName)); 
            timeSt = inputStream.readLine();
            timeStep = Double.parseDouble(timeSt);            
            while ((fileRead = inputStream.readLine()) != null) {
                acceleration[counter] = Double.parseDouble(fileRead);
                velocity[counter] = 0.5 * (acceleration[counter] + (acceleration[counter]-1)) 
                                           * timeStep + (velocity[counter]-1);
                displacement[counter] = .5 * (velocity[counter] + 0.0) * timeStep;
                counter ++;                
                numberOfPoints = counter;                 
            }

        }  catch (IOException io) { 
            // Change this to a string variable?
            System.out.println("File IO exception " + io.getMessage());
        }

    }// End Constructor
    
    //saveData Method Group 2
    public String saveData() {        
        BufferedWriter outputStream = null;      
        String[][] lines = new String[acceleration.length][4];
        for (int i = 0; i < acceleration.length; i++){
            lines[i][0] = i + ",";
            lines[i][1] = acceleration[i] + ",";
            lines[i][2] = " " + velocity[i] + ","; 
            lines[i][3] = " " + displacement[i] + "\n";            
        }       
        try {
            outputStream = new BufferedWriter(new FileWriter("newFile.csv"));
            outputStream.write("TimeStep: ," + timeStep + "\n");
            outputStream.write("line number,acceleration,velocity,displacement\n");
            outputStream.write(Arrays.deepToString(lines).replace("]", "").                                                          
                                                          replace("[", "").
                                                          replace(", ", ""));
            } catch (IOException io) {
                // Change this to a string variable?
                System.out.println("File IO exception " + io.getMessage());                
            } finally {                
                try {
                    if (outputStream != null) {
                        outputStream.close();                            
                        }                    
                } catch (IOException io) {
                    // Change this to a string variable?
                    System.out.println("Issue closing the Files " + io.getMessage());                   
                }                
            }
        return "newFile.csv has been written." ;
    }// End saveData
    
    //Method 1
    public double getTimeStep() {
        return timeStep; 
    }
    //Method 2
    public String getacceleration() {
       return Arrays.toString(acceleration);    
    }
    //Method 3
    public double getnumberOfPoints() {
        return numberOfPoints; 
    }
    //Method 4
    public String getvelocity() {
       return Arrays.toString(velocity);    
    }
    //Method 4
    public String getdisplacement() {
       return Arrays.toString(displacement);    
    }
    
}// End Signal
