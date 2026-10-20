package semester1.practice02.homework;

public class Task2NumberAnalysis {
    public static void main(String[] args) {
        int number = 742;
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;
        int reversedNumber = units * 100 + tens * 10 + hundreds;
        int numberSum = hundreds + tens + units;
        boolean isSumEvent = ((numberSum) % 2) == 0;
        System.out.println("Початкове число:            " + number +
                "\nРозряди:                    Сотні = " + hundreds + ", Десятки = " + tens + ", Одиниці = " + units +
                "\nСума цифр:                  " + numberSum +
                "\nДобуток цифр:               " + (hundreds * tens * units) +
                "\nПеревернуте число:          " + reversedNumber +
                "\nЧи є сума цифр парною?      " + isSumEvent);
    }

}
