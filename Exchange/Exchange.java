package Exchange;
public class Exchange {
    public static void main(String[] args) {

        //turns string into int
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int t = a;
        a = b;
        b = t;

        System.out.println(a);
        System.out.println(b);
    }
}
