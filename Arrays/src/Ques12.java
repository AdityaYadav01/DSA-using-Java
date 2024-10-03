// Adding 2 Matrices

import java.util.Arrays;

public class Ques12 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] sum = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }

        for(int[] x:sum){
            for (int y:x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
