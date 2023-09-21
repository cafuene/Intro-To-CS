public class Variables {
    public static void main(String[] args) {

   // This is a comment

   /* this 
      is 
      a multiline comment
      */
   
    int x = 2;
    int y = 21;
    int z = 15;
 
    int xx = 5;
    System.out.println(xx);
    xx = xx + 1;
    System.out.println(xx);
    xx += 1;
    System.out.println(xx);
    xx++;
    System.out.println(xx);


    //*******************************************************
    // regular division
    int divZbyX = z / x;
    System.out.println(" z/x : " + divZbyX);

    // irregualr division
    int divYbyX = y / x;
    System.out.println(" y/x : " + divYbyX);

    // modulus
    int remainder = y % x;
    System.out.println("remainder : " + remainder);

    // use double
    double divYbyXreal = (y * 1.0) / (x);
    System.out.println(" y/x real " + divYbyXreal);

    //******************************************************************/
    // Math Library
    double ceil = Math.ceil(divYbyXreal);
    System.out.println(" ceiling of y/x : " + ceil);
    System.out.println("square root of " + x + " is " + Math.sqrt(x));

    // *******************************************************************
    // Booleans
    boolean a = true;
    boolean nota = !a;
    System.out.println("a : " + a + " and a not is: " + nota);

    String w = "Lars";
    System.out.println(w);
  
    }
}