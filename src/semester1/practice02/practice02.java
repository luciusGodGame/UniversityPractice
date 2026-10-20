package semester1.practice02;

public class practice02 {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Завдання номер 1");
        int age = 1;
        double height = 1.78;
        char firstLetter = 'О';
        boolean isStudent = true;
        System.out.println(age + "\n" + height + "\n" + firstLetter + "\n" + isStudent);

        // Task 2
        System.out.println("Завдання номер 2");
        byte temperature = -15;
        short currentYear = 2026;
        int cityPopulation = 1200_000;
        long worldPopulation = 8_100_000_000L;
        System.out.println(temperature + "\n" + currentYear + "\n" + cityPopulation + "\n" + worldPopulation);

        // Task 3
        System.out.println("Завдання номер 3");
        float floatValue = 1.1234567f;
        double doubleValue = 1.123456789012345;
        System.out.println(floatValue + "\n" + doubleValue);

        // Task 4
        System.out.println("Завдання номер 4");
        char symbol1 = 'J';
        char symbol2 = 74;
        char symbol3 = '\u004A';
        System.out.println(symbol1 + " " + symbol2 + " " + symbol3);

        // Task 5
        System.out.println("Завдання номер 5");
        boolean isJavaFun = true;
        boolean isFishFly = false;
        boolean isSkyBlue = true;
        System.out.println(isJavaFun + "\n" + isFishFly + "\n" + isSkyBlue);

        // Task 6
        System.out.println("Завдання номер 6");
        final double GRAVITY = 9.81;
        final int DAYS_IN_WEEK = 7;
        final String UNIVERSITY_NAME = "Львівська Політехніка";
        System.out.println(GRAVITY + "\n" + DAYS_IN_WEEK + "\n" + UNIVERSITY_NAME);
        // GRAVITY = 10.0;
        // D:

        // Task 7
        System.out.println("Завдання номер 7");
        int intVal = 250;
        double doubleVal = intVal;
        System.out.println(intVal + " " + doubleVal);

        // Task 8
        System.out.println("Завдання номер 8");
        double priceWithPennies = 49.99;
        int roundedPrice = (int) priceWithPennies;
        System.out.println(roundedPrice);

        // Task 9
        System.out.println("Завдання номер 9");
        int number0 = 5;
        double userWeight = 72.5;
        String userCity = "Kyiv";
        boolean isValidUser = true;
        System.out.println(number0 + ", " + userWeight + ", " + userCity + ", " + isValidUser);


        // Task 10
        System.out.println("Завдання номер 10");
        String firstName = "Тарас";
        String LastName = "Шевченко";
        int ageBrif = 47;
        System.out.println("Мене звати " + firstName + " " + LastName + ". Мені " + ageBrif + " років.");

        // Task 11
        System.out.println("Завдання номер 11");
        int firstNumber = 10;
        int secondNumber = 20;
        System.out.println("Сума без дужок: " + firstNumber + secondNumber);
        System.out.println("Сума з дужками: " + (firstNumber + secondNumber));
        // в першому рядку компілятор використовує склеювання(або розумним терміном, конкатенацію),
        // намагаючись зробити з тексту й цифри текст, потім повторивши це з другим інтом

        // в другому рядку компілятор використовує додавання, через те що йому не треба склеювати текст з цифрами,
        // він може спочатку додати цифри, а потім склеїти їх з текстом

        // Task 12
        System.out.println("Завдання номер 12");
        String login = "ivan.petrenko";
        String domain = "gmail.com";
        String role = "student";
        System.out.println("Користувач " + login + " (роль: " + role + ") має пошту: " + login + "@" + domain);

        // Task 13
        System.out.println("Завдання номер 13");
        String productName = "Ноутбук";
        int quantity = 2;
        double pricePerUnit = 24500.50;
        System.out.println("ЧЕК:" +
                "\nТовар: " + productName +
                "\nКількість: " + quantity + "шт." +
                "\nЦіна: " + pricePerUnit + "грн");

        // Task 14
        System.out.println("Завдання номер 14");
        String currency = "UAH";
        int hryvnias = 1500;
        int kopecks = 75;
        System.out.println("Поточний баланс: " + hryvnias + "." + kopecks + " " + currency);

        // Task 15
        System.out.println("Завдання номер 15");
        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;
        String siteAdress = protocol + host + endpoint + "/" + userId;
        System.out.println("Запит відправлено на: " + siteAdress);

        // Task 16
        System.out.println("Завдання номер 16");
        String language = "Java";
        int level = 1;
        boolean isReady = true;
        System.out.println("Мова: " + language + " | Рівень: " + level + " | Готовність до практики: " + isReady);

        // Task 17
        System.out.println("Завдання номер 17");
        int number = 19;
        int remainder = number % 2;
        System.out.println("Число " + number + " при діленні на 2 дає остачу: " + remainder);

        // Task 18
        System.out.println("Завдання номер 18");
        int totalSeconds = 385;
        int totalMinutes = totalSeconds / 60;
        int remainderSeconds = totalSeconds % 60;
        System.out.println(totalSeconds + " секунд = " + totalMinutes + " хв " + remainderSeconds + " сек");

        // Task 19
        System.out.println("Завдання номер 19");
        int n = 47;
        int number6 = n / 10;
        int number5 = n % 10;
        System.out.println("Число; " + n + ". Десятки: " + number6 + ", Одиниці: " + number5 + ". Сума цифр: " + (number6 + number5));

        // Task 20
        System.out.println("Завдання номер 20");
        int score = 100;
        score += 50;
        System.out.println("Після додавання: " + score);
        score -= 20;
        System.out.println("Після віднімання: " + score);
        score *= 2;
        System.out.println("Після множення: " + score);
        score /= 4;
        System.out.println("Після ділення: " + score);

        // Task 21
        System.out.println("Завдання номер 21");
        int counter = 5;
        System.out.println(counter++);
        System.out.println(counter);
        // В рядочку 144 там ++ стоїть після зміної, що значить, що після виконання цього рядочку, зміна збільшиться на один

        // Task 22
        System.out.println("Завдання номер 22");
        counter = 5;
        System.out.println(++counter);
        // На відміну від минулого завдання, число збільшилося до того, як виконатися, тому що ++ стоїть перед зміною.

        // Task 23
        System.out.println("Завдання номер 23");
        int grade1 = 4;
        int grade2 = 5;
        int grade3 = 4;
        double averageGrade = (grade1 + grade2 + grade3) / 3.0;
        System.out.println(averageGrade);

        // Task 24
        System.out.println("Завдання номер 24");
        double celsius = 25.0;
        double farangeits = celsius * 1.8 + 32;
        double kelvins = celsius + 273.15;
        System.out.println("Фарангейти: " + farangeits +
                "\nКельвіни: " + kelvins);

        // Task 25
        System.out.println("Завдання номер 25");
        int userAge = 17;
        boolean isAdult = userAge >= 18;
        System.out.println("Вік: " + userAge + ". Чи є повнолітнім: " + isAdult);

        // Task 26
        System.out.println("Завдання номер 26");
        int x = 15;
        int y = 20;
        System.out.println("x == y: " + (x == y) +
                "\nx != y: " + (x != y) +
                "\nx > y: " + (x > y));

        // Task 27
        System.out.println("Завдання номер 27");
        int speed = 75;
        boolean isSafeSpeed = ((speed >= 20) && (speed <= 80));
        System.out.println(isSafeSpeed);

        // Task 28
        System.out.println("Завдання номер 28");
        int personAge = 70;
        boolean hasFreePass = ((personAge < 7) || (personAge >= 65));
        System.out.println("Вік: " + personAge + ". Право на безкоштовний проїзд: " + hasFreePass);

        // Task 29
        System.out.println("Завдання номер 29");
        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;
        System.out.println("Двері зачинені:" + isDoorLocked +
                "\nЧи можна увійти: " + canEnter);

        // Task 30
        System.out.println("Завдання номер 30");
        int numberToDevisibily = 30;
        boolean isDevisiblebyBoth = (numberToDevisibily % 3 == 0) && (numberToDevisibily % 5 == 0);
        System.out.println(isDevisiblebyBoth);

        // Task 31
        System.out.println("Завдання номер 31");
        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;
        System.out.println("Чи дозволено доступ: " + canLogin);

        // Task 32
        System.out.println("Завдання номер 32");
        int year = 2026;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeapYear);

        // Task 33
        System.out.println("Завдання номер 33");
        double a = 3.0;
        double b = 4.0;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Катети: " + a + " та " + b + ". Гіпотенуза: " + c);

        // Task 34
        System.out.println("Завдання номер 34");
        double radius = 5.0;
        double l = 2 * Math.PI * radius;
        double s = Math.PI * Math.pow(radius, 2);
        System.out.println("Радіус: " + radius +
                "\nДовжина кола: " + l +
                "\nПлоща круга: " + s);

        // Task 35
        System.out.println("Завдання номер 35");
        double dayTemp = 18.5;
        double nightTemp = -3.2;
        System.out.println("Модуль різниці(перепад температури): " + Math.abs(dayTemp - nightTemp) +
                "\nМаксимальна температура: " + Math.max(dayTemp, nightTemp) +
                "\nМінімальна температура: " + Math.min(dayTemp, nightTemp));

        // Task 36
        System.out.println("Завдання номер 36");
        double num = 5.67;
        System.out.println(Math.round(num) + " " + Math.ceil(num) + " " + Math.floor(num));

        // Task 37
        System.out.println("Завдання номер 37");
        double number1 = 1.0;
        double number2 = -7.0;
        double number3 = 10.0;
        double discriminant = Math.pow(number2, 2) - 4 * number1 * number3;
        double x1 = (-number2 + Math.sqrt(discriminant)) / (2 * number1);
        double x2 = (-number2 - Math.sqrt(discriminant)) / (2 * number1);
        System.out.println("Дискриминант: " + discriminant +
                "\nКорінь х1 = " + x1 +
                "\nКорінь x2 = " + x2);

        // Task 38
        System.out.println("Завдання номер 38");
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Випало на кубику: " + dice);

        // Task 39
        System.out.println("Завдання номер 39");
        int min = -10;
        int max = 35;
        int randomTemp = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Погода на завтра: " + randomTemp + "C");

        // Task 40
        System.out.println("Завдання номер 40");
        double firstDeposit = 10000;
        double rate = 0.12; // 1 = 100%, 0.12 = 12%
        int time = 3;
        double finalSum = firstDeposit * Math.pow((1 + rate), time);
        System.out.printf("+------------------------------------+" +
                "\n|     ДЕПОЗИТНИЙ КАЛЬКУЛЯТОР        |" +
                "\n+------------------------------------+" +
                "\nПочаткова сума: %.0f грн" +
                "\nТермін: %d роки під %.0f%% річних" +
                "\nПідсумкова сума: %.2f грн" +
                "\nЧистий прибуток: %.2f грн" +
                "\n+------------------------------------+", firstDeposit, time, rate * 100, finalSum, finalSum - firstDeposit);
    }
}