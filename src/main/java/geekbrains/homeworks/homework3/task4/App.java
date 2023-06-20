package geekbrains.homeworks.homework3.task4;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 3, -1, 4, 9, -5, 2, 3);

        Integer min = findMinimum(numbers);
        Integer max = findMaximum(numbers);
        double avg = Average(numbers);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("avg = " + avg);
    }

    /**
     * @param numbers list of integers
     * @return minimum integer
     * @apiNote Finds minimum number from list
     */
    public static Integer findMinimum(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return null;
        }

        Integer min = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            Integer num = numbers.get(i);
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    /**
     * @param numbers list of integers
     * @return maximum integer
     * @apiNote Finds maximum number from list
     */
    public static Integer findMaximum(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return null;
        }

        Integer max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            Integer num = numbers.get(i);
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    /**
     * @param numbers list of integers
     * @return average number
     * @apiNote Finds average number from list
     */
    public static double Average(List<Integer> numbers) {
        int sum = 0;

        for (Integer num : numbers) {
            sum += num;
        }

        return (double) sum / (double) numbers.size();
    }
}
