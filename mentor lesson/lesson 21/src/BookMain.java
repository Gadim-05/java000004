import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookMain {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("To Kill a Mockingbird", "Harper Lee", 1960),
                new Book("1984", "George Orwell", 1949),
                new Book("Pride and Prejudice", "Jane Austen", 1813),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951),
                new Book("The Hobbit", "J.R.R. Tolkien", 1937)
        );

        Optional<Book> latestBook = books.stream()
                .max(Comparator.comparing(Book::getYear));

        if (latestBook.isPresent()) {
            System.out.println("The latest published book is: " + latestBook.get().getTitle());
        } else {
            System.out.println("No books found.");
        }
    }
}
