package geekbrains.homeworks.homework3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private String country;
    private Integer weight;
    private Double price;
    private Integer grade;
}
