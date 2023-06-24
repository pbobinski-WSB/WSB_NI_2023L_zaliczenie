import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        int suma = liczba1 + liczba2;

        System.out.println("Suma liczb " + liczba1 + " i " + liczba2 + " wynosi: " + suma);
    }
}
