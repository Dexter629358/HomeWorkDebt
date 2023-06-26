package geekbrains.lessons.lesson3.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Item> itemList = createList(3);
        System.out.println(itemList);

        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();

        sumVolume(itemList, searchName);
    }

    public static List<Item> createList(int n) {
        List<Item> resultList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            Item item1 = new Item("qwe1", "asd1", random.nextInt(100));
            Item item2 = new Item("qwe2", "asd2", random.nextInt(100));
            Item item3 = new Item("qwe3", "asd3", random.nextInt(100));
            Item item4 = new Item("qwe4", "asd4", random.nextInt(100));

            resultList.add(item1);
            resultList.add(item2);
            resultList.add(item3);
            resultList.add(item4);
        }

        return resultList;
    }

    public static void sumVolume(List<Item> itemList, String searchName) {
        int sumVolume = 0;
        List<String> countryList = new ArrayList<>();

        for (Item item : itemList) {
            if (item.getName().equals(searchName)) {
                sumVolume += item.getVolume();
                countryList.add(item.getCountry());
            }
        }

        System.out.println(countryList);
        System.out.println(sumVolume);
    }
}
