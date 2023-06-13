package org.wypisywanie;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ksiazki.Ksiazka;
import org.ksiazki.ListaKsiazek;

import java.util.List;

/**
 * Klasa wypisująca książki
 */
public class WypisywanieKsiazek {

    private static final Logger logger = LogManager.getLogger(WypisywanieKsiazek.class);

    /**
     * Metoda służąca do wypisywania książek
     */
    public static void wypiszKsiazki(){
        List<Ksiazka> listaKsiazek = ListaKsiazek.utworzListeKsiazek();

        for (Ksiazka ksiazka : listaKsiazek){
            logger.info("Dane książki:");
            logger.info("Tytuł: " + ksiazka.tytul);
            logger.info("Autor: " + ksiazka.autor);
            logger.info("Gatunek: " + ksiazka.gatunek);
        }
    }
}
