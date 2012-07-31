package MenuOption;

import ResourcesManager.Library.Library;

import java.util.Map;

public class Menu {


    Library myLibrary = new Library();
    Map allBooks = myLibrary.initBooks();
    Map allMovies = myLibrary.initMovies();

    public void showMenuList() {
        System.out.println("1. View all boos.");
        System.out.println("2. View all movies.");
        System.out.println("3. Check ID.");
    }

    public void selectMenuOption(int selection) {
        switch (selection) {
            case 1:
                myLibrary.showBooks(allBooks);
                break;
            case 2:
                myLibrary.showMovies(allMovies);
                break;
            case 3:
                break;
            default:
                System.out.println("Select a valid option!!");
                break;
        }
    }

}
