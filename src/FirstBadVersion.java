public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 5, bad = 4;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int start = 0, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private static boolean isBadVersion(int mid) {
        return true;
    }
}