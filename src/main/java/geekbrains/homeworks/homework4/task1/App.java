package geekbrains.homeworks.homework4.task1;

import java.util.LinkedList;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        int n = 10;

        LinkedList<Integer> data1 = new LinkedList<>();
        for (int i = 1; i <= n; i++) data1.add(i);
        printReverse1(data1);

        Stack<Integer> data2 = new Stack<>();
        for (int i = 1; i <= n; i++) data2.add(i);
        printReverse2(data2);

        LinkedList<Integer> data3 = new LinkedList<>();
        for (int i = 1; i <= n; i++) data3.add(i);
        printReverse3(data3);
    }

    public static void printReverse1(LinkedList<Integer> data) {
        while (!data.isEmpty()) {
            System.out.print(data.removeLast() + ", ");
        }

        System.out.println();
    }

    public static void printReverse2(Stack<Integer> data) {
        while (!data.isEmpty()) {
            System.out.print(data.pop() + ", ");
        }

        System.out.println();
    }

    public static void printReverse3(LinkedList<Integer> data) {
        LinkedList<Integer> temp = new LinkedList<>();
        while (!data.isEmpty()) {
            temp.push(data.pop());
        }

        while (!temp.isEmpty()) {
            System.out.print(temp.pop() + ", ");
        }

        System.out.println();
    }
}
