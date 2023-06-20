package geekbrains.lessons.lesson5.task3;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(s + " = " + romanToInt(s));

        s = "MCMXCIV";
        System.out.println(s + " = " + romanToInt(s));
    }

    /**
     * @param s roman number
     * @return converted number
     * @apiNote Converts from raman number to integer.
     */
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        Integer result = map.get(s.charAt(s.length() - 1));
        for (int i = 0; i < s.length() - 1; i++) {
            Integer num = map.get(s.charAt(i));
            if (num < map.get(s.charAt(i + 1))) {
                result -= num;
            } else {
                result += num;
            }
        }

        return result;
    }
}
