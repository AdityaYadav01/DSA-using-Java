// Finding a maximum element in an array

public class Ques3 {
    public static void main(String[] args) {
        int[] arr = {10,32, 44, 65, 6, 78, 50};
        int max = 0;

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("The maximum element in an array is " + max);
    }
}
