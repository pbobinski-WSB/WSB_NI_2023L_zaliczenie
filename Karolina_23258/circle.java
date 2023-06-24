import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj promień koła: ");
        double r = scanner.nextDouble();

        double obwod = 2 * Math.PI * r;
        double pole = Math.PI * Math.pow(r, 2);

        System.out.println("Obwód koła: " + obwod);
        System.out.println("Pole koła: " + pole);

        scanner.close();
    }
}
