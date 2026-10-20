package semester1.practice04;

import java.util.Scanner;

public class practice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Оберіть завдання (1-40): ");
        int task = scanner.nextInt();

        switch (task) {
            case 1 -> Task1();
            case 2 -> Task2();
            case 3 -> Task3();
            case 4 -> Task4();
            case 5 -> Task5();
            case 6 -> Task6();
            case 7 -> Task7();
            case 8 -> Task8();
            case 9 -> Task9();
            case 10 -> Task10();
            case 11 -> Task11();
            case 12 -> Task12();
            case 13 -> Task13();
            case 14 -> Task14();
            case 15 -> Task15();
            case 16 -> Task16();
            case 17 -> Task17();
            case 18 -> Task18();
            case 19 -> Task19();
            case 20 -> Task20();
            case 21 -> Task21();
            case 22 -> Task22();
            case 23 -> Task23();
            case 24 -> Task24();
            case 25 -> Task25();
            case 26 -> Task26();
            case 27 -> Task27();
            case 28 -> Task28();
            case 29 -> Task29();
            case 30 -> Task30();
            case 31 -> Task31();
            case 32 -> Task32();
            case 33 -> Task33();
            case 34 -> Task34();
            case 35 -> Task35();
            case 36 -> Task36();
            case 37 -> Task37();
            case 38 -> Task38();
            case 39 -> Task39();
            case 40 -> Task40();
            default -> System.out.println("Мяу?");
        }

        scanner.close();
    }

    public static void Task1() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Java - надійна та кросплатформна мова!");
        }
    }

    public static void Task2() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int limit = scanner.nextInt();
        for (int i = 1; i < limit + 1; i++) {
            System.out.println("[" + i + "] " + text);
        }
        scanner.close();
    }

    public static void Task3() {
        int balance = 0;
        for (int i = 1; i < 13; i++) {
            balance += 500;
            System.out.println("Місяць " + i + ": " + balance + " грн");
        }
    }

    public static void Task4() {
        Scanner scanner = new Scanner(System.in);
        double rate = scanner.nextDouble();
        for (int i = 1; i < 11; i++) {
            System.out.println((i * 10) + " євро = " + (rate * i * 10) + " грн");
        }
        scanner.close();
    }

    public static void Task5() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("=");
        }
        System.out.println();
        scanner.close();
    }

    public static void Task6() {
        int count = 10;
        while (count >= 1) {
            System.out.println(count--);
        }
        System.out.println("Поїхали! Ракета запущена!");
    }

    public static void Task7() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int input = scanner.nextInt();
        while (input != 0) {
            number += input;
            input = scanner.nextInt();
        }
        System.out.println("Сума: " + number);
        scanner.close();
    }

    public static void Task8() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int maybeItsNumberM = 1;
        System.out.print("Степені двійки до " + number + ": ");
        while (maybeItsNumberM <= number) {
            System.out.print(maybeItsNumberM + " ");
            maybeItsNumberM *= 2;
        }
        System.out.println();
        scanner.close();
    }

    public static void Task9() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int count = 0;
        while (number > 0) {
            count++;
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Кількість цифр: " + count + ", сума цифр: " + sum);
        scanner.close();
    }

    public static void Task10() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int newNumber = 0;
        int nextNumber = 0;
        while (number > 0) {
            nextNumber = number % 10;
            number /= 10;
            newNumber = newNumber * 10 + nextNumber;
        }
        System.out.println("Реверс: " + newNumber);
        scanner.close();
    }

    public static void Task11() {
        Scanner scanner = new Scanner(System.in);
        double deposit = scanner.nextInt();
        scanner.nextLine();
        double rate = scanner.nextDouble() / 100;
        double finalSum = deposit;
        int yearPassed = 0;
        while (finalSum < deposit * 2) {
            finalSum = finalSum + (rate * finalSum);
            yearPassed++;
        }
        System.out.println(finalSum + " через " + yearPassed + " років");
        scanner.close();
    }

    public static void Task12() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int divider = 2;
        while (number % divider != 0) {
            divider++;
        }
        System.out.println("Найменший дільник: " + divider);
        scanner.close();
    }

    public static void Task13() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess = 101;
        int attempts = 0;
        System.out.println("Я загадав число від 1 до 100. Спробуй вгадати!");
        while (randomNumber != guess) {
            guess = scanner.nextInt();
            scanner.nextLine();
            attempts++;
            if (guess > randomNumber) {
                System.out.println("Менше!");
            }
            if (guess < randomNumber) {
                System.out.println("Більше!");
            }
        }
        System.out.println("Вгадав за " + attempts + " спроб!");
        scanner.close();
    }

    public static void Task14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Розпочати нову гру
                2. Завантажити збереження
                3. Налаштування
                0. Вихід""");
        int input;
        do {
            System.out.println("""
                    1. Розпочати нову гру
                    2. Завантажити збереження
                    3. Налаштування
                    0. Вихід""");
            input = scanner.nextInt();
            switch (input) {
                case 1 -> System.out.println("You only have ONE SHOT");
                case 2 -> System.out.println("Схоже, збережень вже нема...");
                case 3 -> System.out.println("Це консольна гра, які налаштування ти бажаєш тут побачити?");
                case 0 -> System.out.println("Бувай!");
                default -> System.out.println("Немає такого пункту меню");
            }
        } while (input != 0);
        scanner.close();
    }

    public static void Task15() {
        Scanner scanner = new Scanner(System.in);
        int age;
        do {
            System.out.println("Введіть ваш вік");
            age = scanner.nextInt();
            scanner.nextLine();
            if ((age < 1) || (age > 120)) {
                System.out.println("Вік повинен бути менше 120 та більше 1!!!");
            }
        } while ((age < 1) || (age > 120));
        System.out.println("Вік підтверджено: " + age);
        scanner.close();
    }

    public static void Task16() {
        Scanner scanner = new Scanner(System.in);
        int attemptLeft = 3;
        int passwordAttempt;
        boolean access = false;
        do {
            System.out.println("Введіть пароль:");
            passwordAttempt = scanner.nextInt();
            scanner.nextLine();
            attemptLeft--;
            if (passwordAttempt == 1234) {
                access = true;
                break;
            } else {
                System.out.println("Пароль не правильний. Спробуйте ще раз");
            }
        } while (attemptLeft > 0);
        if (access) {
            System.out.println("Доступ надано");
        } else {
            System.out.println("Карту заблоковано!");
        }
        scanner.close();
    }

    public static void Task17() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber = 1;
        int thirdNumber = 1;
        String input;
        do {
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = firstNumber + secondNumber;
            System.out.println("Наступне число: " + thirdNumber);
            System.out.println("Бажаєте продовжити? (y/n)");
            input = scanner.nextLine();
            while (!input.equalsIgnoreCase("N") && !input.equalsIgnoreCase("Y")) {
                System.out.println("Це не є відповідь, спробуйте ще раз");
                input = scanner.nextLine();
            }
            if (input.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
        scanner.close();
    }

    public static void Task18() {
        int dice1;
        int dice2;
        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            System.out.println("Кубики:" + dice1 + " " + dice2);
        } while (dice1 != dice2);
        System.out.println("Це нарешті закінчилося");
    }

    public static void Task19() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть чисельник:");
        int numerator = scanner.nextInt();
        scanner.nextLine();
        int denominator;
        do {
            System.out.println("Введіть знаменник(рекомендовано не 0): ");
            denominator = scanner.nextInt();
        } while (denominator == 0);
        System.out.println(numerator + " / " + denominator + " = " + ((double) numerator / denominator));
        scanner.close();
    }

    public static void Task20() {
        Scanner scanner = new Scanner(System.in);
        int scoreCount = 0;
        int scoreSum = 0;
        int score;
        do {
            System.out.println("Введіть бал (0-100), від'ємне число = завершити:");
            score = scanner.nextInt();
            scanner.nextLine();
            if (score < 0) {
                break;
            }
            if (score > 100) {
                System.out.println("Бал не може бути більше 100, спробуйте ще раз");
                continue;
            }
            scoreCount++;
            scoreSum += score;
        } while (true);
        if (scoreCount == 0) {
            System.out.println("Жодного бала не введено");
        } else {
            System.out.println("Середній бал: " + ((double) scoreSum / scoreCount));
        }
        scanner.close();
    }

    public static void Task21() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if ((a % 2) == 1) {
            a++;
        }
        for (; a <= b; a += 2) {
            System.out.print(a + " ");
        }
        System.out.println();
        scanner.close();
    }

    public static void Task22() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i < number + 1; i++) {
            factorial *= i;
        }
        System.out.println(number + "! = " + factorial);
        scanner.close();
    }

    public static void Task23() {
        System.out.println("Число | Квадрат | Куб");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%-7d | %-7d | %-7d%n", i, i * i, i * i * i);
        }
    }

    public static void Task24() {
        for (int i = 1; i <= 50; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void Task25() {
        for (int i = 100; i <= 200; i++) {
            if ((i % 13 == 0) && (i % 7) == 0) {
                System.out.println("Знайдено: " + i);
                break;
            }
        }
    }

    public static void Task26() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i + " - " + (int) i);
        }
    }

    public static void Task27() {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        int a = 1;
        int b = 1;
        int c;
        if (max-- >= 1) {
            System.out.print(a + " ");
            if (max-- >= 1) {
                System.out.print(b + " ");
                for (int i = 0; i < max; i++) {
                    c = b;
                    b = a;
                    a = b + c;
                    System.out.print(a + " ");
                }
            }
        }
        scanner.close();
    }

    public static void Task28() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        int difference = scanner.nextInt();
        scanner.nextLine();
        System.out.print(number + " ");
        int sum = number;
        for (int i = scanner.nextInt() - 1; i > 0; i--) {
            number += difference;
            sum += number;
            System.out.print(number + " ");
        }
        System.out.println("\nСума: " + sum);
        scanner.close();
    }

    public static void Task29() {
        // 01111111 = 128. 10000000 = -128
        byte b = 125;
        for (int i = 0; i < 6; i++) {
            b = (byte) (b + 1);
            System.out.println("Крок " + (i + 1) + ": b = " + b);
        }
    }

    public static void Task30() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скільки чисел введеш?");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        // без приведення обидва числа int, тому ділення ціле і все після коми зникає ще до double
        double wrongAverage = sum / n;
        double rightAverage = (double) sum / n;
        System.out.println("Без приведення: " + wrongAverage);
        System.out.println("З приведенням: " + rightAverage);
        scanner.close();
    }

    public static void Task31() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String encrypted = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            encrypted += (char) (ch + 1);
        }
        System.out.println("Зашифроване слово: " + encrypted);
        scanner.close();
    }

    public static void Task32() {
        Scanner scanner = new Scanner(System.in);
        int wholeGrn = 0;
        double droppedKop = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Цінник №" + i + ":");
            double price = scanner.nextDouble();
            wholeGrn += (int) price;
            droppedKop += price - (int) price;
        }
        System.out.println("Сума цілих гривень: " + wholeGrn);
        System.out.println("Сума відкинутих копійок: " + droppedKop);
        scanner.close();
    }

    public static void Task33() {
        for (int i = 1; i <= 50; i++) {
            int percent = (int) (((double) i / 50) * 100);
            System.out.println("Завантажено: " + percent + "%");
        }
        System.out.println("Файл завантажено!");
    }

    public static void Task34() {
        // 3 мільярди не влазять в int, тому при приведенні старші біти відкинулись і число стало зовсім іншим
        long bigNumber = 3_000_000_000L;
        int narrowed = (int) bigNumber;
        System.out.println("long: " + bigNumber);
        System.out.println("int після приведення: " + narrowed);
    }

    public static void Task35() {
        System.out.println("Поганий варіант :");
        for (double d = 0.0; d <= 1.0; d += 0.1) {
            System.out.println(d);
        }
        System.out.println("Хороший варіант:");
        for (int i = 0; i <= 10; i++) {
            double val = i / 10.0;
            System.out.println(val);
        }
    }

    public static void Task36() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }

    public static void Task37() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Висота:");
        int h = scanner.nextInt();
        System.out.println("Ширина:");
        int w = scanner.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (i == 1 || i == h || j == 1 || j == w) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void Task38() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void Task39() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        scanner.close();
    }

    public static void Task40() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
