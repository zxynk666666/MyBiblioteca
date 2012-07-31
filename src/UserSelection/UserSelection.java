package UserSelection;

import java.util.Scanner;

public class UserSelection {

    public int getUserSelection() {
        int selection;

        Scanner inputStream = new Scanner(System.in);
        selection = inputStream.nextInt();

        return selection;
    }
}
