package weekFive;

import java.util.*;

public class Group2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Group2class Group2One = new Group2class();
        System.out.print(Group2One.Index());
        System.out.print("\n\n");
	System.out.println ("Enter five doubles below.");
	double[] nums = new double [Group2class.ARRAYSIZE];
	for  ( int i = 0; i < 5; i++) 
		 nums [i] = sc.nextDouble();
        Group2class Group2Two = new Group2class(nums);
        System.out.print(Group2Two.Index()+1);
    }
}		