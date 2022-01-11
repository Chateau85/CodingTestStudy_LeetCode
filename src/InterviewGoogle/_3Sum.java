package InterviewGoogle;

import java.util.*;

public class _3Sum {
    public static void main(String[] args) {
        // int[] nums = {-1, 0, 1, 2, -1, -4};
        // int[] nums = {0, 0, 0, 0};
        int[] nums = {-1, 0, 1, 0};
        System.out.println(threeSum(nums));
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        if (nums.length == 0) {
            return new ArrayList<>(result);
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
