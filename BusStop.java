/*
 * Write your program inside the main method to find the order
 * which the bus the student needs to take will arrive
 * according to the assignemnt description. 
 *
 * To compile:
 *        javac BusStop.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class BusStop {

    public static void main(String[] args) {


        int[] bus = new int[args.length]; //creates an array the length of the arguments
        for(int i = 0; i < args.length; i++){ //goes though each arg and parses into int
            bus[i] = Integer.parseInt(args[i]); 
        } //adds new int into array
        
        int temp = 0;
        for(int i = 0; i < bus.length - 1; i++){
            if (bus[i] == bus[bus.length - 1]){
                System.out.println(i + 1);
                temp++;
                break;
                
            }
            
        }
        if (temp == 0){
            System.out.println("1000");

        }
        
    }
    
}
