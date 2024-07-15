public class BookStoreMain {
    public static void main(String[] args) {
        BookStore store = new BookStore(10);

        store.addBook(new Book("MelikMemmed", "T.Abdullayev", BookCategory.FICTION, 10));
        store.addBook(new Book("Cirtdan", "Q.Qedimli", BookCategory.SCIENCE, 12));
        store.addBook(new Book("Masa ve Ayi", "T.Abdullayev", BookCategory.HISTORY, 8));
        store.addBook(new Book("Qirmizi Papaq", "B.Quluzade", BookCategory.FANTASY, 14));

        System.out.println("Listing all books:");
        store.showBooks();

        System.out.println();
        System.out.println("FICTION category:");
        store.searchBooksByCategory(BookCategory.FICTION);

        System.out.println("SCIENCE category:");
        store.searchBooksByCategory(BookCategory.SCIENCE);


    }



}
