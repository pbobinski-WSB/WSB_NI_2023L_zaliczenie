import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Klasa testująca interfejs użytkownika.
 */
public class TestUI {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    /**
     * Przygotowuje strumienie wejściowe/wyjściowe przed uruchomieniem testu.
     */
    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    /**
     * Przywraca oryginalne strumienie wejściowe/wyjściowe po zakończeniu testu.
     */
    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    /**
     * Testuje główną metodę interfejsu użytkownika.
     */
    @Test
    public void testUI() {
        String input = "5\n7\n1\n2\n3\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        UI.main();

        String expectedOutput = "Podaj dwie liczby zatwierdzając enterem: \n" +
                "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" +
                "Wybierz co chcesz zobaczyć:\n" +
                " 1. Suma \n" +
                " 2. Średnia \n" +
                " 3. Wyjście\n" +
                "12.0\n" +
                " Wybierz dowolny przycisk i zatwierdź, aby kontynuować\n" +
                "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" +
                "Wybierz co chcesz zobaczyć:\n" +
                " 1. Suma \n" +
                " 2. Średnia \n" +
                " 3. Wyjście\n" ;

        String normalizedExpected = expectedOutput.replaceAll("\\r\\n|\\r", "\n");
        String normalizedActual = testOut.toString().replaceAll("\\r\\n|\\r", "\n");
        assertEquals(normalizedExpected, normalizedActual);

        assertEquals(normalizedExpected, normalizedActual);
    }
}