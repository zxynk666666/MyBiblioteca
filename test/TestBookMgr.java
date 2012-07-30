import Book.Book;
import BookMgr.BookMgr;
import MyOutputstream.MyOutStream;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class TestBookMgr {
    @Test
    public void viewAllBooksTest() {
        MyOutStream testOutputStream = new MyOutStream();
        Map<Integer, Book> book = new HashMap<Integer, Book>();
        Book testBook_1 = new Book("TestBook_1");
        book.put(1,testBook_1);
        BookMgr testBookMgr = new BookMgr(testOutputStream,book);
        testBookMgr.showBooks();
        assertEquals("1. TestBook_1\n", testOutputStream.getOutput());
    }

    @Test
    public void reserveABook() {
        Map<Integer, Book> book = new HashMap<Integer, Book>();
        Book testBook_1 = new Book("TestBook_1");
        book.put(1,testBook_1);

        BookMgr testBookMgr = new BookMgr(book);
        assertTrue(testBookMgr.reserveBook(1));

        Book testBook_2 = new Book("TestBook_2");
        book.put(2, testBook_1);
        testBookMgr.reserveBook(2);
        assertFalse(testBookMgr.reserveBook(2));
    }
}
