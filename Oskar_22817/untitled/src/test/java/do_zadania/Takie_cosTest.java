package do_zadania;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Takie_cosTest {

    @Test
    void kalk1() {
        Takie_cos takieCos = new Takie_cos();

        Assertions.assertEquals(takieCos.kalk1(), 39);
    }
}