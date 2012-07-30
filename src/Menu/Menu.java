package Menu;

import BookMgr.BookMgr;
import Library.Library;
import MovieMgr.MovieMgr;
import MyOutputstream.MyOutStream;

public class Menu {

    private MyOutStream _outputStream = new MyOutStream();
    Library library = new Library();
    BookMgr bookMgr = new BookMgr(library.initBooks());

    public Menu(MyOutStream testOutputStream) {
        this._outputStream = testOutputStream;
    }

    public Menu() {

    }

    public void showMenuList() {
        _outputStream.myPrint("1. View all boos.\n2. View all movies.\n3. Check ID.\n");
    }

    public void selectMenuOption(int menuSelection) {

        if(menuSelection == 1) {
            bookMgr.showBooks();
            bookMgr.reserveBook(bookMgr.selectBook());
        } else if(menuSelection == 2) {
            MovieMgr movieMgr = new MovieMgr(library.initMovies());
            movieMgr.showMovies();

        }
    }

}
