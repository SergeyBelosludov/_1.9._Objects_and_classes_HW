public class Book {
    private final String nameBook;
    private final Author authorBook;
    private int publishingYear;

    public Book(String nameBook, Author authorBook, int publishingYear) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.publishingYear = publishingYear;
    }

    public String getNameBooK() {
        return nameBook;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    }
