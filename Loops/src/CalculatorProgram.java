import java.io.IOException;
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = in.nextDouble();

        System.out.println("Enter the Second number: ");
        double num2 = in.nextDouble();

        System.out.println("Select your operation(+,_,%,/): ");
        char operator = (char) System.in.read();

            if (operator == '+') {
                System.out.println(num1 + num2);
            } else if (operator == '-') {
                System.out.println(num1 - num2);
            } else if (operator == '*') {
                System.out.println(num1 * num2);
            } else if (operator == '/') {
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("You can't divide by 0");
                }
            } else if (operator == '%') {
                System.out.println(num1 % num2);
            } else {
                System.out.println("Invalid operation");
            }
        }
    }