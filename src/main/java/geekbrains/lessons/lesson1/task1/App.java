package geekbrains.lessons.lesson1.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = subtractProductAndSum(n);
        System.out.println("res = " + res);
    }

    /**
     * @param n incoming integer
     * @return the result of the task
     * @apiNote A given integer returns the difference between the product of its digits and the sum of its digits.
     */
    public static int subtractProductAndSum(int n) {
        int product = 1, sum = 0;

        while (n > 0) {
            int val = n % 10;

            product *= val;
            sum += val;
            n /= 10;
        }

        return product - sum;
    }
}
