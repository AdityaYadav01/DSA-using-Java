// Print whether a number is even or odd, also take input from user
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is even number");
        }
        else{
            System.out.println(num + " is odd number");
        }
    }
}
