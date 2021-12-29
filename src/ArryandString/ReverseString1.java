package ArryandString;

import java.util.Arrays;

public class ReverseString1 {
    public static void main(String[] args) {
        // String[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    private static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[r];
            s[r] = s[l];
            s[l] = temp;

            l++;
            r--;
        }
    }
}
