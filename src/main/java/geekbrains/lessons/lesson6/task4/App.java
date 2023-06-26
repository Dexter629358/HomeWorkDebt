package geekbrains.lessons.lesson6.task4;

public class App {
    public static void main(String[] args) {
        double degrees = 1.5;

        System.out.println("celsius = " + new Celsius().convertValue(degrees));
        System.out.println("fahrenheit = " + new Fahrenheit().convertValue(degrees));
        System.out.println("kelvin = " + new Kelvin().convertValue(degrees));
    }
}
