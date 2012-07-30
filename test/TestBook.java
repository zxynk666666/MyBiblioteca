import Book.Book;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class TestBook {
    @Test
    public void getBookNameTest() {
        Book testBook = new Book("testName");
        assertEquals("testName", testBook.getBookName());
    }

    @Test
         public void isReservedTest() {
        Book testBooks = new Book(false);
        assertFalse(testBooks.IsReserved());
    }
}
