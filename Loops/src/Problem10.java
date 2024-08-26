// Q. Display a number in words even tailing with 0
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = in.nextInt();
        String str = "";

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            str = str + rem;
        }
        //System.out.println(str);

        char ch;
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            switch (ch) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
            }
        }



    }
}
