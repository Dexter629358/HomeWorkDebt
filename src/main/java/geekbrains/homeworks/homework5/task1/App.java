package geekbrains.homeworks.homework5.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = sc.nextLine();

        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        Map<String, Integer> result = countWord(text, word);
        System.out.println("result = " + result);
    }


    /**
     * @param text string
     * @param word word to find
     * @return Map with word and number of occurrences
     * @apiNote Counts the number of occurrences of a word in the text.
     */
    public static Map<String, Integer> countWord(String text, String word) {
        String[] words = text.split("[ .,!?:;]");
        Map<String, Integer> counter = new HashMap<>();
        String wordLower = word.toLowerCase();

        for (String s : words) {
            System.out.println(s);
            if (s.toLowerCase().equals(wordLower)) {
                Integer current = counter.getOrDefault(word, 0);
                counter.put(word, current + 1);
            }
        }

        return counter;
    }
}
