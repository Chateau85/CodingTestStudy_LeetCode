package ArryandString;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums));
    }

    private static int dominantIndex(int[] nums) {
        int maxIndex = -1, max = -1, nextMax = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                nextMax = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > nextMax) {
                nextMax = nums[i];
            }
        }

        return nextMax * 2 <= max ? maxIndex : -1;
    }
}
