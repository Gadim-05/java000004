public class BookStore {
    Book[] books;
    int count;

    public BookStore(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Bookstore is full, cannot add more books.");
        }
    }

    public void showBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchBooksByCategory(BookCategory category) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getCategory() == category) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found in the category: " + category.description);
        }
    }
}
