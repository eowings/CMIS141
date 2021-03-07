package weekSix;

import java.util.Scanner;

public class Group4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double setRate = 2.25;
        SavingsAccount.changeRate(setRate);
        SavingsAccount[] Group4One = new SavingsAccount[5]; 
        

     
        for  ( int i = 0; i < Group4One.length; i++) {
            
            System.out.print("Enter your name: ");
            String name = sc.next();
            System.out.print("How much are you depositing today? ");
            double balance = sc.nextDouble();
            Group4One[i] = new SavingsAccount(name, balance);
        }
        
        
        System.out.print(Group4One[0].toString());
        System.out.print(Group4One[1].toString());
        System.out.print(Group4One[2].toString());
        System.out.print(Group4One[3].toString());
        System.out.print(Group4One[4].toString());
    }

}
