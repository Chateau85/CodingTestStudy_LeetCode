package Array;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 5, 2, 1, 0};
        // int[] arr = {2, 1};
        System.out.println(validMountainArray(arr));
        System.out.println(validMountainArray2(arr));
    }

    private static boolean validMountainArray2(int[] arr) {
        if (arr == null || arr.length < 3) return false;

        boolean up = arr[1] > arr[0];
        if (!up) return false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }

            if (up) {
                if (arr[i] < arr[i - 1]) {
                    up = false;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    return false;
                }
            }
        }
        return !up;
    }

    private static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int index = 0;

        while (index + 1 < n && arr[index] < arr[index + 1]) {
            index++;
        }

        if (index == 0 || index == n - 1) {
            return false;
        }

        while (index + 1 < n && arr[index] > arr[index + 1]) {
            index++;
        }

        return index == n - 1;
    }
}
