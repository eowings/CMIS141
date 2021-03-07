package weekSix;

import java.util.Scanner;

public class KeurigTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        //int on = 1;
        Keurig.setPower(2);    
        
        System.out.print("Press 1 to turn ON Keurig or 2 to exit, followed by enter ");
        //on = sc.nextInt();
        Keurig.setPower(sc.nextInt());
        if (!Keurig.powerButton) {
            System.out.println("Why are you standing in front of the coffee machine?");
            return;
            } else {

                System.out.print(Keurig.powerSet() + "\n");
                Keurig[] coffee = new Keurig[1];
                for  ( int i = 0; i < coffee.length; i++) {
                    System.out.print("Enter your coffee size 6,8,10 or 12oz ");
                    String size = sc.next();
                    System.out.print("Press 1 and enter if you prefer strong brew 2 if you want regular. ");
                    int st = sc.nextInt();
                    coffee[i] = new Keurig(size, st);
                }
        System.out.print(coffee[0].brewCoffee());
        }
        
    }
}
