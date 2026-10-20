package semester1.practice03;

import java.util.Scanner;

public class practice03 {
    public static void main(String[] arg) {
        System.out.print("Завдання номер...");
        Scanner scanner = new Scanner(System.in);
        int taskNumber = scanner.nextInt();
        scanner.nextLine();
        switch (taskNumber) {
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
            default -> System.out.println("Щось пійшло не так");
        }
        scanner.close();
    }

    public static void Task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вкажіть імя:");
        String name = scanner.nextLine();
        System.out.print("Вкажіть призвище:");
        String surname = scanner.nextLine();
        System.out.print("Вкажіть вік");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Вкажіть Місто проживання");
        String city = scanner.nextLine();
        System.out.println("=== ВХІДНІ ДАНІ ===" +
                "\nІмя: " + name +
                "\nПрізвище: " + surname +
                "\nВік: " + age +
                "\nМісто: " + city +
                "\n- - - - - - - - - - - - - - - -" +
                "\nПривіт, " + name + " " + surname + " з міста " + city + "! Твій вік: " + age + " р.");
        scanner.close();
    }

    public static void Task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();
        System.out.println("Сума: " + (a + b) +
                "\nРізниця: " + (a - b) +
                "\nДобуток: " + (a * b) +
                "\nОстача від ділення: " + (a % b));
        scanner.close();
    }

    public static void Task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть суму в гривнях (UAH): ");
        double uah = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введіть курс USD: ");
        double usdRate = scanner.nextDouble();
        System.out.println("Сума до видачі: " + (Math.round((uah / usdRate) * 100) / 100.0) + " USD");
        scanner.close();
    }

    public static void Task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер квитка: ");
        int ticketId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть повне імя студента: ");
        String fullName = scanner.nextLine();
        System.out.println("Введіть спеціальність: ");
        String speciality = scanner.nextLine();
        System.out.println("Студент: " + fullName + ", квиток №" + ticketId + ", спеціальність: " + speciality);
        scanner.close();
    }

    public static void Task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваш зріст (м): ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ваша вага (кг): ");
        double weight = scanner.nextDouble();
        System.out.println("Розрахований BMI: " + (Math.round((weight / Math.pow(height, 2)) * 100) / 100.0));
        scanner.close();
    }

    public static void Task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть символ: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Символ: " + ch + " | Код символу: " + (int) ch);
        scanner.close();
    }

    public static void Task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Катет А: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Катет В: ");
        double b = scanner.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Гіпотенуза: " + hypotenuse +
                "\nПериметр: " + (a + b + hypotenuse) +
                "\nПлоща: " + (a * b / 2));
        scanner.close();
    }

    public static void Task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Товар: ");
        String product = scanner.nextLine();
        System.out.print("Ціна: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Кількість: ");
        int quantity = scanner.nextInt();
        System.out.println("Товар: " + product +
                "\nЗагальна сума: " + (price * quantity) + " грн (з них ПДВ 20%: " + (price * quantity * 0.2) + " грн)");
        scanner.close();
    }

    public static void Task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number > 0) {
            System.out.println("Число додатне.");
        } else if (number < 0) {
            System.out.println("Число від'ємне.");
        } else {
            System.out.println("Число дорівнює нулю.");
        }
        scanner.close();
    }

    public static void Task10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number == 0) {
            System.out.println("Число є нулем");
        } else if (number % 2 == 0) {
            System.out.println("Число " + number + " є парним.");
        } else {
            System.out.println("Число " + number + " є непарним.");
        }
        scanner.close();
    }

    public static void Task11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вкажіть вік: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age < 0 || age > 120) {
            System.out.println("Некоректний вік");
        } else if (age <= 12) {
            System.out.println("Дитина");
        } else if (age <= 17) {
            System.out.println("Підліток");
        } else if (age <= 64) {
            System.out.println("Дорослий");
        } else {
            System.out.println("Пенсіонер");
        }
        scanner.close();
    }

    public static void Task12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть тестовий бал: ");
        int score = scanner.nextInt();
        scanner.nextLine();
        if (score < 0 || score > 100) {
            System.out.println("Помилка: некоректний бал!");
        } else if (score >= 90) {
            System.out.println("Відмінно (A)");
        } else if (score >= 82) {
            System.out.println("Дуже добре (B)");
        } else if (score >= 74) {
            System.out.println("Добре (C)");
        } else if (score >= 64) {
            System.out.println("Задовільно (D)");
        } else if (score >= 60) {
            System.out.println("Достатньо (E)");
        } else {
            System.out.println("Незадовільно (F)");
        }
        scanner.close();
    }

    public static void Task13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть 3 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();
        int max = a;
        int min = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("Максимум: " + max +
                "\nМінімум: " + min);
        scanner.close();
    }

    public static void Task14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть X: ");
        double x = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введіть Y: ");
        double y = scanner.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться в початку координат.");
        } else if (x == 0 || y == 0) {
            System.out.println("Точка (" + x + "; " + y + ") лежить на осі координат.");
        } else if (x > 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у I чверті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у II чверті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у III чверті.");
        } else {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у IV чверті.");
        }
        scanner.close();
    }

    public static void Task15() {
        int x = 5;
        int y = 20;
        if (x > 10)
            if (y > 10)
                System.out.println("x > 10 та y > 10");
            else
                System.out.println("else прив'язався до if (y > 10), хоча задум був для if (x > 10)!");

        if (x > 10) {
            if (y > 10) {
                System.out.println("x > 10 та y > 10");
            }
        } else {
            System.out.println("Тепер else виконується при x <= 10. Поточне x = " + x);
        }
    }

    public static void Task16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Спожито (кВт·год): ");
        int kWh = scanner.nextInt();
        scanner.nextLine();
        if (kWh <= 100) {
            System.out.println("Спожито: " + kWh + " кВт·год" +
                    "\nСума до сплати: " + kWh + " * 2.64 = " + (kWh * 2.64) + " грн");
        } else {
            System.out.println("Спожито: " + kWh + " кВт·год" +
                    "\nСума до сплати: 100 * 2.64 + " + (kWh - 100) + " * 4.32 = " + (100 * 2.64 + (kWh - 100) * 4.32) + " грн");
        }
        scanner.close();
    }

    public static void Task17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число x: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть число y: ");
        int y = scanner.nextInt();
        int max = (x > y) ? x : y;
        System.out.println("Більше число: " + max);
        scanner.close();
    }

    public static void Task18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int abs = (n < 0) ? -n : n;
        System.out.println("Модуль числа " + n + " дорівнює " + abs);
        scanner.close();
    }

    public static void Task19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        String result = (number % 2 == 0) ? "Парне" : "Непарне";
        System.out.println("Число " + number + " — " + result);
        scanner.close();
    }

    public static void Task20() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть бал: ");
        int score = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Результат: " + (score >= 60 ? "Зараховано" : "Не зараховано"));
        scanner.close();
    }

    public static void Task21() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String status = (n > 0) ? "Додатне" : (n < 0) ? "Від'ємне" : "Нуль";
        System.out.println("Число " + n + " — " + status);
        scanner.close();
    }

    public static void Task22() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сума покупки: ");
        double sum = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Сума покупки: " + sum + " грн" +
                "\nДо сплати зі знижкою: " + ((sum > 1000) ? sum * 0.9 : sum * 0.98) + " грн");
        scanner.close();
    }

    public static void Task23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ділене a: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть дільник b: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println((b != 0) ? "Результат ділення: " + ((double) a / b) : "Помилка: ділення на нуль неможливе!");
        scanner.close();
    }

    public static void Task24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість помилок: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println((count == 1) ? "Знайдено 1 помилку" : "Знайдено " + count + " помилок");
        scanner.close();
    }

    public static void Task25() {
        // Якщо ліве дає false, праве не обчислюється. Тому ділення на нуль не відбувається й ArithmeticException не виникає
        int x = 10;
        int divisor = 0;
        if (divisor != 0 && (x / divisor > 1)) {
            System.out.println("Успішне ділення");
        } else {
            System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
        }
    }

    public static void Task26() {
        int counter1 = 0;
        int counter2 = 0;
        boolean b1 = false && (++counter1 > 0);
        boolean b2 = false & (++counter2 > 0);
        System.out.println("Лінивий && результат = " + b1 + ", counter1 = " + counter1 +
                "\nЖадібний & результат = " + b2 + ", counter2 = " + counter2 +
                "\n&& не обчислює праву частину, коли ліва false, тому counter1 лишився 0," +
                "\nа жадібний & завжди обчислює обидва операнди, тому counter2 став 1");
    }

    public static void Task27() {
        int number = 5;
        if (number > 0 || (10 / 0 == 0)) {
            System.out.println("Умова виконана, аварійне ділення не викликалося!");
        }
    }

    public static void Task28() {
        int counterA = 0;
        int counterB = 0;
        boolean test1 = true || (++counterA > 0);
        boolean test2 = true | (++counterB > 0);
        System.out.println("Лінивий || результат = " + test1 + ", counterA = " + counterA +
                "\nЖадібний | результат = " + test2 + ", counterB = " + counterB +
                "\n|| пропускає праву частину при true ліворуч, тому counterA лишився 0" +
                "\nа жадібний | обчислює обидва операнди завжди, тому counterB став 1");
    }

    public static void Task29() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть години: ");
        int hours = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть хвилини: ");
        int minutes = scanner.nextInt();
        scanner.nextLine();
        boolean isValidTime = hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59;
        if (isValidTime) {
            String hh = (hours < 10) ? "0" + hours : "" + hours;
            String mm = (minutes < 10) ? "0" + minutes : "" + minutes;
            System.out.println("Час коректний: " + hh + ":" + mm);
        } else {
            System.out.println("Помилка: некоректний час!");
        }
        scanner.close();
    }

    public static void Task30() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть сторону a: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть сторону b: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть сторону c: ");
        int c = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Сторони: " + a + ", " + b + ", " + c + " -> Трикутник існує: " + ((a + b > c) && (a + c > b) && (b + c > a)));
        scanner.close();
    }

    public static void Task31() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        boolean isEvenBitwise = (n & 1) == 0;
        System.out.println("Перевірка через побітове І (n & 1) == 0: " + isEvenBitwise +
                "\nПеревірка через остачу n % 2 == 0: " + (n % 2 == 0) +
                "\nПобітове І фільтрує всі біти, крім молодшого, у парних чисел він 0, у непарних 1");
        scanner.close();
    }

    public static void Task32() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть пароль: ");
        int pin = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть суму зняття: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        boolean isPinCorrect = pin == 1234;
        boolean isCardActive = true;
        boolean hasSufficientBalance = 5000.0 >= amount;
        boolean isDailyLimitExceeded = amount > 20000.0;
        if (isPinCorrect && isCardActive && hasSufficientBalance && !isDailyLimitExceeded) {
            System.out.println("Транзакція дозволена!");
        } else {
            System.out.println("Транзакцію відхилено!");
        }
        scanner.close();
    }

    public static void Task33() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер дня (1-7): ");
        int day = scanner.nextInt();
        scanner.nextLine();
        switch (day) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Некоректний номер дня");
                break;
        }
        scanner.close();
    }

    public static void Task34() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер дня (1-7): ");
        int day = scanner.nextInt();
        scanner.nextLine();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будній (робочий) день");
                break;
            case 6:
            case 7:
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Некоректний номер дня");
                break;
        }
        scanner.close();
    }

    public static void Task35() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер місяця (1-12): ");
        int month = scanner.nextInt();
        scanner.nextLine();
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };
        if (days == 0) {
            System.out.println("Помилка: неіснуючий місяць!");
        } else {
            System.out.println("У місяці №" + month + " — " + days + " днів");
        }
        scanner.close();
    }

    public static void Task36() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть місяць: ");
        String month = scanner.nextLine().toLowerCase();
        String season = switch (month) {
            case "грудень", "січень", "лютий" -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень" -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default -> "Невідомий місяць";
        };
        System.out.println("Пора року: " + season);
        scanner.close();
    }

    public static void Task37() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Оберіть доставку (1 - Самовивіз, 2 - Кур'єр, 3 - Поштомат): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть вагу товару (кг): ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        int cost = switch (choice) {
            case 1 -> 0;
            case 2 -> {
                if (weight > 5) {
                    yield 150;
                } else {
                    yield 90;
                }
            }
            case 3 -> 60;
            default -> -1;
        };
        if (cost == -1) {
            System.out.println("Некоректний вибір!");
        } else {
            System.out.println("Вартість доставки: " + cost + " грн");
        }
        scanner.close();
    }

    public static void Task38() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число 1: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Оберіть операцію (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.print("Число 2: ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        if (op == '/' && b == 0) {
            System.out.println("Помилка: ділення на нуль неможливе!");
        } else {
            double result = switch (op) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> a / b;
                default -> Double.NaN;
            };
            if (Double.isNaN(result)) {
                System.out.println("Невідома операція!");
            } else {
                System.out.println("Результат: " + result);
            }
        }
        scanner.close();
    }

    public static void Task39() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть команду: ");
        String command = scanner.nextLine();
        System.out.println("Введіть команду: " + command.equalsIgnoreCase("start"));

        switch (command.toLowerCase()) {
            case "start" -> System.out.println("Система успішно запущена!");
            case "pause" -> System.out.println("Систему поставлено на паузу");
            case "stop" -> System.out.println("Систему зупинено");
            case "exit" -> System.out.println("Вихід із програми");
            default -> System.out.println("Невідома команда!");
        }
        scanner.close();
    }

    public static void Task40() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================ БАНКОМАТ ================");
        System.out.print("Введіть PIN: ");
        int pin = scanner.nextInt();
        scanner.nextLine();
        if (pin != 1234) {
            System.out.println("Невірний PIN! Доступ заборонено");
            scanner.close();
            return;
        }
        System.out.println("Авторизація успішна!");
        double balance = 5000.0;
        System.out.print("\nОберіть дію (1 - Баланс, 2 - Поповнення, 3 - Зняття, 4 - Вихід): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> System.out.println("Ваш баланс: " + balance + " грн");
            case 2 -> {
                System.out.print("Введіть суму поповнення: ");
                double deposit = scanner.nextDouble();
                scanner.nextLine();
                balance += deposit;
                System.out.println("Рахунок поповнено. Залишок на рахунку: " + balance + " грн");
            }
            case 3 -> {
                System.out.print("Введіть суму зняття: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                if (amount > 0 && amount <= balance) {
                    double commission = (amount > 1000) ? amount * 0.01 : 0.0;
                    balance -= amount + commission;
                    System.out.println("Комісія операції: " + commission + " грн" +
                            "\nВидано: " + amount + " грн. Залишок на рахунку: " + balance + " грн");
                } else {
                    System.out.println("Помилка: некоректна сума або недостатньо коштів!");
                }
            }
            case 4 -> System.out.println("Дякуємо, що скористалися нашим банкоматом!");
            default -> System.out.println("Некоректна дія!");
        }
        System.out.println("==========================================");
        scanner.close();
    }
}
