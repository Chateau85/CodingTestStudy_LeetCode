package ArryandString;

public class ImplementstrStrFunc {
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack, needle));
        System.out.println(strStr2(haystack, needle));
    }

    private static int strStr2(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int h = haystack.length();
        int n = needle.length();
        int index = -1;
        while (index < h - n) {
            index++;
            if (haystack.charAt(index + n - 1) != needle.charAt(n - 1)) {
                continue;
            }
            if (haystack.substring(index, index + n).equals(needle)) {
                return index;
            }
        }
        return -1;
    }

    private static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) {
                break;
            }

            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
