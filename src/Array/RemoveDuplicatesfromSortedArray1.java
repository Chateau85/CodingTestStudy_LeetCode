package Array;

public class RemoveDuplicatesfromSortedArray1 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                uniqueNumbers++;
            }
        }

        int[] result = new int[uniqueNumbers];

        int positionInResult = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                result[positionInResult] = nums[i];
                positionInResult++;
            }
        }
        return result.length;
    }
}
