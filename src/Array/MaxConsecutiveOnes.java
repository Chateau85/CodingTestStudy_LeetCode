package Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        // int[] nums = {1, 1, 0, 1, 1, 1};
        // int[] nums = {1, 0, 1, 1, 0, 1};
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
        System.out.println(findMaxConsecutiveOnes2(nums));
    }

    private static int findMaxConsecutiveOnes2(int[] nums) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;
        for (int val : nums) {
            if (val == 1) {
                currentConsecutiveOnes++;
            } else {
                if (currentConsecutiveOnes > maxConsecutiveOnes) maxConsecutiveOnes = currentConsecutiveOnes;
                currentConsecutiveOnes = 0;
            }
        }
        if (currentConsecutiveOnes > maxConsecutiveOnes) maxConsecutiveOnes = currentConsecutiveOnes;
        return maxConsecutiveOnes;
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1) {
                result++;
            } else {
                if (result > max) max = result;
                result = 0;
            }
        }

        if (result > max) max = result;
        return max;
    }
}
