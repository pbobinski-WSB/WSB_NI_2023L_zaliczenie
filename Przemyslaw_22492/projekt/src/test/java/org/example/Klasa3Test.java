package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Klasa3Test {
    @Test
    public void testyy() {
        Klasa3 klasa3 = new Klasa3();
        Assertions.assertEquals(klasa3.text(), "Testy");

    }
    @Test
    public void testyy1() {
        Klasa3 klasa3 = new Klasa3();
        Assertions.assertEquals(klasa3.matma1(), 3);

    }
}