package UserOperation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserOperation {

    public int getUserSelection() {
        int selection = 0;
        String inputString;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            inputString = input.readLine();
            selection = Integer.parseInt(inputString);
        } catch (Exception e) {
            System.out.println("Select a valid option!!");
        }

        return selection;
    }
}
