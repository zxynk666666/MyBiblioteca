package MenuOption;

import ResourcesManager.Library.Library;

import java.util.Map;

public class Menu {


    Library myLibrary = new Library();
    private int menuSelection;

    public void showMenuList() {
        System.out.println("1. View all boos.");
        System.out.println("2. View all movies.");
        System.out.println("3. Check ID.");
    }

    public int selectMenuOption(int selection, Map books, Map movies) {
        switch (selection) {
            case 1:
                myLibrary.showBooks(books);
                myLibrary.dealWithBookSelection(books);
                break;
            case 2:
                myLibrary.showMovies(movies);
                menuSelection = 2;
                break;
            case 3:
                menuSelection = 3;
                break;
            default:
                System.out.println("Select a valid option!!");
                menuSelection = 0;
                break;
        }
        return menuSelection;
    }
}
