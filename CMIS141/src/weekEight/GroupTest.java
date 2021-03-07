package weekEight;

public class GroupTest{
    public static void main(String[] args) {
        
        Signal test = new Signal("file.txt"); 
        
        System.out.println("Time Step: " + test.getTimeStep());
        System.out.println("Acceleration Data : " + test.getacceleration());
        System.out.println("Velocity Data : " + test.getvelocity());
        System.out.println("Displacement Data : " + test.getdisplacement());
        System.out.println("Total Number Of Points: " + test.getnumberOfPoints());
        System.out.println(test.saveData());
    }
}