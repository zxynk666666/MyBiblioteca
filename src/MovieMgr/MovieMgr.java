package MovieMgr;

import Resources.Movie.Movies;
import MyOutputstream.MyOutStream;

import java.util.Map;

public class MovieMgr {
    private MyOutStream _output = new MyOutStream();
    private Map<Integer, Movies> _movies;

    public MovieMgr(MyOutStream output, Map<Integer, Movies> movies) {
        this._output = output;
        this._movies = movies;
    }

    public MovieMgr(Map<Integer, Movies> movies) {
        this._movies = movies;
    }

    public void showMovies() {
        Movies movies = null;
        int counter = 1;

        for(Map.Entry<Integer, Movies> bookMap:_movies.entrySet()){
            movies = bookMap.getValue();
            _output.myPrint(counter + ". " + movies.getMovieName() + " " + movies.getDirector() + " " + movies.getRate() + "\n");
            counter++;
        }
    }
}
