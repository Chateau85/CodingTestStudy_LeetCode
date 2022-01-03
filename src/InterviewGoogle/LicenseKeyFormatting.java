package InterviewGoogle;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
//        String s = "2-5g-3-J";
//        int k = 2;

        String s = "5F3Z-2e-9-w";
        int k = 4;
        System.out.print(licenseKeyFormatting(s, k));
    }

    private static String licenseKeyFormatting(String s, int k) {
        String proc = s.toUpperCase().replaceAll("-", "");
        StringBuilder sb = new StringBuilder();
        for (int i = proc.length() - 1; i >= 0; i--) {
            sb.append(sb.length() % (k + 1) == k ? '-' : "").append(proc.charAt(i));
        }
        return sb.reverse().toString();
    }
}
