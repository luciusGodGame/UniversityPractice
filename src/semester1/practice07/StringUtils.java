package semester1.practice07;

public class StringUtils {
    private StringUtils() {
    }

    public static boolean isPalandrome(String s) {
        String temp = reverse(s);
        return temp.equals(s);
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static int countVowels(String s) {
        int count = 0;
        for (char i : s.toLowerCase().toCharArray()) {
            switch (i) {
                case 'e', 'y', 'u', 'i', 'o', 'a', 'у', 'е', 'о', 'а', 'і', 'и', 'я', 'ю', 'є', 'ї' -> count++;
            }
        }
        return count;
    }

    public static String maskCardNumber(String cardNumber) {
        return "*".repeat(cardNumber.length() - 4) + cardNumber.substring(cardNumber.length() - 4);
    }
}
