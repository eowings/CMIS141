package weekFive;
import java.util.*;  
public class Group3 {
	   public static void main(String []args){
	      int scores [ ] [ ] = new int [3] [5];
	              
	      //creating object of Scanner class
	      Scanner input = new Scanner(System.in); 
	      
	      System.out.println ("Enter 5 grades for each of three students");
	      for  ( int i = 0; i < 3; i++){
	         System.out.println ("Enter 5 test scores for Student " + (i + 1) );
	         for ( int j = 0; j < 5; j++) {
	            System.out.print ("Enter test  score " + (j + 1) + " \n>> ");
	            scores [i] [j] = input.nextInt();          
	         } // for j < 5
	      } // for i < 3
	      System.out.println ("\n\nYou entered\n\n");
	      for  ( int i = 0; i < 3; i++){
	        System.out.print ("For Student " + (i + 1) );
	        for ( int j = 0; j < 5; j++) {
	           System.out.print ("\t" + scores [i] [j] );          
	         } // for j < 5
	         System.out.println ();
	      } // for i < 3
	   } // main
	 } // class TwoDimensionEnter

	     
