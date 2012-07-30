import Biblioteca.Biblioteca;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class TestBiblioteca {
    @Test
    public void showWelcomeTest() {
        Biblioteca bibliotecaTest = new Biblioteca();
        assertEquals("Welcome\n", bibliotecaTest.showWelcome());
    }
}
