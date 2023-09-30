/*
 *  
 * Write the DogWalker program inside the main method
 * according to the assignment description.
 * 
 * To compile:
 *        javac DogWalker.java
 * To execute:
 *        java DogWalker 5
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 *
 */
public class DogWalker {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;

        System.out.println("(0, 0)");

        for (int i = 1; i <= n; i++) {
            double direction = Math.random();
            if(direction < 0.25){
                x++; 
            }else if(direction < 0.5){
                x--; 
            }else if(direction < 0.75){
                y++; 
            }else{
                y--; 
            }

            System.out.println("(" + x + ", " + y + ")");
        }

        double Distance = x * x + y * y;
        System.out.println("Squared Distance " + Distance);
    }
}

