package geekbrains.lessons.lesson6.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 5, 6, 7));

        Set<Integer> result = findIntersections(set1, set2);
        System.out.println("result = " + result);
    }

    /**
     * @apiNote Find intersections and returns a set of intersections.
     * @param set1 first set of numbers
     * @param set2 second set of numbers
     * @return set of numbers
     */
    public static Set<Integer> findIntersections(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        for (Integer num1 : set1) {
            if (set2.contains(num1)) {
                result.add(num1);
            }
        }

        return result;
    }
}
