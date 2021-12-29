package ArryandString;

public class AddBinary {
    public static void main(String[] args) {
        // String a = "11", b = "1";
        // String a = "1010", b = "1011";
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(addBinary(a, b));
    }

    private static String addBinary(String a, String b) {
        int n = a.length(), m = b.length();
        if (n < m) return addBinary(b, a);

        StringBuilder sb = new StringBuilder();
        int carry = 0, j = m - 1;
        for (int i = n - 1; i > -1; i--) {
            if (a.charAt(i) == '1') carry++;
            if (j > -1 && b.charAt(j--) == '1') carry++;

            if (carry % 2 == 1) sb.append('1');
            else sb.append('0');

            carry /= 2;
        }
        if (carry == 1) sb.append('1');
        sb.reverse();

        return sb.toString();
    }
}
