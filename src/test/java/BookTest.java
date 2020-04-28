import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Raging Storm", "Markus Heitz", "Fiction/Fantasy");

    }

    @Test
    public void hasTitleAuthorGenre(){
        assertEquals("Raging Storm",book.getTitle());
        assertEquals("Markus Heitz",book.getAuthor());
        assertEquals("Fiction/Fantasy",book.getGenre());
    }
}
