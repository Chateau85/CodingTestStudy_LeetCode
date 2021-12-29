package ArryandString;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII1 {
    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }

    private static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--) {
                result.set(j, result.get(j - 1) + result.get(j));
            }
            result.add(1);
        }
        return result;
    }
}
