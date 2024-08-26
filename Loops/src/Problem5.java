import java.util.Scanner;

// Q. Reverse the order of number. Ex - 12345 to 54321
public class Problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number which you want to reverse: ");
        int num = in.nextInt();

        int reverse = 0;
        while(num>0){
            int rem = num%10;
            reverse = reverse*10 + rem;
            num /= 10;
        }

        System.out.println("The Reverse order is " + reverse);

    }
}
