// Display G.P Series
import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first term: ");
        int a = in.nextInt();

        System.out.println("Enter the common difference: ");
        int d = in.nextInt();

        System.out.println("Enter the nth term: ");
        int n = in.nextInt();

        System.out.println("The G.P Series is ");

        for (int i = 0; i < n; i++) {
            System.out.print(a+ " ");
            a = a*d;
        }


    }
}
