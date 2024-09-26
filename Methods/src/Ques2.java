// Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        EvenOdd(num);

    }
    public static void EvenOdd(int num){
        if(num % 2 == 0){
            System.out.println(num + " is a even number");
        }else{
            System.out.println(num + " is a odd number");
        }
    }
}
