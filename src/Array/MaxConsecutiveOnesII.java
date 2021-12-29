package Array;

public class MaxConsecutiveOnesII {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
        System.out.println(findMaxConsecutiveOnes2(nums));
    }

    private static int findMaxConsecutiveOnes2(int[] nums) {
        int longestSequence = 0;
        int left = 0;
        int right = 0;
        int numZeroes = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                numZeroes++;
            }

            while (numZeroes == 2) {
                if (nums[left] == 0) {
                    numZeroes--;
                }
                left++;
            }

            longestSequence = Math.max(longestSequence, right - left + 1);
            right++;
        }
        return longestSequence;
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0, prev = 0, seenZero = 0;

        for (int num : nums) {
            if (num == 0) {
                seenZero = 1;
                prev = curr;
                curr = 0;
            } else {
                curr++;
            }
            max = Math.max(max, curr + prev + seenZero);
        }
        return max;
    }
}
