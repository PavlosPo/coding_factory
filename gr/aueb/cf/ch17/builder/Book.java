package gr.aueb.cf.ch17.builder;

public class Book {
    private final long id;
    private final String isbn;
    private final String author;
    private final String title;

    // Builder class
    public static class Builder {
        // Required fields
        private final long id;
        private final String isbn;

        // Optional fields
        private String author = "";
        private String title = "";

        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        // We give setters for the non-final states
        public Builder author(String author) {
            this.author = author;
            return this;    // It returns the instance
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        // We create a Book instance
        public Book build() {
            return new Book(this);
        }
    }

    // Constructor with Builder
    private Book(Builder builder) {
        this.id = builder.id;
        this.isbn = builder.isbn;
        this.author = builder.author;
        this.title = builder.title;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
