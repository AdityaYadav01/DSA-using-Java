// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class Ques5 {
    public static int Factorial(int num){
        int palindrome = 0;

        while (num>0) {
            int rem = num%10;                      // Getting the last digit of a number
            num = num/10;
            palindrome = palindrome*10 + rem;

        }
        return palindrome;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int res = Factorial(num);
        if (res == num){
            System.out.println(res + " is a palindrome");
        }else{
            System.out.println(res + " is not a palindrome");
        }

        in.close();


    }
}
