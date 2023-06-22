package zadanie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KlasaTest {
    @Test
    public void testyy() {
        Klasa klasa = new Klasa();
        Assertions.assertEquals(klasa.matma1(), 3);
    }
}