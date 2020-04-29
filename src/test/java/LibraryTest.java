import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

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

        HashMap<String, Integer> result = new HashMap<String, Integer>(){{
            put("Fiction/Fantasy", 2);
            put("Fiction/SciFi", 2);
        }};
        assertEquals(result, library.getStock());
    }
}
