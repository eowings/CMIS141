package finalProject;
//////////////////////////////////////////////////////////
//File Name: FinalProjectMain.java
//Author: Eddy Owings
//Date: 10/10/2020
//Description: This holds the main function to call and 
//             operate the two classes within the program.
//////////////////////////////////////////////////////////
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinalProjectMain{
    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        //Passing the command line argument "Crime.csv" to "Crime.java".
        boolean exit = false;
        Crime array = new Crime(args);
        long endTime;
        Scanner sc = new Scanner(System.in);
        System.out.print("********** Welcome to the US Crime Statistical Application **********\n");
        do {            
            String menuSelect;
            System.out.println(array.showMenu());
            menuSelect = sc.next();
            switch(menuSelect) {
            case "1":
                System.out.print("The population growth in percentages from each consecutive year were: \n" +
                                 array.getGrowthRate() + "\n");
                break;
            case "2":
                System.out.print("The Murder rate was highest in " + 
                                 array.getHighMurder() + "\n");
                break;
            case "3":
                System.out.print("The Murder rate was lowest in " + 
                                 array.getLowMurder() + "\n");
                break;
            case "4":
                System.out.print("The Robbery rate was highest in " + 
                                 array.getHighRobbery() + "\n");
                break;
            case "5":
                System.out.print("The Robbery rate was lowest in " + 
                                 array.getLowRobbery() + "\n");
                break;
            case "6":
                System.out.print("The Vehicle theft rate was highest in " + 
                                 array.getHighVehicleTheft() + "\n");
                break;
            case "7":
                System.out.print("The Vehicle theft rate was lowest in " + 
                                  array.getLowVehicleTheft() + "\n");
                break;
            case "Q":
                System.out.print("Thank you for trying the US Crimes Statistics Program.");
                exit = true;
                endTime = System.currentTimeMillis();
                System.out.println("\nElapsed time in seconds was: " + 
                                  (endTime - startTime) / 1000);
                break;
            default:
                System.out.print("Please choose a valid menu selection. \n");
            }          
   
        } while(!exit); 

    }    
}