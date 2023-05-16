/**
 * Klasa reprezentująca obliczanie średniej dwóch liczb.
 */
public class Srednia {
    private Dodawanie dodawanie = new Dodawanie();

    /**
     * Metoda obliczająca średnią dwóch liczb.
     *
     * @param liczba1 Pierwsza liczba.
     * @param liczba2 Druga liczba.
     * @return Średnia dwóch liczb.
     */
    public double średnia(double liczba1, double liczba2) {
        return dodawanie.dodaj(liczba1, liczba2) / 2;
    }
}
