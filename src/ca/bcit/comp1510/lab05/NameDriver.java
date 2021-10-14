/**
 * 
 */

package ca.bcit.comp1510.lab05;

import java.util.Scanner;

/**
 * Test the name class.
 * @author Junsang(Jason) Yoo
 * @version 2021
 *
 */

public class NameDriver {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Name name;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = scan.next();
        System.out.println("What is your middle name?"
                + "(if you do not have, just space and enter)");
        String middleName = scan.next();
        System.out.println("What is your last name?");
        String lastName = scan.next();
        
        name = new Name(firstName, middleName, lastName);
        
        name.setFirstName(firstName);
        name.setMiddleName(middleName);
        name.setLastName(lastName);
        
        System.out.println("The name is " + name.lastFirst());
        
        System.out.println("The length of the name is " + name.length() 
                + "\nThe initial of the name is " + name.initial());
        
        System.out.println("Enter the number n to know the nth character"
                + " in the full three part name.");
        int n = scan.nextInt();
        
        System.out.println(n + "th character in the full three part name is "
                + name.nthChar(n));
        
        System.out.println("Enter your first name");
        String answer = scan.next();
        
        System.out.println(name.equal(answer));
        
        System.out.println("Re-enter the name\n"
                + "First name:");
        
        String newFirst = scan.next();
        
        System.out.println("Middle name:");
        
        String newMiddle = scan.next();
        
        System.out.println("Last name:");
        
        String newLast = scan.next();
        
        Name newName = new Name(newFirst, newMiddle, newLast);
        
        newName.setFirstName(newFirst);
        newName.setMiddleName(newMiddle);
        newName.setLastName(newLast);
        
        System.out.println(name.compare(newName));
        scan.close();
    }

}
