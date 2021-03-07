package weekSeven;
import java.util.Scanner;

public class ProfName {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

         final StringBuilder PROF_NAME = new StringBuilder("Jeffrey");

         StringBuffer userSpelling = new StringBuffer();
        
        System.out.print("Please enter the Professor's first name: ");
        
        userSpelling.append(sc.nextLine());


        if (!(PROF_NAME.equals(userSpelling))) {

          for (int i = 0; i < PROF_NAME.length(); i++) {

          
              if (!(PROF_NAME.charAt(i) == userSpelling.charAt(i))) {

                String tempChar = String.valueOf(PROF_NAME.charAt(i));
                
                 userSpelling.replace(i,i, tempChar);
                                  
              }//if2 replace
           }//for loop
       
        userSpelling.delete(PROF_NAME.length(),userSpelling.length());

        }//if1 names equal

   System.out.println("Professor Name; " + PROF_NAME);
   System.out.println("User input name is now : " + userSpelling);
        
                
  }
}
