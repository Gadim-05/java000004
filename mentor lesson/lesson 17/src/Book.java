public class Book {
    String title;
    String author;
    BookCategory category;
    double price;


    public Book(String title, String author, BookCategory category, double price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }


    public BookCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}