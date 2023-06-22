package zadanie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Klasa2Test {

    @Test
    public void kalk() {
        Klasa2 klasa2 = new Klasa2();

        Assertions.assertEquals(klasa2.kalk1(), 39);
    }
}