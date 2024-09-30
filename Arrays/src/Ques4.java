// Finding the second largest number

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,5,6,7,8,1,2,3};
        int max = 0;
        int max2 = 0;

        for(int j : arr){
            if(j>max){
                max2 = max;
                max = j;
            }
        }
        System.out.println(max2);
    }
}
