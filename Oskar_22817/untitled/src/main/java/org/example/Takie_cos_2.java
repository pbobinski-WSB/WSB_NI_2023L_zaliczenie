package org.example;

import do_zadania.Takie_cos;
import do_zadania.Takie_cos_1;
/**
 * To jest java doc
 * ta klasa improtuje klasę Takie_cos oraz Takie_cos_1 z pakunku - do_zadania
 * posiada dwie metody
 * jedna zwraca int
 * druga zwraca string
 */
public class Takie_cos_2 {
    Takie_cos takieCos = new Takie_cos();
    Takie_cos_1 takieCos1 = new Takie_cos_1();
    public int kalk2(){
        return takieCos.kalk1();
    }
    public String toPisze(){
        return takieCos1.tekst();
    }
}
