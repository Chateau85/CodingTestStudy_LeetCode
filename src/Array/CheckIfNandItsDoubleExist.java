package Array;

import java.util.HashSet;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        int[] arr2 = {10, 2, 5, 3};
        // int[] arr = {7, 1, 14, 11};
        // int[] arr = {3, 1, 7, 11};
        System.out.println(checkIfExist(arr));
        System.out.println(checkIfExist2(arr2));
    }

    private static boolean checkIfExist2(int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr2) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    private static boolean checkIfExist(int[] arr) {
        if (arr.length < 2 || arr.length > 500) return false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int target = arr[i] / 2;
                for (int j = 0; j < arr.length; j++) {
                    if (i != j && arr[j] == target) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
