import java.util.Scanner;
public class BasicsOfLoop {

    /*Syntax of For-Loop:
    *     for(initialization, condition, increment/decrement){
    *                  //body
    *        }
    * */


    // Print number from 1 to 10
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); // To add the Space

            // Print number from 1 to n take input from user.
            Scanner in = new Scanner(System.in);

            System.out.print("Enter the number till where you want to print the number: ");
            int num = in.nextInt();

            for (int i = 1; i <=num ; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            // Print the table of 2
            int num1 = 2;
            for (int i = 1; i <= 10 ; i++) {
                int res = num1*i;
                System.out.println(num1 + "*" + i + "=" + res);
            }

        }
    }

