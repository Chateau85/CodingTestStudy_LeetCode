package Array;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide1 {
    public static void main(String[] args) {
        // int[] arr = {17, 18, 5, 4, 6, 1};
        // int[] arr = {400};
        int[] arr = {57010, 40840, 69871, 14425, 70605};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    private static int[] replaceElements(int[] arr) {
        int max = -1;
        int compare = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            compare = arr[i];
            arr[i] = max;
            max = Math.max(max, compare);
        }
        return arr;
    }
}
