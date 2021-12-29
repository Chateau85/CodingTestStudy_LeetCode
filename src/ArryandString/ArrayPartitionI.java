package ArryandString;

import java.util.Arrays;

public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};
        System.out.println(arrayPairSum(nums));
    }

    private static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                maxSum += nums[i];
            }
        }
        return maxSum;
    }
}
