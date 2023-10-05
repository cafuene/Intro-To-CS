public class Summation {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 0; i <= num;i++){

            sum = sum + i;
        }
        System.out.println(sum);
    }
}
