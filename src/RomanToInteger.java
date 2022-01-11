import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
        System.out.print(romanToInt2(s));
    }

    private static int romanToInt2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        result += map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'V' || s.charAt(i) == 'X') {
                if (s.charAt(i - 1) == 'I') {
                    result += map.get(s.charAt(i)) - 2;
                } else {
                    result += map.get(s.charAt(i));
                }
            } else if (s.charAt(i) == 'L' || s.charAt(i) == 'C') {
                if (s.charAt(i - 1) == 'X') {
                    result += map.get(s.charAt(i)) - 20;
                } else {
                    result += map.get(s.charAt(i));
                }
            } else if (s.charAt(i) == 'D' || s.charAt(i) == 'M') {
                if (s.charAt(i - 1) == 'C') {
                    result += map.get(s.charAt(i)) - 200;
                } else {
                    result += map.get(s.charAt(i));
                }
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }

    private static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }

        result += map.get(s.charAt(s.length() - 1));
        return result;
    }
}
