package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SquaresofaSortedArray1 {
    public static void main(String[] args) {
        // int[] nums = {-4, -1, 0, 3, 10};
        int[] nums = {-7, -3, 2, 3, 11};
        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] nums3 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
        System.out.println(Arrays.toString(sortedSquares2(nums2)));
        System.out.println(Arrays.toString(sortedSquares3(nums3)));
    }

    private static int[] sortedSquares3(int[] nums3) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums3) {
            pq.add(i * i);
        }
        int[] result = new int[pq.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = pq.poll();
        }
        return result;
    }

    private static int[] sortedSquares2(int[] nums) {
        int[] res = new int[nums.length];
        int p = 0;
        int q = nums.length - 1;
        int idx = nums.length - 1;

        while (idx >= 0) {
            if (nums[q] > -nums[p]) {
                res[idx] = nums[q] * nums[q];
                q--;
            } else {
                res[idx] = nums[p] * nums[p];
                p++;
            }
            idx--;
        }

        return res;
    }

    private static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
