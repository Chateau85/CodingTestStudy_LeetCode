package Array;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] arr2 = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeroes(arr);
        duplicateZeroes2(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    private static void duplicateZeroes(int[] arr) {
        int dupZeroes = 0;
        int n = arr.length - 1;

        for (int i = 0; i < n - dupZeroes; i++) {
            if (arr[i] == 0) {
                if (i == n - dupZeroes) {
                    arr[n] = 0;
                    n -= 1;
                    break;
                }
                dupZeroes++;
            }
        }
        int last = n - dupZeroes;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + dupZeroes] = 0;
                dupZeroes--;
                arr[i + dupZeroes] = 0;
            } else {
                arr[i + dupZeroes] = arr[i];
            }
        }
    }

    public static void duplicateZeroes2(int[] a) {
        int i = 0, sh = 0;
        for (i = 0; sh + i < a.length; ++i) {
            sh += a[i] == 0 ? 1 : 0;
        }
        for (i = i - 1; sh > 0; --i) {
            if (i + sh < a.length)
                a[i + sh] = a[i];
            if (a[i] == 0)
                a[i + --sh] = a[i];
        }
    }
}
