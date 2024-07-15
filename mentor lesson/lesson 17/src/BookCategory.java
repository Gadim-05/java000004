public enum BookCategory {
    FICTION("Fiction"),
    SCIENCE("Science"),
    HISTORY("History"),
    FANTASY("Fantasy");

     String description;

    BookCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
