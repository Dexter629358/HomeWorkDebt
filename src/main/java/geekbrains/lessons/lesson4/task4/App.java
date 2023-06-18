package geekbrains.lessons.lesson4.task4;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        System.out.println("path = " + simplifyPath("/home/"));
        System.out.println("path = " + simplifyPath("/../"));
        System.out.println("path = " + simplifyPath("/home//foo/"));
    }

    /**
     * @param path Unix path
     * @return simplified Unix path
     * @apiNote Simplifies Unix path.
     */
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] subPath = path.split("/");
        for (String s : subPath) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.equals(".") && s.length() != 0) {
                stack.push(s);
            }
        }

        if (stack.isEmpty()) return "/";

        StringBuilder result = new StringBuilder("/");

        for (String s : stack) {
            result.append('/').append(s);
        }

        return result.toString();
    }
}
