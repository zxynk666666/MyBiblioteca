import Menu.Menu;
import MyOutputstream.MyOutStream;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestMenu {

    @Test
    public void showMenuListTest() {
        MyOutStream testOutputStream = new MyOutStream();
        Menu testMenu = new Menu(testOutputStream);
        testMenu.showMenuList();
        assertEquals("1. View all boos.\n2. View all movies.\n3. Check ID.\n", testOutputStream.getOutput());
    }
}
