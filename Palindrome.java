/*
 * Write the Palindrome program inside the main method
 * according to the assignment description.
 * 
 * To compile:
 *        javac Palindrome.java
 * To execute:
 *        java Palindrome 5 4 6 6 4 5
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */

public class Palindrome {
    public static void main(String[] args) {
       
        boolean p = (Integer.parseInt(args[0]) == Integer.parseInt(args[5]) && Integer.parseInt(args[1]) == Integer.parseInt(args[4]) && Integer.parseInt(args[2]) == Integer.parseInt(args[3]));
        System.out.println(p);
    }
}
