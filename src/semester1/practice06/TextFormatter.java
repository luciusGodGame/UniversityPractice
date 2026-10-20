package semester1.practice06;

public class TextFormatter {
    public String formatTitle(String text) {
        return "*** " + text.toUpperCase() + " ***";
    }

    public int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (Character.toLowerCase(text.charAt(i))) {
                case 'а', 'о', 'у', 'е', 'і', 'я', 'ю', 'є', 'ї', 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }
        return count;
    }
}
