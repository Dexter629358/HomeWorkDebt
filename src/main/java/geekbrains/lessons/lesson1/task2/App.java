package geekbrains.lessons.lesson1.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = findPositiveNumbers(n);

        System.out.println("res = " + res);
    }

    /**
     * @param n count of numbers
     * @return count of valid numbers
     * @apiNote A sequence of N integers is given. Find the number of positive numbers followed by a negative number.
     */
    public static int findPositiveNumbers(int n) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int num2 = sc.nextInt();

            if (isNumberPositive(num1, num2)) {
                count++;
            }
            num1 = num2;
        }

        return count;
    }

    /**
     * @param a previous number
     * @param b next number
     * @return is previous number less than 0 and next number
     * is greater or equal 0
     * @apiNote Checks if number is valid.
     */
    public static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }
}
