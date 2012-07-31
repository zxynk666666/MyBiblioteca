import Resources.Book.Book;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class TestBook {
    @Test
    public void getBookNameTest() {
        Book testBook = new Book("testBook", false);
        assertEquals("testBook", testBook.getBookName());
    }

    @Test
    public void isReservedTest() {
        Book testBooks = new Book("testBook", false);
        assertFalse(testBooks.isReserved());
    }

    @Test
    public void setBookReservedTest() {
        Book testBooks = new Book("testBook", false);
        testBooks.setBookReserved();

        assertTrue(testBooks.isReserved());
    }
}
