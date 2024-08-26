import java.util.Scanner;

// Fibonacci Series In Java Programs
public class Problem3 {
    public static void main(String[] args) {
        // Q. Find the nth fibonacci number
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth fibonnaci number: ");
        int n = in.nextInt();
        
        int num1 = 0;
        int num2 = 1;

        if(n<=1){
            System.out.println(n);
            return;
        }


        for (int i = 2; i <= n; i++) {
            int sum = num1+num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println(num2);
    }
}
