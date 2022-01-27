public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(solution(nums, target));
    }

    private static int solution(int[] nums, int target) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                position = i;
                break;
            } else {
                position++;
            }
        }
        return position;
    }
}
