package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Klasa3Test {

    @Test
    void kalk2() {
        Klasa3 klasa3 = new Klasa3();
        Assertions.assertEquals(klasa3.kalk2(), 39);
    }

    @Test
    void toPisze() {
        Klasa3 klasa3 = new Klasa3();
        Assertions.assertEquals(klasa3.toPisze(), "tekst");
    }
}