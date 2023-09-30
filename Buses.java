/*
 *
 * Write the Buses program inside the main method
 * according to the assignment description.
 * 
 * To compile:
 *        javac Buses.java
 * To execute:
 *        java Buses 7302
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */

public class Buses {
    public static void main(String[] args) {

       int number = Integer.parseInt(args[0]);
       int sum = 0;
       int lastD = 0;
       int n = 4;

       if (number < 0) {
        System.out.println("Error");
       }
       else{
        while (n > 0) {
            lastD = number % 10;
            sum = sum + lastD;
            number = number/10;
            n--;
            
            }
        if (sum % 2 == 0) {
            System.out.println("LX");
            
            }
        else{
            System.out.println("H");
            }
        }

    }
}
