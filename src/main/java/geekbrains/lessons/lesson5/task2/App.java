package geekbrains.lessons.lesson5.task2;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        boolean result = containsDuplicates(new int[]{1, 2, 3, 4, 5});
        System.out.println("result = " + result);
    }

    /**
     * @param arr array
     * @return returns true if duplicates exist, otherwise false
     * @apiNote Checks if array contains duplicates.
     */
    public static boolean containsDuplicates(int[] arr) {
        Set<Integer> map = new HashSet<>();

        for (int j : arr) {
            if (!map.contains(j)) {
                map.add(j);
            } else {
                return true;
            }
        }

        return false;
    }
}
