package Application;

import MenuOption.Menu;
import ResourcesManager.Library.Library;
import UserOperation.UserOperation;

import java.util.Map;

public class Application {

    public void showWelcome() {

        System.out.println("Welcome!");
    }

    public static void main(String[] args) {
        Application application = new Application();
        Menu menu = new Menu();
        UserOperation userOperation = new UserOperation();
        Library library = new Library();
        Map allBooks = library.initBooks();
        Map allMovies = library.initMovies();

        application.showWelcome();

        while (true) {
            menu.showMenuList();
            menu.selectMenuOption(userOperation.getUserSelection(), allBooks, allMovies);
        }
    }
}
