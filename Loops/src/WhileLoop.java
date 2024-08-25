import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /* Syntax for While Loop:-
        *       while(condition){
        *                //body
        *            }
        *            increment/decrement if required */

        // Print the number from 1 to 10 using while loop

        int num = 1;
        while(num <= 10){
            System.out.print(num + " ");
            num++;
        }
        System.out.println(); // For adding Space

        // Print the number from 1 to n using while loop

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number till where you want to print counting: ");
        int count = in.nextInt();

        int num2 = 1;
        while(num2<=count){
            System.out.print(num2 + " ");
            num2++;
        }



    }
}
