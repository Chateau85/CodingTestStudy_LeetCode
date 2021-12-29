package Array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1, i2 = n - 1, end = m + n - 1;
        while (i1 >= 0 && i2 >= 0) {
            nums1[end--] = (nums1[i1] > nums2[i2]) ? nums1[i1--] : nums2[i2--];
        }
        while (i2 >= 0) {
            nums1[end--] = nums2[i2--];
        }
    }
}
