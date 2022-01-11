public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 1234321;
        // System.out.println(isPalindrome(x));
        System.out.println(isPalindrome2(x));
    }

    private static boolean isPalindrome2(int x) {
        int reversed = 0;
        if (x == 0) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        while (x > reversed) {
            int modResult = x % 10;
            x = x / 10;
            reversed = (reversed * 10) + modResult;
        }
        return reversed == x || x == (reversed / 10);
    }

    private static boolean isPalindrome(int x) {
        String check = String.valueOf(x);
        if (check.charAt(0) == '-') {
            return false;
        }

        int l = 0, r = check.length() - 1;
        while (l < r) {
            if (check.charAt(l++) != check.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
}
