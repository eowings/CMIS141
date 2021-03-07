package weekSix;

public class Keurig {
    private String coffeeSize;// 6,8,10,12oz
    boolean strong;
    static boolean powerButton;
    
    //Default constructor
    public Keurig () {
        coffeeSize = "10"; 
        strong = false;
        powerButton = true;
    }

    //Constructor
    public Keurig (String size, int st) {
        coffeeSize = size;
        boolean setSt;
        if (st == 1) {
            setSt = true;
        } else {
            setSt = false;    
        }
        strong = setSt;
    }
    
    //Method
    public static String powerSet() {
        String notify;
        if (powerButton == true) {
            notify = "Keurig is on";
        } else {
            notify = "Keurig is off";
        }
        return notify;
  
    }
    
    //Method
    public String strongSet() {
        String notify1;
        if (strong == true) {
            notify1 = "will be strong.";
        } else {
            notify1 = "will not be strong.";
        }
        return notify1;  
    }
    
    //Method
    public static void setPower(int on) {
        boolean setOn;
        if (on == 1) {
            setOn = true;  
        } else {
            setOn = false;
        }
        powerButton = setOn;
    }
    
    //Method
    public static boolean isOn() {
        return powerButton;   
    }
    
    //Method
    public boolean isStrong() {
        return strong;   
    }
    
    //Method
    public String isSize() {
        return coffeeSize;   
    }
    
    //Method
    public String brewCoffee() throws InterruptedException{
        System.out.print("You are making a " + isSize() + "oz coffee that " + strongSet() + "\nBrewing coffee please wait. \nWater is nearly heated....\n");
        Thread.sleep(5000);
       // Copied below loading animation effect code from: 
       // https://kodejava.org/how-do-i-create-a-console-progress-bar/
       // note there is a bug in eclipse where the \r carriage return acts
       // the same as \n new line, if ran in eclipse it wont be as pretty.
        char[] animationChars = new char[]{'|', '/', '-', '\\'};

        for (int i = 0; i <= 100; i++) {
            System.out.print(" Filling cup: " + i + "% " + animationChars[i % 4] + "\r");
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }// End loading animation
        String brewdone = "Coffee is ready, enjoy.";
        return brewdone;
        
    }//End brewCoffee2
    
    
}//End Class
