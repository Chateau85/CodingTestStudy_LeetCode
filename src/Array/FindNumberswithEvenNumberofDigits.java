package Array;

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        // int[] nums = {12, 345, 2, 6, 7896};
        int[] nums = {555, 901, 482, 1771};
        System.out.println(findNumbers(nums));
        System.out.println(findNumbers2(nums));
    }

    private static int findNumbers2(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || (num >= 100000 && num <= 999999)) {
                count++;
            }
        }

        return count;
    }

    private static int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}
