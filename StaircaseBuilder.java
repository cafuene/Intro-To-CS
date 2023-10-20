/*
 * Write your program inside the main method to build
 * a staicase in a 2D array of characters according
 * to the assignment description
 *
 * To compile:
 *        javac StaircaseBuilder.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class StaircaseBuilder {
    
    public static void main(String[] args) {

        int d = Integer.parseInt(args[0]);
        int bricks = Integer.parseInt(args[1]);
        int bricksRemaining = bricks;
        

        char[][] stair = new char[d][d];

        for(int col = 0; col < d; col++){
            for(int row = d - 1 ; row >= (d - 1) - col; row--){
                if(bricksRemaining > 0){
                    stair[row][col] = 'X';
                    bricksRemaining--;
                    
                }   

            }

        }

        for(int row = 0; row < stair.length; row++){
            for(int col = 0; col < stair.length; col++){
                char temp = stair[row][col];
                if (temp == 'X'){
                    System.out.print('X');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println("Bricks remaining: " + bricksRemaining);

        }
        
    }

