package geekbrains.lessons.lesson3.task3;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "красный", "деревянный");
        Cube cube2 = new Cube(4, "желтый", "металлический");
        Cube cube3 = new Cube(5, "зелённый", "металлический");
        Cube cube4 = new Cube(10, "синий", "стальной");

        List<Cube> cubes = new ArrayList<>();
        cubes.add(cube1);
        cubes.add(cube2);
        cubes.add(cube3);
        cubes.add(cube4);

        int count = 0;
        Integer sumVolume = 0;
        int countWood = 0;

        for (Cube cube : cubes) {
            if (cube.getColor().equals("желтый")) {
                count++;
                sumVolume += cube.volumeCube();
            }

            if (cube.getMaterial().equals("деревянный")) {
                countWood++;
            }
        }

        System.out.println("Yellow cubes count = " + count);
        System.out.println("yellow cubes volume = " + sumVolume);
        System.out.println("wooden cubes = " + countWood);
    }
}
