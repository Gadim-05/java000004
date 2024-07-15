public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private Double price;

    private Integer publicationYear;

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book(String title, String author, Double price, Integer publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    @Override
    public int compareTo(Book o) {
        if (!this.getPublicationYear().equals(o.getPublicationYear())){
        return this.publicationYear.compareTo(o.publicationYear);}
        else {
            return this.getPrice().compareTo(o.getPrice());
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
