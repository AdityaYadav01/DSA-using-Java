// Find sum of all elements in an array

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            sum = arr[i] + sum;

        }
        System.out.println("Sum of all element is "+ sum);
    }
}
