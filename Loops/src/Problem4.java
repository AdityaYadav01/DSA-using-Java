import java.util.Scanner;

// Counting Occurrence
public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        long num = in.nextLong();

        System.out.println("Enter the number which you want to count: ");
        int num2 = in.nextInt();

        int count=0;
        while(num>0){
            long rem = num%10;
            if(rem == num2){
                count++;
            }
            num = num/10;
        }
        System.out.println(num2 + " is occuring " + count + " time");

    }
}
