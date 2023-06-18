package geekbrains.homeworks.homework3.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("product 1", "Russia", 43, 500.43, 2));
        products.add(new Product("product 2", "France", 20, 77.32, 1));
        products.add(new Product("product 3", "Spain", 55, 1048.12, 2));
        products.add(new Product("product 4", "Sweden", 80, 172.34, 2));
        products.add(new Product("product 5", "China", 90, 77.32, 1));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        int grade = sc.nextInt();

        List<String> result = findCheapestProductsByGrade(products, grade);
        System.out.println("result = " + result);
    }

    /**
     * @param products list of products
     * @param grade    grade of product
     * @return the list of valid products name
     * @apiNote Finds the cheapest products by specified grade.
     */
    public static List<String> findCheapestProductsByGrade(List<Product> products, int grade) {
        if (products.isEmpty()) {
            return new ArrayList<>();
        }

        List<Product> productsByGrade = new ArrayList<>();

        for (Product p : products) {
            if (p.getGrade() == grade) {
                productsByGrade.add(p);
            }
        }

        List<String> result = new ArrayList<>();
        if (productsByGrade.isEmpty()) {
            return result;
        }

        double cheapestPrice = productsByGrade.get(0).getPrice();

        for (int i = 1; i < productsByGrade.size(); i++) {
            if (productsByGrade.get(i).getPrice() < cheapestPrice) {
                cheapestPrice = productsByGrade.get(i).getPrice();
            }
        }

        for (Product p : productsByGrade) {
            if (p.getPrice() == cheapestPrice) {
                result.add(p.getName());
            }
        }

        return result;
    }
}
