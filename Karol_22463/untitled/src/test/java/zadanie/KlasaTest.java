package zadanie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KlasaTest {

    @Test
    public void TestKlasa() {
        Klasa klasa = new Klasa();

        Assertions.assertEquals(klasa.nazwa(), "tekst");
    }
}