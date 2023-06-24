public class Kino {
    /*
    dziecko < 10
    nastolatek/ka <18
    dorosly bez ograniczen
     */
    public static void main(String[] args) {

        int wiek = 10;
        int dzieci = 10;
        int nastolatki = 20;
        int dorosly = 21;

        if (wiek < dzieci) {
            System.out.println("Zapraszamy na film dziecięciecy ");
            if (wiek < nastolatki) {
            } else if (wiek > 20) {
                System.out.println("Nie możesz wejść na film jesteś za młody");
                if (wiek < nastolatki) {
                    System.out.println("Zapraszamy na film nastolatku");
                } else {
                    System.out.println("Nie można wejśc na film jesteś za młody");
                }
                if (wiek < dorosly) {
                    System.out.println("Zapraszamy na film ");

                }
            }
        }
    }
}
