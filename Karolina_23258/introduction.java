public class introduction {
    public static void main(String[] args) {
        String message = createMessage("John");
        printMessage(message);
    }

    public static String createMessage(String name) {
        return "Hello, " + name + "!";
    }

    public static void printMessage(String message) {
        System.out.println("The message is: " + message);
    }
}
