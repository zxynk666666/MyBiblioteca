package Resources.Book;

public class Book {

    private String bookName;
    private boolean isReserved;

    public Book(String bookName, boolean isReserved) {
        this.bookName = bookName;
        this.isReserved = isReserved;
    }

    public void setBookName(String bookname) {
        this.bookName = bookname;
    }

    public String getBookName() {
        return bookName;
    }

    public boolean IsReserved() {
       return isReserved;
    }

    public void setBookReserved() {
        this.isReserved = true;
    }
}
