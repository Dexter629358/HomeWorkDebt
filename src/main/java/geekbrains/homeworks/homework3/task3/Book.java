package geekbrains.homeworks.homework3.task3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String title;
    private String authorSurname;
    private Double price;
    private Integer publicationYear;
    private Integer pagesNumber;
}
