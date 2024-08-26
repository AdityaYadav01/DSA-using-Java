import java.util.Scanner;

// Factorial of a number
public class Problem7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long n = in.nextLong();
        long fact = 1;

        for (int i = 1; i <=n ; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
