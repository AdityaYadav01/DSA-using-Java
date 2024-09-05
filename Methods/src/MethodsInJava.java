// Method/Function - It is a block of code.
// Create a method/function for sum()

import java.util.Scanner;

public class MethodsInJava {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println("The Sum is: "+ans);
        String msg = greet();
        System.out.println(msg);


    }
    static void sum(){                           // access modidifier, return type , Name of the method()
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the Second number: ");
        int num2 = in.nextInt();

        System.out.println("THe Sum is : "+ (num1+num2));
    }

    //Return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the Second number: ");
        int num2 = in.nextInt();

        int sum2 = num1+num2;
        return sum2;   // Method will stop working here
    }

    // Return a String
    static String greet(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message = in.nextLine();
        return message;
    }
}
