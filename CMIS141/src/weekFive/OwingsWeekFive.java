package weekFive;

import java.util.*;

public class OwingsWeekFive {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] random = new int[OwingsWeekFiveClass.ARRAYSIZE];
        for (int i = 0; i < OwingsWeekFiveClass.ARRAYSIZE; i++) {
            random[i] = rd.nextInt();
        }// End for
        OwingsWeekFiveClass FirstRand = new OwingsWeekFiveClass(random);
        System.out.print("Out of the five million randomly generated integers, \nthe smallest is located at index number " + FirstRand.Index());
        
        // Uncomment the next System.out.print at your own risk.
        // If you must, at least take a few zeros from ARRAYSIZE. 
        System.out.print(FirstRand.toString());		
    }// End Main
}// End Class