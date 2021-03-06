import Resources.Book.Book;
import ResourcesManager.Library.Library;
import Resources.Movie.Movie;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class TestLibrary {

    Library testLibrary = new Library();

    @Test
    public void initBooksTest() {
        Map<Integer, Book> books = new HashMap<Integer, Book>();
        books = testLibrary.initBooks();

        assertEquals("Book_1", books.get(1).getBookName());
    }

    @Test
    public void initMoviesTest() {
        Map<Integer, Movie> movies = new HashMap<Integer, Movie>();
        movies = testLibrary.initMovies();

        assertEquals("Movie_1", movies.get(1).getMovieName());
    }
}
