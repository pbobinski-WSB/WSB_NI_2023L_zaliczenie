import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Klasa reprezentująca interfejs użytkownika.
 */
public class UI {
    protected static final Logger logger = LogManager.getLogger();

    /**
     * Metoda główna programu odpowiadająca za odpowiednią komunikacje z użytkownikiem w konsoli.
     */
    public static void main() {
        Scanner scan = new Scanner(System.in);
        Dodawanie dodawanie = new Dodawanie();
        Srednia liczenieSredniej = new Srednia();

        System.out.println("Podaj dwie liczby zatwierdzając enterem: ");
        double liczba1 = scan.nextDouble();
        double liczba2 = scan.nextDouble();

        double wynikDodawania = dodawanie.dodaj(liczba1, liczba2);
        double wynikSrednia = liczenieSredniej.srednia(liczba1, liczba2);
        while (true) {
            System.out.println(System.lineSeparator().repeat(50));
            System.out.println("Wybierz co chcesz zobaczyć:\n 1. Suma \n 2. Średnia \n 3. Wyjście");
            int on = scan.nextInt();
            if (on == 1) {
                System.out.println(wynikDodawania + "\n Wybierz dowolny przycisk i zatwierdź, aby kontynuować");
                scan.next();

            } else if (on == 2) {
                System.out.println(wynikSrednia + "\n Wybierz dowolny przycisk i zatwierdź, aby kontynuować");
                scan.next();

            } else if (on == 3) {
                break;
            } else {
                logger.error("Podałeś błędną komendę");
                scan.next();
            }
        }
    }
}