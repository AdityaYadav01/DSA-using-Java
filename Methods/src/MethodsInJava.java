// Method/Function - It is a block of code.
// Create a method/function for sum()

import java.util.Scanner;

public class MethodsInJava {
    public static void main(String[] args) {
        sum();

    }
    static void sum(){                           // access modidifier, return type , Name of the method()
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the Second number: ");
        int num2 = in.nextInt();

        System.out.println("THe Sum is : "+ (num1+num2));
    }
}
