// Create a method to check whether a number is armstrong number or not

import java.util.Scanner;

public class Ques8 {

    public static int ArmstrongNumber(int n){
        int sum = 0;

        while(n>0){
            int rem = n%10;
            int cube = (rem*rem*rem);
            sum += cube;
            n /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = in.nextInt();

        int res = ArmstrongNumber(num);

        if(res == num){
            System.out.println(num + " is a armstrong number");
        }else{
            System.out.println(num + " isn't a armstrong number");
        }
    }
}
