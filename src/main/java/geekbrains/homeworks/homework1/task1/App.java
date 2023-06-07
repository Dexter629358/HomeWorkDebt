package geekbrains.homeworks.homework1.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = reverseWords(s);
        System.out.println("res = `" + res + "`");
    }

    /**
     * @param s incoming string
     * @return reversed string
     * @apiNote Reverses words in a string.
     */
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        for (int i = 0; i < words.length / 2; i++) {
            int endIndex = words.length - i - 1;
            String temp = words[i];
            words[i] = words[endIndex];
            words[endIndex] = temp;
        }

        return String.join(" ", words);
    }
}
