package ResourcesManager.Library;

import Resources.Book.Book;
import Resources.Movie.Movie;
import ResourcesManager.BookMgr.BookMgr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Library {

    public Map initBooks() {
        Map<Integer, Book> bookHashMap = new HashMap<Integer, Book>();

        Book book_1 = new Book("Book_1", false);
        bookHashMap.put(1, book_1);
        Book book_2 = new Book("Book_2", false);
        bookHashMap.put(2, book_2);
        Book book_3 = new Book("Book_3", false);
        bookHashMap.put(3, book_3);

        return bookHashMap;
    }

    public Map<Integer, Movie> initMovies() {
        Map<Integer, Movie> moviesHashMap = new HashMap<Integer, Movie>();

        Movie movie_1 = new Movie("Movie_1", "Director_1", 1);
        moviesHashMap.put(1, movie_1);
        Movie movie_2 = new Movie("Movie_2", "Director_2", 2);
        moviesHashMap.put(2, movie_2);
        Movie movie_3 = new Movie("Movie_3", "Director_3", 3);
        moviesHashMap.put(3, movie_3);
        Movie movie_4 = new Movie("Movie_4", "Director_4", 4);
        moviesHashMap.put(4, movie_4);
        Movie movie_5 = new Movie("Movie_5", "Director_5", 0);
        moviesHashMap.put(5, movie_5);

        return moviesHashMap;
    }

    public void showBooks(Map books) {
        Book book = null;
        Object counter;

        Iterator inter = books.entrySet().iterator();
        while (inter.hasNext()) {
            Map.Entry entry = (Map.Entry) inter.next();
            counter = entry.getKey();
            book = (Book) entry.getValue();
            System.out.println(counter + ". " + book.getBookName());
        }
    }

    public void showMovies(Map movies) {
        Movie movie = null;
        Object counter;

        Iterator inter = movies.entrySet().iterator();
        while (inter.hasNext()) {
            Map.Entry entry = (Map.Entry) inter.next();
            counter = entry.getKey();
            movie = (Movie) entry.getValue();
            System.out.println(counter + ". " + movie.getMovieName() + " " + movie.getDirector() + " " + movie.getRate());
        }
    }

    public void dealWithBookSelection(Map books) {
        Scanner input = new Scanner(System.in);
        int whichBook = input.nextInt();

        BookMgr bookMgr = new BookMgr(books);
        if(bookMgr.reserveBook(whichBook)) {
            System.out.println("Thank You! Enjoy the book.");
        } else {
            System.out.println("Sorry we don't have that book yet.");
        }
    }
}
