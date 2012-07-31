package ResourcesManager.BookMgr;

import Resources.Book.Book;

import java.util.Map;

public class BookMgr {

    private Map<Integer, Book> books;

    public BookMgr(Map<Integer, Book> books) {
        this.books = books;
    }

    public boolean reserveBook(int whichBook) {
        if(!(books.get(whichBook).isReserved())) {
            books.get(whichBook).setBookReserved();
            return true;
        } else {
            return false;
        }
    }
}
