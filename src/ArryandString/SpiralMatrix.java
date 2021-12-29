package ArryandString;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(matrix));
        System.out.println(spiralOrder2(matrix));
    }

    private static List<Integer> spiralOrder2(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int n = matrix.length, m = matrix[0].length;
        int up = 0, down = n - 1;
        int left = 0, right = m - 1;
        while (result.size() < n * m) {
            for (int j = left; j <= right && result.size() < n * m; j++) {
                result.add(matrix[up][j]);
            }
            for (int i = up + 1; i <= down - 1 && result.size() < n * m; i++) {
                result.add(matrix[i][right]);
            }
            for (int j = right; j >= left && result.size() < n * m; j--) {
                result.add(matrix[down][j]);
            }
            for (int i = down - 1; i >= up + 1 && result.size() < n * m; i--) {
                result.add(matrix[i][left]);
            }
            left++;
            right--;
            up++;
            down--;
        }

        return result;
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int up = 0, left = 0, down = rows - 1, right = columns - 1;

        while (result.size() < rows * columns) {
            for (int c = left; c <= right; c++) {
                result.add(matrix[up][c]);
            }
            for (int r = up + 1; r <= down; r++) {
                result.add(matrix[r][right]);
            }
            if (up != down) {
                for (int c = right - 1; c >= left; c--) {
                    result.add(matrix[down][c]);
                }
            }
            if (left != right) {
                for (int r = down - 1; r > up; r--) {
                    result.add(matrix[r][left]);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return result;
    }
}
