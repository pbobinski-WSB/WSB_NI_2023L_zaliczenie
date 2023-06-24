public class DataTypes {

    public static void main(String[] args) {
        System.out.println("--------------------------DataTypes---------------------");

        int herInt = 12;
        int hisInt = 11;
        float herFloat = 123313.31241f;
        double hisDouble = 2134.2345d;
        char myChar = 'C';
        String she = "Paulina";
        String he = "Konrad";
        boolean myBool = true ;

        System.out.println("herInt: " + herInt);
        System.out.println("hisInt: " + hisInt);
        System.out.println("herFloat: " + herFloat);
        System.out.println("hisDouble: " + hisDouble);
        System.out.println("myChar: " + myChar);
        System.out.println(she + " i " + he + " są pary .");

        System.out.printf("%s i %s kupili auto i zapłacili %.2f \n", she, he, herFloat, hisDouble);

        if (myBool) {
            System.out.println(" alall");
        }
        else
            System.out.println(" nnnnn ");


    }
}
