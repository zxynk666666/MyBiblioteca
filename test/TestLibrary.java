import Library.Library;
import Movie.Movies;
import com.sun.javaws.jnl.LibraryDesc;
import org.junit.Test;
import Book.Book;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class TestLibrary {
    @Test
    public void initBooksTest() {
        Library testLibrary = new Library();
        Map<Integer, Book> books = new HashMap<Integer, Book>();
        books = testLibrary.initBooks();

        assertEquals("Book_1", books.get(1).getBookName());
    }

    @Test
    public void initMoviesTest() {
        Library testLibrary = new Library();
        Map<Integer, Movies> movies = new HashMap<Integer, Movies>();

        movies = testLibrary.initMovies();

        assertEquals("Movie_1", movies.get(1).getMovieName());
    }
}
