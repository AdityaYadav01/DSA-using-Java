// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;
public class Ques7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int n1 = in.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = in.nextInt();

        System.out.println("The Prime number between " + n1 + " and " + n2 + " are ");
        int i,j;

        for (i = n1; i <= n2 ; i++) {
            for ( j = 2; j <= i ; j++) {
                if(i%j==0){
                    break;
                }
            }

            if(i==j)
                System.out.print(j + " ");

        }
    }
}
