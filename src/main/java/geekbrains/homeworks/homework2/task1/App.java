package geekbrains.homeworks.homework2.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sumPrimesNumbers(sc, n);
        System.out.println("res = " + res);
    }

    /**
     * @param n number of incoming numbers
     * @return sum of primes numbers
     * @apiNote Sums only primes numbers
     */
    public static int sumPrimesNumbers(Scanner sc, int n) {
        int res = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (isPrime(num)) {
                res += num;
            }
        }

        return res;
    }

    /**
     * @param num number
     * @return true if number is prime, otherwise false
     * @apiNote Checks if number is prime.
     */
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
