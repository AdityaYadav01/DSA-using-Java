import java.util.Scanner;

//Display a A.P series
public class Problem11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the ath term: ");
        int a = in.nextInt();

        System.out.println("Enter the common difference: ");
        int d = in.nextInt();

        System.out.println("Enter the nth term: ");
        int n = in.nextInt();


        for (int i = 0; i <n ; i++) {
            System.out.print(a + " ");
            a = a+d;
        }


    }
}
