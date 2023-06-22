import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość zdobytych punktów:");
        int punkty = sc.nextInt();

        String ocena; //string ponieważ łatwiej wtedy przechować oceny 3.5 i 4.5
        if (punkty >= 0 && punkty <= 50) {
            ocena = "2";
        } else if (punkty <= 60) {
            ocena = "3";
        } else if (punkty <= 70) {
            ocena = "3.5";
        } else if (punkty <= 80) {
            ocena = "4";
        } else if (punkty <= 90) {
            ocena = "4.5";
        } else if (punkty <= 100) {
            ocena = "5";
        } else {
            ocena = "Niepoprawna ilość punktów!";
        }

        System.out.println("Ocena: " + ocena);
    }
}
