package Library;

import Book.Book;
import Movie.Movies;

import java.util.HashMap;
import java.util.Map;

public class Library {

    public Map initBooks() {
        Map<Integer, Book> bookHashMap = new HashMap<Integer, Book>();

        Book book_1 = new Book("Book_1");
        bookHashMap.put(1, book_1);
        Book book_2 = new Book("Book_2");
        bookHashMap.put(2, book_2);
        Book book_3 = new Book("Book_3");
        bookHashMap.put(3, book_3);

        return bookHashMap;
    }

    public Map<Integer, Movies> initMovies() {
        Map<Integer, Movies> moviesHashMap = new HashMap<Integer, Movies>();

        Movies movies_1 = new Movies("Movie_1", "Director_1", 1);
        moviesHashMap.put(1, movies_1);
        Movies movies_2 = new Movies("Movie_2", "Director_2", 2);
        moviesHashMap.put(2, movies_2);
        Movies movies_3 = new Movies("Movie_3", "Director_3", 3);
        moviesHashMap.put(3, movies_3);
        Movies movies_4 = new Movies("Movie_4", "Director_4", 4);
        moviesHashMap.put(4, movies_4);
        Movies movies_5 = new Movies("Movie_5", "Director_5", 5);
        moviesHashMap.put(5, movies_5);

        return moviesHashMap;
    }
}
