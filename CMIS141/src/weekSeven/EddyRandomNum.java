package weekSeven;

public class EddyRandomNum {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        double y = Integer.parseInt(args[1]);
        for (int i = 0 ; i < x; i++){
            double rd = (double) (Math.random() * y);
            System.out.printf("\n%.2f", rd);
        }
        
    }

}
