package weekSeven;

import java.util.*;

public class NameCheck {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Type a sentence about CMIS 141 make sure to include the professors first name");
        String name = (sc.nextLine());
        StringBuilder nameFix;
        name = name.toLowerCase();
        if (name.contains("jeffery")) {
            System.out.print("The professors first name was misspelled at index position(s) ");
            int index1 = 0;
            nameFix = new StringBuilder(name.toLowerCase());
            while ((index1 = nameFix.indexOf("jeffery", index1)) != -1) {
                System.out.print(" [" + index1 + "] ");
                nameFix.replace(index1, (index1 + 7), "Jeffrey");
                index1++;
            }
            System.out.print(".  Correcting error now... \n\n");
            System.out.println(nameFix.toString());
        } else {
            System.out.println("You might have spelled the professors name correct...");
            
        }
        
    }
    
}
