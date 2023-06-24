package app.utils;

/**
 * klasa pomocnicza
 */
public class Utilities {
    /**
     * Metoda oblicza rok urodzenia na podstawie wieku i aktualnego roku
     * @param age wiek
     * @param currentYear aktualny rok
     * @return rok urodzenia
     */
    public static int getDateOfBirth(int age,int currentYear){
        return currentYear - age;
    }
}
