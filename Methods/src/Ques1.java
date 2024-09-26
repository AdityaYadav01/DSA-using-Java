// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println("Enter third number: ");
        int num3 = in.nextInt();


        int max = maximum(num1, num2, num3);
        System.out.println(max + " is the largest number among these 3 numbers");

        int min = minimum(num1, num2, num3);
        System.out.println(min + " is the smallest number among these 3 numbers");
    }

    static int maximum(int num1, int num2, int num3) {
        if(num1>num2 && num1>num3){
            return num1;
        } else if (num2>num1 && num2>num3) {
            return num2;
        } else{
            return num3;
        }
    }


    static int minimum(int n1, int n2, int n3){
        if(n1<n2 && n1<n3){
            return n1;
        } else if (n2<n1 && n2<n3) {
            return n2;
        }else{
            return n3;
        }


    }

}
