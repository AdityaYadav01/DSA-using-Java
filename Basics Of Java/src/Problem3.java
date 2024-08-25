import java.util.Scanner;

// Input currency in rupees and output in USD.
public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount of rupees: ");
        float rupees = in.nextFloat();

        float USD = (float)(rupees/83.91);   // 83.91 is the current value of USD Dollar
        System.out.println("You have " + USD + " dollars in your account");

    }
}
