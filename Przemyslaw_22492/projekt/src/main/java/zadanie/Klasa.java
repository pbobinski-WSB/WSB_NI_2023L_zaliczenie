package zadanie;

import lombok.ToString;

/**
 * Ta klasa posiada metode int która zwraca 2 zmienne
 * następnie wypisyuwane są przez lombok.ToString
 */
@ToString
public class Klasa {
    int a = 1, b = 2;

    void matma() {
        System.out.println(a + b);
    }
    public int matma1(){
        return 3;
    }
}
