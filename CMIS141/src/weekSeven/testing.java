package weekSeven;

import java.util.Scanner;

public class testing {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Type a sentence about CMIS 141 make sure to include the professors first name");
        String name = (sc.nextLine());
        if (name.contains("Jeffery")) {
            // https://www.tutorialspoint.com/java/java_string_replacefirst.htm
            name.replaceAll("Jeffery", "Jeffrey");
            System.out.println(name);
        } else {
            System.out.println("You might have spelled the professors name correct...");
            
        }
        
    }
    
}