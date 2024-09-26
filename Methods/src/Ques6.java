// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class Ques6{
    public static int Sum(int n){
        int res = 0;
        for (int i = 1; i <= n ; i++) {
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number till where you want to find the sum: ");
        int num = in.nextInt();

        int result = Sum(num);
        System.out.println("The Sum is "+ result);

    }
}