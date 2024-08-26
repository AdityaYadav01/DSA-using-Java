// Find the sum of natural numbers

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number till where you want sum of the natural numbers: ");
        int n = in.nextInt();
        int sum=0;

        for (int i = 1; i <= n ; i++) {
            sum = sum+i;
        }
        System.out.println("Sum of Natural Numbers: " + sum);

    }
}
