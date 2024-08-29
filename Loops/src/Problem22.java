import java.util.Scanner;

// Find nCr
public class Problem22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the value of n: ");
        int n = in.nextInt();

        System.out.println("enter the value of r: ");
        int r = in.nextInt();
        
        int Nfact = 1;
        int Rfact = 1;
        int NRfact = 1;

        if(r>n){
            System.out.println("Invalid Operation"); //nCr is not defined when r>n
            return; // Exit the program
        }

        for (int i = 2; i <= n ; i++) {
            Nfact = Nfact*i;
        }
        for (int i = 2; i <= r ; i++) {
            Rfact = Rfact*i;
        }
        for (int i = 2; i <= (n-r) ; i++) {
            NRfact = NRfact*i;

        }
        int res = Nfact/(Rfact*NRfact);
        System.out.println("The nCr value is "+res);
        in.close();





    }
}
