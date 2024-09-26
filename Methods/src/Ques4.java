import java.util.Scanner;

// Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
public class Ques4 {
    public static long Factorial(int num){
        if(num<=1){
            return num;
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result*i;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = in.nextInt();

        long res = Factorial(number);
        System.out.println(res + " is a factorial");
    }
}
