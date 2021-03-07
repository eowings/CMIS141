package finalProject;
//////////////////////////////////////////////////////////
//File Name: USCrimeClass.java
//Author: Eddy Owings
//Date: 10/10/2020
//Description: A class used to create data objects 
//             to be recorded and stored within the 
//             Crime class.
//////////////////////////////////////////////////////////

public class USCrimeClass {
    private
            int year;
            long population;
            double murderRate;
            double robberyRate;
            double vehicleTheftRate;
    
    //Constructor
    public USCrimeClass (String yr,String mr,String rr,String pop,String vtr) {
        year = Integer.parseInt(yr);
        murderRate = Double.parseDouble(mr);
        robberyRate = Double.parseDouble(rr);
        population = Long.parseLong(pop);
        vehicleTheftRate = Double.parseDouble(vtr);        
    }//End Constructor
    
    //Default Constructor
    public USCrimeClass () {        
        year = 1996;
        murderRate = 19.96;
        robberyRate = 19.96;
        population = 1996;
        vehicleTheftRate = 19.96;        
    }//End Default Constructor
    
    //Getters
    public int getYear() {
        return year;
        }
    public double getMurderRate() {
        return murderRate;
        }
    public double getRobberyRate() {
        return robberyRate;
        }
    public long getPopulation() {
        return population;
        }
    public double getvehicleTheftRate() {
        return vehicleTheftRate;
        }
    //End Getters
    
/*
* I assumed I would need these, yet this 
* program never needed setters to function
* as everything was set within the constructor
* and stored in Crime array.
    //Setters
    public void setYear(int yr) {
        yr = year;
        }    
   public void setMurderRate(double mr) {
        mr = murderRate;
        } 
    public void setRobberyRate(double rr) {
        rr = robberyRate;
        }
    public void setPopulation(long pop) {
        pop = population;
        }  
    public void setvehicleTheftRate(double vtr) {
        vtr = vehicleTheftRate;
        }
    //End Setters
*/         

}
