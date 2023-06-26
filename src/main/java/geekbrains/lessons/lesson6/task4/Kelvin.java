package geekbrains.lessons.lesson6.task4;

public class Kelvin implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return baseValue + 273.15;
    }
}
