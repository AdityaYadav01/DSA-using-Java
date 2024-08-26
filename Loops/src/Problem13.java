//Display Fibonacci Series
import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth term for fibonnaci series: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        System.out.print("The Fibonacci series is " + a + " "+b+" ");

        for (int i = 2; i <=n ; i++) {
            int c = a+b;
            System.out.print(c + " ");
            a = b;  // Swapping the values
            b = c;
        }


    }
}
