package geekbrains.lessons.lesson2.task5;

public class App {
    public static void main(String[] args) {
        Vector vector1 = new Vector(0, 1, 2);
        Vector vector2 = new Vector(4, 2, 5);
        System.out.println("vector 1 = " + vector1);
        System.out.println("vector 2 = " + vector2);

        System.out.println("length = " + vector1.length());

        System.out.println("scalar = " + vector1.scalar(vector2));

        System.out.println("multi = " + vector1.multi(vector2));

        System.out.println("cos = " + vector1.cos(vector2));
    }
}
