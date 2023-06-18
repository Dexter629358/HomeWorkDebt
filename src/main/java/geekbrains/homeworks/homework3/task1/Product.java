package geekbrains.homeworks.homework3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private Double price;
    private Integer grade;
}
