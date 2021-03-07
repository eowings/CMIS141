package weekSeven;

public class JavaName {
    
    public static void main(String[] args) {
        if (args[0].contains(".java")) {
            String sourceCode = args[0];
            System.out.print(sourceCode + " is a Java program");
        } else {
            String wrongSourceCode = args[0];
            System.out.print(wrongSourceCode + " this program is not a Java program. ");
            
        }        
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
