package geekbrains.lessons.lesson6.task1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 9, 4, 3, 2, 6));
        double result = percentageUniqueNumbers(numbers);

        System.out.println("percent = " + result + "%");
    }

    /**
     * @param numbers list of numbers
     * @return percent
     * @apiNote count percentage of unique numbers.
     */
    public static double percentageUniqueNumbers(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        return (uniqueNumbers.size() * 100.) / numbers.size();
    }
}
