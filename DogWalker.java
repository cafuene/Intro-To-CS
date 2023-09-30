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
        double direction = 0.0;

        for (int i = 0; i <= n; i++) {
            System.out.println("(" + x +"," + y +")");

            direction = Math.random();

            if(direction <= 0.25){
                y++;

            }else if(direction >= 0.26 && direction <= 0.5){
                x++;

            }else if(direction >= 0.51 && direction <= 0.75){
                y--;

            }else if(direction >= 0.76){
                x--;
            }

            
                
            }
            double distance = Math.pow(x, 2) + Math.pow(y, 2);
           System.out.println("Squared distance =" + distance);
        }
			   
    }

