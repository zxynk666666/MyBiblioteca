import Resources.Movie.Movie;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestMovie {
    @Test
    public void getMovieNameTest() {
        Movie testMovie = new Movie("TestMovie1", "Director1", 0);

        assertEquals("TestMovie1", testMovie.getMovieName());
    }

    @Test
    public void getDirectorTest() {
        Movie testMovie = new Movie("TestMovie1", "Director1", 0);

        assertEquals("Director1", testMovie.getDirector());
    }

    @Test
    public void getRateTest() {
        Movie testMovie = new Movie("TestMovie1", "Director1", 0);

        assertEquals("N/A", testMovie.getRate());

        Movie testMovie1 = new Movie("TestMovie2", "Director2", 1);
        assertEquals("1", testMovie1.getRate());
    }
}
