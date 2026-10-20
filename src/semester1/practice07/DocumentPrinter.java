package semester1.practice07;

public class DocumentPrinter {
    public void print(String message) {
        System.out.println(message);
    }

    public void print(int number) {
        System.out.println("[INT]: " + number);
    }

    public void print(double number, int decimals) {
        String format = "%." + decimals + "f";
        System.out.printf(format, number);
    }

    public void print(String[] lines) {
        int count = 1;
        for (String i : lines) {
            System.out.println(count++ + ". " + i);
        }
    }

    public void print(String message, boolean uppercase) {
        if (uppercase) {
            System.out.println(message.toUpperCase());
        } else {
            System.out.println(message);
        }
    }
}
