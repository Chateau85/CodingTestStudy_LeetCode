package ArryandString;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        // String s = "the sky is blue";
        String s = "a good   example";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords2(s));
    }

    private static String reverseWords2(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r && s.charAt(l) == ' ') {
            l++;
        }
        while (l <= r && s.charAt(r) == ' ') {
            r--;
        }
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        while (l <= r) {
            char c = s.charAt(l);
            if ((sb.length() != 0) && (c == ' ')) {
                deque.offerFirst(sb.toString());
                sb.setLength(0);
            } else if (c != ' ') {
                sb.append(c);
            }
            l++;
        }
        deque.offerFirst(sb.toString());
        return String.join(" ", deque);
    }

    private static String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        int l = 0, r = arr.length - 1;
        while (l < r) {
            String temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        StringBuilder sb = new StringBuilder();
        for (String st : arr) {
            if (st.isEmpty()) continue;
            sb.append(st);
            sb.append(" ");
        }

        String result = sb.toString();
        return result.trim();
    }
}
