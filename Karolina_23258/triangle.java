import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość pierwszego boku: ");
        double a = scanner.nextDouble();

        System.out.println("Podaj długość drugiego boku: ");
        double b = scanner.nextDouble();

        System.out.println("Podaj długość trzeciego boku: ");
        double c = scanner.nextDouble();

        double obwod = a + b + c;

        System.out.println("Obwód trójkąta: " + obwod);

        scanner.close();
    }
}
