package Array;

public class RemoveElement1 {
    public static void main(String[] args) {
        // int[] nums = {3, 2, 2, 3};         int val = 3;
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    private static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int num : nums) {
            if (num != val) {
                nums[index++] = num;
            }
        }
        return index;
    }
}
