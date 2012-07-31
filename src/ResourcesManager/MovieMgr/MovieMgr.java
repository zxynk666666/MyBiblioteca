package ResourcesManager.MovieMgr;

import Resources.Movie.Movie;

import java.util.Map;

public class MovieMgr {
    private Map<Integer, Movie> _movies;

    public MovieMgr(Map<Integer, Movie> movies) {
        this._movies = movies;
    }
}
