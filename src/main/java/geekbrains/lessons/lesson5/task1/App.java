package geekbrains.lessons.lesson5.task1;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> result = countCharacters(str);
        System.out.println("result = " + result);
    }

    /**
     * @param str string
     * @return map with characters and number of appearances
     * @apiNote Counts character in string.
     */
    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCounter = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);
            charCounter.putIfAbsent(character, 0);
            charCounter.put(character, charCounter.get(character) + 1);
        }

        return charCounter;
    }
}
