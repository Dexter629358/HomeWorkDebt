package geekbrains.homeworks.homework3.task3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Ше́рлок Холмс", "Дойл", 500.43, 1892, 823));
        books.add(new Book("Сказки старого Вильнюса", "Фрай", 672.34, 2012, 233));
        books.add(new Book("Мёртвые души", "Гоголь", 677.32, 1842, 467));
        books.add(new Book("Шинель", "Гоголь", 555.4, 1842, 250));
        books.add(new Book("1Q84", "Мураками", 172.34, 2011, 400));

        List<String> result = findNewBooks(books);
        System.out.println("result = " + result);
    }

    /**
     * @param books list of books
     * @return list of book titles
     * @apiNote Finds books published in 2010 and later, and if author contains
     */
    public static List<String> findNewBooks(List<Book> books) {
        List<String> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublicationYear() >= 2010 && isPrime(book.getPagesNumber()) && book.getAuthorSurname().toLowerCase().contains("а")) {
                result.add(book.getTitle());
            }
        }

        return result;
    }

    /**
     * @param num number
     * @return if prime is a prime returns true, otherwise false
     * @apiNote Checks if numbers is a prime.
     */
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
