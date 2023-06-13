package org.ksiazki;

/**
 * Klasa definiująca książkę
 */
public class Ksiazka {
    /**
     * Tytuł książki
     */
    public String tytul;
    /**
     * Autor książki
     */
    public String autor;
    /**
     * Gatunek książki
     */
    public String gatunek;

    /**
     * Konstruktor
     * @param tytul tytuł książki
     * @param autor autor książki
     * @param gatunek gatunek książki
     */
    public Ksiazka(String tytul, String autor, String gatunek){
        this.tytul = tytul;
        this.autor = autor;
        this.gatunek = gatunek;
    }
}
