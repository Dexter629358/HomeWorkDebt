package geekbrains.lessons.lesson4.task3;

import java.util.Arrays;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(5, -5, 3, -2, 3, 4, -4, 8, -5, -2));

        System.out.println("list = " + list);
        LinkedList<Integer> result = removeNegative(list);
        System.out.println("result = " + result);
    }

    /**
     * @param data list
     * @return list without negative numbers
     * @apiNote Removes negative numbers from LinkedList.
     */
    public static LinkedList<Integer> removeNegative(LinkedList<Integer> data) {
        for (int i = data.size() - 1; i >= 0; i--) {
            if (data.get(i) < 0) {
                data.remove(i);
            }
        }

        return data;
    }
}
