import Resources.Book.Book;
import BookMgr.BookMgr;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class TestBookMgr {
    Map<Integer, Book> book = new HashMap<Integer, Book>();

    @Test
    public void reserveBook() {
        Book testBook_1 = new Book("TestBook_1", false);
        book.put(1,testBook_1);
        BookMgr testBookMgr = new BookMgr(book);

        assertTrue(testBookMgr.reserveBook(1));

        Book testBook_2 = new Book("TestBook_2", false);
        book.put(2, testBook_1);
        testBookMgr.reserveBook(2);

        assertFalse(testBookMgr.reserveBook(2));
    }
}
