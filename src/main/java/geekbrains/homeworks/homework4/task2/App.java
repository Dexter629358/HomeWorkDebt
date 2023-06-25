package geekbrains.homeworks.homework4.task2;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    /**
     * @param s string with brackets
     * @return true if brackets are closed correctly, otherwise false
     * @apiNote Checks if brackets start and close correctly.
     */
    public static boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (letter == '(') {
                brackets.add(')');
            } else if (letter == '[') {
                brackets.add(']');
            } else if (letter == '{') {
                brackets.add('}');
            } else if (brackets.isEmpty() || letter != brackets.pop()) {
                return false;
            }
        }

        return brackets.isEmpty();
    }
}
