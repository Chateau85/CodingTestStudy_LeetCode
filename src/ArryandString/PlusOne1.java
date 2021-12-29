package ArryandString;

import java.util.Arrays;

public class PlusOne1 {
    public static void main(String[] args) {
//        int[] digits = {4, 3, 2, 1};
        int[] digits = {9, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
