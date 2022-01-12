package functional_reactive_programming_java.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SingleUse {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        List<Book> popularBooks = books.stream()
            .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
            .filter(book -> book.getRating() > 3)
            .collect(Collectors.toList());

        popularBooks.forEach(System.out::println);

        List<Book> popularRomanticBooks = books.stream()
            .filter(book -> book.getGenre().equalsIgnoreCase("Romance"))
            .filter(book -> book.getRating() > 3)
            .collect(Collectors.toList());

        popularRomanticBooks.forEach(System.out::println);

    }

}
