package semester1.practice07;

public class LibraryCatalog {
    private BookItem[] books;
    private int size;

    public LibraryCatalog(int capacity) {
        this.size = 0;
        books = new BookItem[capacity];
    }

    public void addBook(BookItem book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i] = book;
                System.out.println("Книжка збережена за індексом" + i);
                return;
            }
        }
        System.out.println("Бібліотека повна!");
    }

    public BookItem findBookByTitle(String title) {
        for (BookItem book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public boolean borrowBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle() == title) {
                return books[i].borrowBook();
            }
        }
        return false;
    }

    public void printCatalog() {
        for (BookItem book : books) {
            book.printBook();
        }
    }
}

class BookItem {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public BookItem(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        isAvailable = true;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void printBook() {
        System.out.println("(" + isbn + ") " + title + ", " + author + ". " + (isAvailable ? "в наявності" : "відсутня"));
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }
}
