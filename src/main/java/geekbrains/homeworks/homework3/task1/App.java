package geekbrains.homeworks.homework3.task1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("product 1 - Высший", 1043.43, 1));
        products.add(new Product("product 2", 17.32, 2));
        products.add(new Product("product 3", 57., 3));
        products.add(new Product("product 4 - высший", 32.21, 2));
        products.add(new Product("product 5 - высший", 1.45, 3));
        products.add(new Product("product 6", 439.21, 1));
        products.add(new Product("product 7", 434.49, 4));
        products.add(new Product("ВЫСШИЙ product 8", 1043.43, 1));

        Double result = findHighestPriceByBestProducts(products);
        System.out.println("result = " + result);
    }

    /**
     * @param products list of products
     * @return the most expensive price of the best products
     * @apiNote Finds the best products, and the calculates the highest price.
     * of grade 1 or 2 and that contains in name "высший".
     */
    public static Double findHighestPriceByBestProducts(List<Product> products) {
        List<Product> best = findBestProducts(products);
        double expensivePrice = 0.;

        for (Product p : best) {
            if (p.getPrice() > expensivePrice) {
                expensivePrice = p.getPrice();
            }
        }

        return expensivePrice;
    }

    /**
     * @param products received products
     * @return valid products
     * @apiNote Finds the best products. The products that have 1 or 2 grade, and contains in name word
     * "высший".
     */
    public static List<Product> findBestProducts(List<Product> products) {
        List<Product> result = new ArrayList<>();

        for (Product p : products) {
            if ((p.getGrade() == 1 || p.getGrade() == 2) && p.getName().toLowerCase().contains("высший")) {
                result.add(p);
            }
        }

        return result;
    }
}
