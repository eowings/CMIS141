package weekFive;
///////////////////////////////////////////////////////
//File: OwingsWeekFiveClass.java
//Author: Edward Owings
//Date: 9/18/2020
//Purpose: A spin off from the Group two exercise. 
///////////////////////////////////////////////////////
public class OwingsWeekFiveClass {
    static final int ARRAYSIZE = 50;
    private int[] random = new int [ARRAYSIZE];

    // Constructor method
    public OwingsWeekFiveClass (int[] rand) {
        for ( int j = 0; j < rand.length; j++)
            random [j] = rand[j];
    }//End Constructor

    // Index method   
    public int Index() {
        int min = random[0];
        int index=0;
        for(int i = 0; i < random.length; i++) {
            if(min > random[i]) {
                min = random[i];
                index=i;
            }
        } 
    return index;
    } // End Index method

    
    //To String
    public String toString() {
        String ran = "";
        for (int k = 0; k < ARRAYSIZE; k++) {
            ran += ("\n" + k + " : "+ random[k]);
        }
	return ran;
	}// End toString
    
}// End Class

