package geekbrains.homeworks.homework2.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isIncreasing = isSequenceIncreasing(sc, n);

        if (isIncreasing) {
            System.out.println("Sequence is increasing");
        } else {
            System.out.println("Sequence is not increasing");
        }
    }

    /**
     * @param sc Scanner to read user data
     * @param n  number of digits to read
     * @return true if sequence is increasing, otherwise false
     * @apiNote checks if sequence is increasing
     */
    public static boolean isSequenceIncreasing(Scanner sc, int n) {
        int prev = sc.nextInt();
        boolean isIncreasing = true;

        for (int i = 1; i < n; i++) {
            int cur = sc.nextInt();
            if (prev >= cur) {
                // If we don't want to listen all user sequence, we can return false here
                isIncreasing = false;
            }
        }

        return isIncreasing;
    }
}
