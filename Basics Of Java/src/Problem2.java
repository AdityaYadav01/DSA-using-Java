// Take 2 numbers as input and print the largest number.
import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num1 == num2){
            System.out.println("Both are equal");
        }
        else{
            System.out.println(num2 + " is greater than " + num1);
        }


    }
}
