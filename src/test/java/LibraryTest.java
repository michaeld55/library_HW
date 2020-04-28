import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book;
    private Library library;
    @Before
    public void before(){
        book = new Book("Raging Storm", "Markus Heitz", "Fiction/Fantasy");
        library = new Library(10);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, library.bookCount());
    }
    @Test
    public void hasCapacity(){
        assertEquals(10, library.getCapacity());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
}
