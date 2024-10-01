// Inserting an element in an array


import java.util.Arrays;

public class Ques8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 12;
        arr[5] = 7;
        System.out.println(Arrays.toString(arr));

        int x = 15;
        int index = 2;

        for (int i = 6; i > index; i--) {
            arr[i] = arr[i-1];

        }
        arr[index] = x;
        System.out.println(Arrays.toString(arr));

    }
}
