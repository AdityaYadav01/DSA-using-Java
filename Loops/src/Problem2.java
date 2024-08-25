import java.util.Scanner;

// Check whether the alphabet is uppercase or lowercase
public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the string or char: ");
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch<='z'){
            System.out.println(ch + " is lowercase");
        }else{
            System.out.println(ch + " is uppercase");
        }


    }
}
