package weekSix;

import java.util.*;

public class Group2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zip = "";
        MarylandResident2[] Group2One = new MarylandResident2[5];  
     
        for  ( int i = 0; i < Group2One.length; i++) {
            
            System.out.print("Enter your name ");
            String na = sc.next();
            System.out.print("Enter your 5 digit zip code ");
            zip = sc.next();
            Group2One[i] = new MarylandResident2(na, zip);
            
            while (!Group2One[i].isFound()){
                System.out.println("Enter a MD zipcode please");
                System.out.print("Enter your 5 digit zip code ");
                zip = sc.next();
                Group2One[i] = new MarylandResident2(na, zip);
                
            }
       }


        //Group 2 test
        System.out.println(Group2One[0].toString());
        System.out.println(Group2One[1].toString());
        System.out.println(Group2One[2].toString());
        System.out.println(Group2One[3].toString());
        System.out.println(Group2One[4].toString());
        
    }
    
}
