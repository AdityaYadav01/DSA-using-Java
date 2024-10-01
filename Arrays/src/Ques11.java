// Increasing a size of array

import java.util.Arrays;

public class Ques11 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        arr1 = arr2;
        System.out.println(Arrays.toString(arr1));
    }
}
