package weekSeven;


public class StatesDataEntry {
    /*
     * Class has fields for a single state name and associated bird and flower
     */
    private String stateName;
    private String stateBird;
    private String stateFlower;
    boolean found;
    
    //Constructor
    public StatesDataEntry (String stateInput) {
        found = false;
        /*
         * Constructor uses another class to get the state 
         * bird and flower with the state name as the argument.
         */
        stateName = stateInput;
        for (int i = 0; i < StateBirdFlowerArray.StateBirdFlowerArray.length; i++){ 
                if (stateInput.trim().equalsIgnoreCase(StateBirdFlowerArray.StateBirdFlowerArray[i][0])){
                    stateName = StateBirdFlowerArray.StateBirdFlowerArray[i][0];
                    stateBird = StateBirdFlowerArray.StateBirdFlowerArray[i][1];
                    stateFlower = StateBirdFlowerArray.StateBirdFlowerArray[i][2];                    
                    found = true;
                }//End if
        }//End for loop        
    } //End Constructor
    

    //Method 1
    public String getStateBird() {
        return stateBird;  
    }
    //Method 2
    public String getStateFlower() {
        return stateFlower;  
    }
    //Method 3
    public boolean isFound() {
        return found;  
    }
    
    /*
     * A toString method that returns a string with the name of the state, 
     * the state bird, and state flower
     */

    //Method 4 toString
    public String toString() {
        return stateName + ", " + stateBird + ", " + stateFlower;  
    }

}
