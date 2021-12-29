package ArryandString;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords2(s));
    }

    private static String reverseWords2(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int n = chars.length;

        while (l < n) {
            int r = l + 1;
            while (r < n && chars[r] != ' ') {
                r++;
            }

            reverse(chars, l, r - 1);
            l = r + 1;
        }
        return new String(chars);
    }

    private static void reverse(char[] chars, int i, int j) {
        while (i < j) {
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;

            i++;
            j--;
        }
    }

    private static String reverseWords(String s) {
        Deque<String> deque = new ArrayDeque<>();

        int l = 0, r = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (r >= l) {
            char c = s.charAt(r);
            if ((sb.length() != 0) && (c == ' ')) {
                deque.offerFirst(sb.toString());
                sb.setLength(0);
            } else if (c != ' ') {
                sb.append(c);
            }
            r--;
        }
        deque.offerFirst(sb.toString());
        return String.join(" ", deque);
    }
}
