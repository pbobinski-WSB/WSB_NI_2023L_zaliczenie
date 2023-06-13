package org.ksiazki;

import java.util.ArrayList;
import java.util.List;

public class ListaKsiazek {
    public static List<Ksiazka> utworzListeKsiazek(){
        List<Ksiazka> lista = new ArrayList<>();

        lista.add(new Ksiazka("Władca Pierścieni", "John Ronald Reuel Tolkien", "fantastyka"));
        lista.add(new Ksiazka("Ja diablica", "Katarzyna Berenika Miszczuk", "fantastyka"));
        lista.add(new Ksiazka("Dziewczyna z pociągu", "Paula Hawkins", "thriller psychologiczny"));
        lista.add(new Ksiazka("Wojownicy. Ogień i lód.", "Erin Hunter", "fantastyka"));
        lista.add(new Ksiazka("Gdzie śpiewają raki", "Delia Owens", "kryminał"));

        return lista;
    }
}
