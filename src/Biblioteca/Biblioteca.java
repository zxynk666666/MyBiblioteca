package Biblioteca;

import Menu.Menu;
import java.util.Scanner;

public class Biblioteca {

    public String showWelcome() {

        return "Welcome\n";
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Menu menu = new Menu();

        biblioteca.showWelcome();

        while (true) {
            menu.showMenuList();
        }
    }

    public int getMenuSelection() {
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();

        return selection;
    }
}
