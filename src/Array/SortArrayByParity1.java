package Array;

import java.util.Arrays;

public class SortArrayByParity1 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] nums2 = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
        System.out.println(Arrays.toString(sortArrayByParity2(nums2)));
    }

    private static int[] sortArrayByParity2(int[] nums2) {
        int i = 0, j = nums2.length - 1;
        while (i < j) {
            if (nums2[i] % 2 > nums2[j] % 2) {
                int temp = nums2[i];
                nums2[i] = nums2[j];
                nums2[j] = temp;
            }

            if (nums2[i] % 2 == 0) i++;
            if (nums2[j] % 2 == 1) j--;
        }
        return nums2;
    }

    private static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        for (int num : nums) {
            if (num % 2 == 1) {
                result[index++] = num;
            }
        }

        return result;
    }
}
