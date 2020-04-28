import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Library library;
    private Borrower borrower;

    @Before
    public void before(){
        book = new Book("Raging Storm", "Markus Heitz", "Fiction/Fantasy");
        library = new Library(10);
        borrower = new Borrower();
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrow(){
        library.addBook(book);
        borrower.borrow(library);
        assertEquals( 1, borrower.bookCount());
        assertEquals( 0, library.bookCount());
    }
}
