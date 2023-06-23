package org.example;

import zadanie.Klasa;
import zadanie.Klasa2;

/**
 * ta klasa importuje klasę Klasa z pakietu - zadanie
 * posiada dwie metody
 * jedna zwraca int
 * druga zwraca string
 */
public class Klasa3 {
    Klasa2 klasa2 = new Klasa2();
    Klasa klasa = new Klasa();
    public  int kalk2(){
        return klasa2.kalk1();
    }
    public String toPisze(){
        return  klasa.nazwa();
    }
}
