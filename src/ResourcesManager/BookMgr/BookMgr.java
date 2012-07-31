package ResourcesManager.BookMgr;

import Resources.Book.Book;

import java.util.Map;

public class BookMgr {

    private Map<Integer, Book> _books;

    public BookMgr(Map<Integer, Book> books) {
        this._books = books;
    }

    public boolean reserveBook(int whichBook) {
        if(!(_books.get(whichBook).IsReserved())) {
            _books.get(whichBook).setBookReserved();
            return true;
        } else {
            return false;
        }
    }
}
