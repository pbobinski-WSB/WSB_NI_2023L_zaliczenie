public class introduction {
    public static void main(String[] args) {
        String message = createMessage("Belmondo");
        printMessage(message);
    }

    public static String createMessage(String name) {
        return "Dzień dobry " + name + "!";
    }

    public static void printMessage(String message) {
        System.out.println("The message is: " + message);
    }
}
