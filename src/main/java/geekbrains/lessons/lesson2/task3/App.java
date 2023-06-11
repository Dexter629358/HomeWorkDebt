package geekbrains.lessons.lesson2.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sumValidNumbers(n, sc);
        System.out.println("res = " + res);
    }

    /**
     * @param n number of numbers
     * @param sc Scanner object to read numbers
     * @return sum of valid sequence
     * @apiNote Finds the sum of the numbers ending in 5, preceded by an even number.
     */
    public static int sumValidNumbers(int n, Scanner sc) {
        int prev = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            int cur = sc.nextInt();
            if (cur % 10 == 5 && prev % 2 == 0) {
                sum += cur;
            }

            prev = cur;
        }

        return sum;
    }
}
