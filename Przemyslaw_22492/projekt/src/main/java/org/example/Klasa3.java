package org.example;

import zadanie.Klasa;
import zadanie.Klasa2;

/**
 * Klasa importuje klase Klasa oraz Klasa2 z pakietu zadanie
 * Ma 2 metody
 * jedna zwraca int z klasy2
 * druga zwraca String z klasa
 */
public class Klasa3 {
    Klasa2 klasa2 = new Klasa2();
    Klasa klasa = new Klasa();
    public String text(){
        return klasa2.text();
    }
    public int matma1(){
        return klasa.matma1();
    }


}
