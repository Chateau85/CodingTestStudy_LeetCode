import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        // int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        boolean result = false;
        for (int i : map.keySet()) {
            if (map.get(i) >= 2) {
                result = true;
            }
        }

        return result;

//        HashSet<Integer> set = new HashSet<Integer>();
//
//        for (int num: nums) {
//            if (!set.add(num)) return true;
//        }
//
//        return false;
    }
}
