package Movie;

public class Movies {

    private String _movieName;
    private String _director;
    private int _rate;

    public Movies(String movieName, String director, int rate) {
        this._movieName = movieName;
        this._director = director;
        this._rate = rate;
    }

    public String getMovieName() {
        return _movieName;
    }

    public String getDirector() {
        return _director;
    }

    public String getRate() {
        if(_rate == 0) {
            return "N/A";
        } else {
            return String.valueOf(_rate);
        }
    }
}
