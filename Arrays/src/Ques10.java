// Copying an array


import java.util.Arrays;
import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr1 = new int[10];
        System.out.println("Enter the 10 elements of an array: ");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[10];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];

        }
        /*             OR
        *       System.arraycopy(arr1, 0, arr2, 0, arr2.length);
        * */

        System.out.println(Arrays.toString(arr2));

    }
}
