package org.wypisywanie;

import org.ksiazki.Ksiazka;
import org.ksiazki.ListaKsiazek;

import java.util.List;

public class WypisywanieKsiazek {

    public static void wypiszKsiazki(){
        List<Ksiazka> listaKsiazek = ListaKsiazek.utworzListeKsiazek();

        for (Ksiazka ksiazka : listaKsiazek){
            System.out.println("Dane książki:");
            System.out.println("Tytuł: " + ksiazka.tytul);
            System.out.println("Autor: " + ksiazka.autor);
            System.out.println("Gatunek: " + ksiazka.gatunek);
        }
    }
}
