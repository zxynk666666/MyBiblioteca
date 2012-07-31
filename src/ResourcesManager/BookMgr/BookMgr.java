package ResourcesManager.BookMgr;

import Resources.Book.Book;

import java.util.Map;
import java.util.Scanner;

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
