package geekbrains.lessons.lesson6.task4;

public class Fahrenheit implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return (baseValue * 1.8) + 32;
    }
}
