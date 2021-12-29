package ArryandString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // int[][] mat = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        // System.out.println(Arrays.toString(findDiagonalOrder(mat)));
        System.out.println(Arrays.toString(findDiagonalOrder2(mat)));
    }

    private static int[] findDiagonalOrder2(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        int M = mat.length, N = mat[0].length;
        int[] result = new int[M * N];
        result[0] = mat[0][0];
        int i = 0, j = 0, k = 1;
        while (k < M * N) {
            while (i >= 1 && j < N - 1) {
                i--;
                j++;
                result[k++] = mat[i][j];
            }
            if (j < N - 1) {
                j++;
                result[k++] = mat[i][j];
            } else if (i < M - 1) {
                i++;
                result[k++] = mat[i][j];
            }
            while (i < M - 1 && j >= 1) {
                i++;
                j--;
                result[k++] = mat[i][j];
            }
            if (i < M - 1) {
                i++;
                result[k++] = mat[i][j];
            } else if (j < N - 1) {
                j++;
                result[k++] = mat[i][j];
            }
        }
        return result;
    }

    private static int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        if (mat.length == 1) {
            return new int[mat[0][0]];
        }

        int N = mat.length;
        int M = mat[0].length;

        int[] result = new int[N * M];
        int k = 0;

        List<Integer> reverseList = new ArrayList<>();
        for (int i = 0; i < N * M - 1; i++) {
            reverseList.clear();

            int r = i < M ? 0 : i - M + 1;
            int c = i < M ? i : M - 1;

            while (r < N && c > -1) {
                reverseList.add(mat[r][c]);
                r++;
                c--;
            }

            if (i % 2 == 0) {
                Collections.reverse(reverseList);
            }
            for (Integer integer : reverseList) {
                result[k++] = integer;
            }
        }
        return result;
    }
}
