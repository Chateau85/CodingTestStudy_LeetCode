package Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums2 = {3, 3, 2, 1, 4, 5, 6, 4};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearedNumbers2(nums2));
    }

    private static List<Integer> findDisappearedNumbers2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i] - 1;
            while (index != nums[i]) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;

                index = nums[i] - 1;
                if (nums[index] == nums[i]) {
                    break;
                }
            }
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> resultList = new LinkedList<>();
        int[] countArr = new int[nums.length];

        for (int num : nums) {
            countArr[num - 1]++;
        }

        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == 0) {
                resultList.add(i + 1);
            }
        }
        return resultList;
    }
}
