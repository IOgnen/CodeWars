package bookCollection;
import java.util.*;
import java.util.stream.Collectors;

public class BookCollection {

    public Collection<Book> books;
    public BookCollection() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void printByCategory(String category) {

        books.stream()
                .filter(book -> book.getCategory().equalsIgnoreCase(category))
                .sorted(Book::compareTo)
                .forEach(System.out::println);

    }

    public List<Book> getCheapestN(int n) {

       return books.stream().sorted(Comparator.comparing(Book::getPrice)
               .reversed())
               .limit(n)
               .collect(Collectors.toList());

    }

}
