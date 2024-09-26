// Create a method to check whether a number is armstrong number or not

import java.util.Scanner;

public class Ques8 {

    public static boolean ArmstrongNumber(int n){
        int sum = 0;
        int temp = n;

        while(n>0){
            int rem = n%10;
            int cube = (rem*rem*rem);
            sum += cube;
            n /= 10;

        }
        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = in.nextInt();


        if(ArmstrongNumber(num)){
            System.out.println(num + " is a armstrong number");
        }else{
            System.out.println(num + " isn't a armstrong number");
        }

        // Printing all 3 digit armstrong numbers

        System.out.print("All three digit armstrong numbers are: ");
        for (int i = 100; i <= 999 ; i++) {
            if (ArmstrongNumber(i)){
                System.out.print(i + " ");
            }

        }
    }
}
