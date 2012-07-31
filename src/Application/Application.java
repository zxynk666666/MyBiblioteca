package Application;

import MenuOption.Menu;
import UserOperation.UserOperation;

public class Application {

    public void showWelcome() {

        System.out.println("Welcome!");
    }

    public static void main(String[] args) {
        Application application = new Application();
        Menu menu = new Menu();
        UserOperation userOperation = new UserOperation();

        application.showWelcome();

        while (true) {
            menu.showMenuList();
            menu.selectMenuOption(userOperation.getUserSelection());
        }
    }
}
