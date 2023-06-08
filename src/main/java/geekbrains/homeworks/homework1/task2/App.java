package geekbrains.homeworks.homework1.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int res = countNumbers();
        System.out.println("res = " + res);
    }

    /**
     * @apiNote Asks from user numbers, until 0. And sums numbers if the number is positive,
     * and the next number is negative.
     * @return sum of valid numbers
     */
    public static int countNumbers() {
        Scanner sc = new Scanner(System.in);
        int cur = sc.nextInt();

        if (cur == 0) return 0;

        int result = 0;

        while (true) {
            int next = sc.nextInt();

            if (next == 0) break;

            if (cur > 0 && next < 0) {
                result += cur;
            }

            cur = next;
        }

        return result;
    }
}
