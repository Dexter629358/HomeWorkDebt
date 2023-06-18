package geekbrains.lessons.lesson4.task2;

import java.util.LinkedList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }

        System.out.println("list = " + list);
        int result = sumPositive(list);
        System.out.println("result = " + result);
    }

    /**
     * @param data list of data
     * @return sum of positive numbers
     * @apiNote Sums positive numbers.
     */
    public static int sumPositive(LinkedList<Integer> data) {
        int res = 0;

        for (Integer num : data) {
            if (num % 2 == 0) {
                res += num;
            }
        }

        return res;
    }
}
