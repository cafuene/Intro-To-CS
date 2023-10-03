public class ArrayCriteria {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int myArray[];
        myArray = new int[n];

        System.out.println(myArray.length);

        for(int i = 0; i < n; i++){
            myArray[i] = (i+1);
            System.out.println(i + " : " + myArray[i]);
            
        }

        System.out.println("***********");


        for(int i = 0; i < myArray.length; i++){

            if(myArray[i] % 2 == 0){
                System.out.println(i + " : " + myArray[i]);
            }
        }
        //System.out.println(myArray);
    }
}
