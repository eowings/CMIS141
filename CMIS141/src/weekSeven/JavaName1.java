package weekSeven;

public class JavaName1 {
    public static void main(String[] args) {
        String program = args[0];
        StringBuilder sb = new StringBuilder(program);
        int index1 = 0;
        while ((index1 = program.indexOf('.', index1)) != -1) {
            System.out.print(index1);
            index1++;            
            if (program.substring(index1, 15) == "java") { 
                System.out.print("YES " + program);               
            } else {
                System.out.print("NO"); 
            }
        }

        //if (sb) {}
        
       
        
            
            //System.out.print(sb);
        
    }

}



/*
 * Create a program, called JavaName, that will have a single command line argument. 
 * The argument is the full name of a file that should end with .java. That is, the program 
 * wants the name to be the name of a file containing java source code. Check the name in 
 * the command line argument to make sure it ends with .java. If it does, output it to the user, 
 * and save it in the program in a string object named sourceCode. If the file name does not end 
 * with java, output the full name in the command line argument along with an appropriate error 
 * message.
 * You will not know the length of the name before the period.  Look for .java by going to the 
 * last character in the command line argument, and work towards the start, checking to see if the
 * character is a period. If it is a period, look to see if all of the characters after the 
 * period spell java. Note that case matters, so it should not be, for example Java
 */
