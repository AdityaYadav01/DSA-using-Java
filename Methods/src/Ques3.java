
import java.util.Scanner;

public class Ques3 {
    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        boolean result = isPrime(num);

        if(result){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}
