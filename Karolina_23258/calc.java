import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int liczba3 = scanner.nextInt();

        int suma = liczba1 + liczba2 + liczba3;
        double srednia = (double) suma / 3;

        System.out.println("Suma liczb " + liczba1 + ", " + liczba2 + " i " + liczba3 + " wynosi: " + suma);
        System.out.println("Średnia liczb " + liczba1 + ", " + liczba2 + " i " + liczba3 + " wynosi: " + srednia);

        if (suma % 2 == 0) {
            System.out.println("Suma liczb jest parzysta.");
        } else {
            System.out.println("Suma liczb jest nieparzysta.");
        }
    }
}
