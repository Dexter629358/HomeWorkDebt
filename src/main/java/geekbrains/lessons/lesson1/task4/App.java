package geekbrains.lessons.lesson1.task4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String res = addBinary(a, b);
        System.out.println("result = " + res);
    }

    /**
     * @param a first number in binary format
     * @param b second number in binary format
     * @return sum of a and b
     * @apiNote Given two binary strings a and b, return their sum as a binary string.
     */
    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }
        StringBuilder res = new StringBuilder();
        int carry = 0;

        for (int i = a.length() - 1, j = b.length() - 1; i >= 0; i--, j--) {
            if (a.charAt(i) == '1') {
                carry++;
            }

            if (j >= 0 && b.charAt(j) == '1') carry++;

            res.insert(0, carry % 2);
            carry /= 2;
        }

        res.insert(0, carry % 2);

        return res.toString();
    }
}
