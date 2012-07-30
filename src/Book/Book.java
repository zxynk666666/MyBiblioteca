package Book;

public class Book {

    private String _bookName;
    private boolean _isReserved;

    public Book(String testName) {
        this._bookName = testName;
    }

    public Book(boolean isReserved) {
        this._isReserved = isReserved;
    }

    public Book() {

    }

    public void setBookName(String _bookName) {
        this._bookName = _bookName;
    }

    public String getBookName() {
        return _bookName;
    }

    public boolean IsReserved() {
       return _isReserved;
    }

    public void setBookReserved() {
        this._isReserved = true;
    }
}
