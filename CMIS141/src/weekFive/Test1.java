package weekFive;

import java.util.Random;

public class Test1 {
    int rand1 [][];
    
    public Test1 () {
        Random rand2 = new Random();
        for ( int i = 0; i < 5; i++) {
            for ( int j = 0; j < 10; j++) {
                rand1[i][j] = (int)rand2.nextInt(10);
            }
        }
            
    }

    
    
    //To String
    public String toStrings() {
        String ran1 = "", ran2 = "";
        for (int i = 0; i < 5; i++) {
            ran1 += rand1[i];
            for (int j = 0; j < 10; j++) {
                ran2 += rand1[i][j] + "";
               }
        }
        return ran1 + ran2;
    
    }// End toString
    
}