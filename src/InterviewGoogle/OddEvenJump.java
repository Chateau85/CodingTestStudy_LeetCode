package InterviewGoogle;

import java.util.TreeMap;

public class OddEvenJump {
    public static void main(String[] args) {
        int[] arr = {10, 13, 12, 14, 15};
        System.out.print(oddEvenJumps(arr));
    }

    static int oddEvenJumps(int[] arr) {
        int n = arr.length, result = 1;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        boolean[][] dp = new boolean[n][2];
        dp[n - 1][0] = dp[n - 1][1] = true;

        map.put(arr[n - 1], n - 1);
        for (int i = n - 2; i >= 0; i--) {
            Integer nextBig = map.ceilingKey(arr[i]);
            if (nextBig != null) {
                dp[i][0] = dp[map.get(nextBig)][1];
            }

            Integer nextSmall = map.floorKey(arr[i]);
            if (nextSmall != null) {
                dp[i][1] = dp[map.get(nextSmall)][0];
            }

            map.put(arr[i], i);
            result += dp[i][0] ? 1 : 0;
        }

        return result;
    }
}
