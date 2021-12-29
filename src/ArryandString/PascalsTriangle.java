package ArryandString;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
        System.out.println(generate2(numRows));
    }

    private static List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            inner.add(0, 1);
            for (int j = 1; j < inner.size() - 1; j++) {
                inner.set(j, inner.get(j) + inner.get(j + 1));
            }
            result.add(new ArrayList<>(inner));
        }
        return result;
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        int[][] arr = new int[numRows][numRows];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0) {
                    arr[i][j] = 1;
                }
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i - 1][j + 1] != 0) {
                    arr[i][j + 1] = arr[i - 1][j] + arr[i - 1][j + 1];
                }
            }
        }
        for (int[] ints : arr) {
            List<Integer> inner = new ArrayList<>();
            for (int anInt : ints) {
                if (anInt == 0) {
                    break;
                }
                inner.add(anInt);
            }
            result.add(inner);
        }
        return result;
    }
}
