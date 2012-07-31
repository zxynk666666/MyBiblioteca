package BookMgr;

import Resources.Book.Book;
import MyOutputstream.MyOutStream;

import java.util.Map;
import java.util.Scanner;

public class BookMgr {

    private MyOutStream _outputStream = new MyOutStream();
    private Map<Integer, Book> _books;

    public BookMgr(MyOutStream testOutputStream, Map<Integer, Book> books) {
        this._outputStream = testOutputStream;
        this._books = books;
    }

    public BookMgr(Map<Integer, Book> books) {
        this._books = books;
    }

    public void showBooks() {
        Book book = null;
        int counter = 1;

        for(Map.Entry<Integer, Book> bookMap:_books.entrySet()){
            book = bookMap.getValue();
            _outputStream.myPrint(counter + ". " + book.getBookName() + "\n");
            counter++;
        }
    }

    public boolean reserveBook(int whichBook) {
        if(!(_books.get(whichBook).IsReserved())) {
            _books.get(whichBook).setBookReserved();
            return true;
        } else {
            return false;
        }
    }

    public void reserveSuccessPrompter() {
        System.out.println("Thank You! Enjoy the book.");
    }

    public void reserveFailPrompter() {
        System.out.println("Sorry we don't have that book yet.\n");
    }

    public int selectBook() {
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();

        return selection;
    }
}
