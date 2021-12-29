package Array;

import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }

    private static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int n : nums) {
            if (set.contains(n)) continue;
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }
            set.add(n);
        }
        if (set.size() >= 3) return max3;
        else return max1;
    }
}
