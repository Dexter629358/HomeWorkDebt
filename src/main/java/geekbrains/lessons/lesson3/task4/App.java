package geekbrains.lessons.lesson3.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Item item1 = new Item(4, 3, 1);
        Item item2 = new Item(2, 1, 7);
        Item item3 = new Item(2, 3, 1);
        Item item4 = new Item(2, 1, 7);
        Item item5 = new Item(4, 3, 1);
        Item item6 = new Item(4, 3, 1);

        List<Item> before = new ArrayList<>();
        before.add(item1);
        before.add(item2);
        before.add(item3);
        before.add(item4);
        before.add(item5);
        before.add(item6);

        System.out.println("before = " + before);
        List<Item> result = uniqueItems(before);
        System.out.println("after = " + result);
    }

    public static List<Item> uniqueItems(List<Item> items) {
        return new ArrayList<>(new HashSet<>(items));
    }
}
