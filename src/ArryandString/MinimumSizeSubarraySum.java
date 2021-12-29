package ArryandString;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
        System.out.println(minSubArrayLen2(target, nums));
    }

    private static int minSubArrayLen2(int target, int[] nums) {
        int i = 0, n = nums.length, result = n + 1;
        for (int j = 0; j < n; j++) {
            target -= nums[j];
            while (target <= 0) {
                result = Math.min(result, j - i + 1);
                target += nums[i++];
            }
        }
        return result % (n + 1);
    }

    private static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int result = Integer.MAX_VALUE;
        int l = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i + 1 - l);
                sum -= nums[l++];
            }
        }
        return result != Integer.MAX_VALUE ? result : 0;
    }
}
