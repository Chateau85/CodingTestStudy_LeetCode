package Array;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
        System.out.println(heightChecker2(heights));
    }

    private static int heightChecker2(int[] heights) {
        int[] heightToFreq = new int[101];
        for (int height : heights) {
            heightToFreq[height]++;
        }

        int result = 0;
        int currHeight = 0;

        for (int height : heights) {
            while (heightToFreq[currHeight] == 0) {
                currHeight++;
            }

            if (currHeight != height) {
                result++;
            }
            heightToFreq[currHeight]--;
        }
        return result;
    }

    private static int heightChecker(int[] heights) {
        int[] compare = heights.clone();
        int result = 0;
        Arrays.sort(compare);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != compare[i]) {
                result++;
            }
        }
        return result;
    }
}
