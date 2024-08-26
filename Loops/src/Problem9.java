// Check if the number is palindrome or not
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int temp = n;
        int palindrome = 0;

        while(n>0){
            int rem = n%10; // Get the last digit of number
            palindrome = palindrome*10+rem;
            n /= 10;
        }
        if(temp==palindrome){
            System.out.println(temp + " is a palindrome number");
        }else{
            System.out.println("It is not a palindrome number");
        }

    }
}
