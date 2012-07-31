import MovieMgr.MovieMgr;
import Resources.Movie.Movies;
import MyOutputstream.MyOutStream;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class TestMovieMgr {

    @Test
    public void viewAllMoviesTest() {
        MyOutStream testOutputStream = new MyOutStream();
        Map<Integer, Movies> movies = new HashMap<Integer, Movies>();

        Movies testMovies_1 = new Movies("TestMovie1", "Director1", 0);
        movies.put(1, testMovies_1);
        MovieMgr testMovieMgr = new MovieMgr(testOutputStream, movies);
        testMovieMgr.showMovies();

        assertEquals("1. TestMovie1 Director1 N/A\n", testOutputStream.getOutput());

        Map<Integer, Movies> movies_1 = new HashMap<Integer, Movies>();
        Movies testMovies_2 = new Movies("TestMovie2", "Director2", 10);
        movies_1.put(1, testMovies_2);

        MovieMgr testMovieMgr_1 = new MovieMgr(testOutputStream, movies_1);
        testMovieMgr_1.showMovies();

        assertEquals("1. TestMovie2 Director2 10\n", testOutputStream.getOutput());
    }
}
