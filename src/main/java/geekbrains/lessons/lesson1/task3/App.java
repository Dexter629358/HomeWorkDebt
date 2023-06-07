package geekbrains.lessons.lesson1.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringNew = sc.nextLine();
        String res = replaceStrings(stringNew);
        System.out.println("result = " + res);
    }

    /**
     * @param string incoming string
     * @return result string
     * @apiNote A string is given. Swap its halves.
     */
    private static String replaceStrings(String string) {
        int mid = string.length() / 2;
        String subStr1 = string.substring(0, mid);
        String subStr2 = string.substring(mid);
        return subStr2 + subStr1;
    }
}
