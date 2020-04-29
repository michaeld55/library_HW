import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book;
    private Book book2;
    private Library library;
    @Before
    public void before(){
        book = new Book("Raging Storm", "Markus Heitz", "Fiction/Fantasy");
        book2 = new Book("Salvation Lost", "Peter F.Hamilton", "Fiction/SciFi");
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

    @Test
    public void cantAddBookIfFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(10, library.bookCount());
    }

    @Test
    public void testStock(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book);
        library.addBook(book2);
        library.getStock();
        assertEquals(4,library.bookCount());
    }
}
