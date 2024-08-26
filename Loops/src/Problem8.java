import java.util.Scanner;

//Check whether a number is armstrong number or not
// Armstrong numbers are those numbers whose sum of cube is same as a number
public class Problem8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int temp = n;
        int sum =0;

        while(n>0){
            int rem = n%10;
            sum += rem*rem*rem;
            n /= 10;
        }

        if(temp==sum){
            System.out.println(sum + " is a armstrong number");
        }else{
            System.out.println("It is not a armstrong number");
        }
    }
}
