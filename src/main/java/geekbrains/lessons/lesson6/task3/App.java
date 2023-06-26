package geekbrains.lessons.lesson6.task3;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> arr1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> arr2 = new ArrayList<>(Arrays.asList("qwe", "v"));

        Map<String, Integer> result = findIntersectionsAndCount(arr1, arr2);
        System.out.println("result = " + result);
    }

    /**
     * @apiNote Find intersections and counts intersections.
     * @param arr1 first list of strings
     * @param arr2 second list of strings
     * @return map of strings and count of intersections
     */
    public static Map<String, Integer> findIntersectionsAndCount(List<String> arr1, List<String> arr2) {
        HashMap<String, Integer> map1 = new HashMap<>();

        for (String s : arr1) {
            Integer count = map1.getOrDefault(s, 0);
            map1.put(s, count + 1);
        }

        HashMap<String, Integer> result = new HashMap<>();

        for (String s : arr2) {
            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            } else if (map1.containsKey(s)) {
                result.put(s, map1.get(s) + 1);
            }
        }

        return result;
    }
}
