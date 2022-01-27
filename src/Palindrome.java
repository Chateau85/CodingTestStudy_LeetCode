public class Palindrome {
    public static boolean isPalindrome(String str) {
        String s = str.replace(" ", "");
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }
        s = sb.toString();
        int l = 0, r = s.length();
        boolean result = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - (i + 1))) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Noel sees Leon."));
    }
}
