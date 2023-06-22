package do_zadania;

import lombok.ToString;

/**
 * Ta klasa posiada jedną metodę która zwraca int oraz dwie zmienne,
 * które są wypisywane przez main'a za pomocą Lombok @ToString
 */
@ToString
public class Takie_cos {
    int a =19,b = 20;
    //żeby to wypisać używam lombok toString
    public int kalk1(){
        return 39;
    }
}
