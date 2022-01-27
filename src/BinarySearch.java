public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        System.out.println(solution(nums, target));
    }

    private static int solution(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid = 0;
        int index = -1;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                index = mid;
                break;
            }
        }

        return index;
    }
}
