package InterviewGoogle;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        // int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height = {1, 1};
        System.out.print(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int max = 0;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            int w = r - l;
            max = Math.max(h * w, max);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
