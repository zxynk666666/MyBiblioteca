package MenuOption;

import ResourcesManager.Library.Library;

import java.util.Map;

public class Menu {


    Library myLibrary = new Library();

    public void showMenuList() {
        System.out.println("1. View all boos.");
        System.out.println("2. View all movies.");
        System.out.println("3. Check ID.");
    }

    public void selectMenuOption(int selection, Map books, Map movies) {
        switch (selection) {
            case 1:
                myLibrary.showBooks(books);
                myLibrary.dealWithBookSelection(books);
                break;
            case 2:
                myLibrary.showMovies(movies);
                break;
            case 3:
                break;
            default:
                System.out.println("Select a valid option!!");
                break;
        }
    }
}
