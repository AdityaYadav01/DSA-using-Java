// Deleting an element in array

import java.util.Arrays;

public class Ques9 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 12;
        arr[5] = 7;
        System.out.println(Arrays.toString(arr));

        int index = 1;
        int n = 6;

        for (int i = index; i < n ; i++) {
            arr[i] = arr[i+1];

        }
        System.out.println(Arrays.toString(arr));

    }
}
