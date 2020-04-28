import java.util.ArrayList;
import java.util.Collection;

public class Borrower {
    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void borrow(Library library) {
        Book book = library.removeBook();
        this.books.add(book);
    }
}
