//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("J.K. Rowling", 1965);
        Author author2 = new Author("George Orwell", 1903);

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, 1997);
        Book book2 = new Book("1984", author2, 1949);
        Book book3 = new Book("Burmese Days", author2, 1934);

        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author2);

        System.out.println(book2);
        System.out.println(book3);
    }
}