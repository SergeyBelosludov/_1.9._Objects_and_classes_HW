public class Library {
    private final Book[] books;

    public Library(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Размер должен быть положительным");
        }
        this.books = new Book[size];
    }

    public void addBook(Book book) {
        boolean isBookAdded = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                isBookAdded = true;
            }
            if (isBookAdded) {
                books[i] = book;
                break;
            }
        }
        if (!isBookAdded) {
            throw new IllegalArgumentException("Книга не добавлена, т.к. места в библиотеке больше нет");
        }
    }

    public void printBook() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthorBook().getFullNameAuthor() + ": " + book.getNameBooK() + ": " + book.getPublishingYear());
            }
        }
    }

    public void printInformationAboutBook(String bookName) {
        for (Book book : books) {
            if (book != null && book.getNameBooK().equals(bookName)) {
                System.out.println(book.getNameBooK() + " by " + book.getAuthorBook().getFullNameAuthor() + " was published in " + book.getPublishingYear());
                break;
            }
        }
    }

    public void changePublicationYear(String bookName, int newPublicationYear) {
        for (Book book : books) {
            if (book != null && book.getNameBooK().equals(bookName)) {
                book.setPublishingYear(newPublicationYear);
                break;
            }
        }
    }
}
