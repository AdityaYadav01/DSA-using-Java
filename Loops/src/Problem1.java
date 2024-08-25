import java.util.Scanner;

// Find the Largest of 3 numbers
public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.println("Enter the Third number: ");
        int num3 = in.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is the largest number");
        } else if(num2>num1 && num2>num3){
            System.out.println(num2 + " is the largest number");
        } else{
            System.out.println(num3 + " is the largest number");
        }

        // Another Method
        int max = num1;
        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        System.out.println(max);



    }
}
