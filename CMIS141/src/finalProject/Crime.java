package finalProject;
//////////////////////////////////////////////////////////
//File Name: Crime.java
//Author: Eddy Owings
//Date: 10/10/2020
//Description: A class that holds an array of the USCrimeClass.
//             Also has methods for presenting data and a menu 
//             method that can be called to print menu.
//////////////////////////////////////////////////////////
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Crime {
    private ArrayList <USCrimeClass> arrayOfUSCrime;
    //Constructor 
    public Crime(String[] args) throws FileNotFoundException {
        arrayOfUSCrime = new ArrayList<USCrimeClass>();
        File crimeFile = new File(args[0]);
        int i = 0;
        Scanner crimeData = new Scanner(crimeFile);
        String headerLine = crimeData.nextLine();    // skip header line
        while (crimeData.hasNext()) {
            String crimeLine = crimeData.nextLine();
            String[] parts = crimeLine.split(",");
            String year = parts[0];
            String population = parts [1];
            //String violentCrime = parts [2];
            //String violentCrimeRate = parts [3];
            //String murder = parts [4];
            String murderRate = parts[5];
            //String rape = parts[6];
            //String rapeRate = parts[7];
            //String robbery = parts[8];
            String robberyRate = parts[9];
            //String assault = parts[10];
            //String assaultRate = parts[11];
            //String propertyCrime = parts[12];
            //String propertyCrimeRate = parts[13];
            //String burglary = parts[14];
            //String burglaryRate = parts[15];
            //String theft = parts[16];
            //String theftRate = parts[17];
            //String vehicleTheft = parts[18];
            String vehicleTheftRate = parts[19];        
            USCrimeClass array = new USCrimeClass(year,murderRate,robberyRate,population,vehicleTheftRate);
            arrayOfUSCrime.add(array);
            i++;
         }        
        crimeData.close();  // close the file               
    }// End Constructor   
        
    //Methods for each functionality 
    
    //getGrowthRate
    public String getGrowthRate() {
        double numberOne = 0;
        double numberTwo = 0;
        int dateOne = 0;
        int dateTwo = 0;
        double calc = 0;
        String calcAll = "";
        DecimalFormat df = new DecimalFormat("#.####");
        for (int i = 1; i < arrayOfUSCrime.size(); i++) {
            numberOne = arrayOfUSCrime.get(i-1).getPopulation();            
            numberTwo = arrayOfUSCrime.get(i).getPopulation();            
            dateOne = arrayOfUSCrime.get(i-1).getYear();
            dateTwo = arrayOfUSCrime.get(i).getYear();
            calc = ((numberTwo-numberOne)/numberOne)*100;
            calcAll += "\n"+ dateOne + "-" + dateTwo + ": " + df.format(calc) + "%";            
        }        
        return calcAll;
    }//End getGrowthRate 
    
    // getLowMurder
    public int getLowMurder() {
        int lowIndex = arrayOfUSCrime.get(0).getYear();
        double max = arrayOfUSCrime.get(0).getMurderRate();
        
        for(USCrimeClass crime : arrayOfUSCrime) {
            double currentRate = crime.getMurderRate();
            if(currentRate < max){
                lowIndex = crime.getYear();
                max = currentRate;                
            }            
        }        
        return lowIndex;        
    }//End getLowMurder
    
    // getHighMurder
    public int getHighMurder() {
        int maxIndex = arrayOfUSCrime.get(0).getYear();
        double max = arrayOfUSCrime.get(0).getMurderRate();
        
        for(USCrimeClass crime : arrayOfUSCrime) {
            double currentRate = crime.getMurderRate();
            if(currentRate > max){
                maxIndex = crime.getYear();
                max = currentRate;                
            }            
        }        
        return maxIndex;        
    }//End getHighMurder
  
    // getLowRobbery
    public int getLowRobbery() {
        int lowIndex = arrayOfUSCrime.get(0).getYear();
        double max = arrayOfUSCrime.get(0).getRobberyRate();
        
        for(USCrimeClass crime : arrayOfUSCrime) {
            double currentRate = crime.getRobberyRate();
            if(currentRate < max){
                lowIndex = crime.getYear();
                max = currentRate;                
            }            
        }        
        return lowIndex;        
    }//End getHighRobbery
    
    // getHighRobbery
    public int getHighRobbery() {
        int maxIndex = arrayOfUSCrime.get(0).getYear();
        double max = arrayOfUSCrime.get(0).getRobberyRate();
        
        for(USCrimeClass crime : arrayOfUSCrime) {
            double currentRate = crime.getRobberyRate();
            if(currentRate > max){
                maxIndex = crime.getYear();
                max = currentRate;                
            }            
        }        
        return maxIndex;        
    }//End getHighRobbery  
    
    // getLowVehicleTheft
    public int getLowVehicleTheft() {
        int lowIndex = arrayOfUSCrime.get(0).getYear();
        double max = arrayOfUSCrime.get(0).getvehicleTheftRate();
        
        for(USCrimeClass crime : arrayOfUSCrime) {
            double currentRate = crime.getvehicleTheftRate();
            if(currentRate < max){
                lowIndex = crime.getYear();
                max = currentRate;                
            }            
        }        
        return lowIndex;        
    }//End getLowVehicleTheft
    
    // getHighVehicleTheft
    public int getHighVehicleTheft() {
        int maxIndex = arrayOfUSCrime.get(0).getYear();
        double max = arrayOfUSCrime.get(0).getvehicleTheftRate();
        
        for(USCrimeClass crime : arrayOfUSCrime) {
            double currentRate = crime.getvehicleTheftRate();
            if(currentRate > max){
                maxIndex = crime.getYear();
                max = currentRate;                
            }            
        }        
        return maxIndex;        
    }//End getHighVehicleTheft 
    
    //Show Menu Method
    public String showMenu() {
    String menu = "\nEnter the number of the question you want answered. Enter ‘Q’ to quit the program:\n" +
            "1. What were the percentages in population growth for each consecutive year from 1994 – 2013?\n" +
            "2. What year was the Murder rate the highest?\n" +
            "3. What year was the Murder rate the lowest?\n" +
            "4. What year was the Robbery rate the highest?\n" +
            "5. What year was the Robbery rate the lowest?\n" +
            "6. What year was the Vehicle Theft rate the highest?\n" +
            "7. What year was the Vehicle Theft rate the lowest?\n" +
            "Q. Quit the program";
    return menu;
    }//End Menu
}
