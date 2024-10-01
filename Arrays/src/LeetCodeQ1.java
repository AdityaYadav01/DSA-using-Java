/* Running Sum of 1d Array */

import java.util.Arrays;

public class LeetCodeQ1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] res = runningSum(nums);
        System.out.println(Arrays.toString(res));

    }
        public static int[] runningSum(int[] nums) {
            int[] RunSum = new int[nums.length];
            int sum = 0;

            for(int i = 0; i<nums.length; i++){
                sum += nums[i];
                RunSum[i] = sum;
            }
            return RunSum;

        }
    }

