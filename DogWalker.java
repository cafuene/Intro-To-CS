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

        System.out.println("Step 0: (0, 0)");

        for (int step = 1; step <= n; step++) {
            double random = Math.random();
            if (random < 0.25) {
                x++; // move east
            } else if (random < 0.5) {
                x--; // move west
            } else if (random < 0.75) {
                y++; // move north
            } else {
                y--; // move south
            }

            System.out.println("Step " + step + ": (" + x + ", " + y + ")");
        }

        double squaredDistance = x * x + y * y;
        System.out.println("Squared Euclidean distance from the origin: " + squaredDistance);
    }
}

