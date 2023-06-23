package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Takie_cos_2_Test {

    @Test
    void kalk2() {
        Takie_cos_2 takieCos2 = new Takie_cos_2();

        Assertions.assertEquals(takieCos2.kalk2(), 39);
    }

    @Test
    void toPisze() {
        Takie_cos_2 takieCos2 = new Takie_cos_2();

        Assertions.assertEquals(takieCos2.toPisze(), "tekst");
    }
}