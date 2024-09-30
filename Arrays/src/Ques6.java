// Swaping the elements in array

import java.util.Arrays;

public class Ques6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};   //Declaring and initializing the array
        swap(arr, 0,1);  // Swap method to swap the value at indicies 0 and 1
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
