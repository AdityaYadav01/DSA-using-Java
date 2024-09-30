import java.util.Arrays;

// Rotating an array
public class Ques5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int temp = arr[arr.length-1];

        for (int i = arr.length-2; i >=0 ; i--) {
            arr[i+1] = arr[i];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));

    }
}
