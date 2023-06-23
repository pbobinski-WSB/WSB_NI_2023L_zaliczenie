package do_zadania;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Takie_cos_1Test {

    @Test
    void tekst() {
        Takie_cos_1 takieCos1 = new Takie_cos_1();

        Assertions.assertEquals(takieCos1.tekst(), "tekst");
    }
}