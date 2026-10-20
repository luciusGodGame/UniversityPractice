package semester1.practice06;

import java.util.Scanner;

public class Practice06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Введіть завдання:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> task01();
                case 2 -> task02();
                case 3 -> task03();
                case 4 -> task04();
                case 5 -> task05();
                case 6 -> task06();
                case 7 -> task07();
                case 8 -> task08();
                case 9 -> task09();
                case 10 -> task10();
                case 11 -> task11();
                case 12 -> task12();
                case 13 -> task13();
                case 14 -> task14();
                case 15 -> task15();
                case 16 -> task16();
                case 17 -> task17();
                case 18 -> task18();
                case 19 -> task19();
                case 20 -> task20();
                case 21 -> task21();
                case 22 -> task22();
                case 23 -> task23();
                case 24 -> task24();
                case 25 -> task25();
                case 26 -> task26();
                case 27 -> task27();
                case 28 -> task28();
                case 29 -> task29();
                case 30 -> task30();
                case 31 -> task31();
                case 32 -> task32();
                case 33 -> task33();
                case 34 -> task34();
                case 35 -> task35();
                case 36 -> task36();
                case 37 -> task37();
                case 38 -> task38();
                case 39 -> task39();
                case 40 -> task40();
                case 0 -> System.out.println();
                default -> System.out.println("Шо?");
            }
        }
        scanner.close();
    }

    static void task01() {
        Student s1 = new Student();
        s1.name = "Денис";
        s1.age = 19;
        s1.gpa = 4.75;
        System.out.println(s1.name + ", " + s1.age + ", " + s1.gpa);
    }

    static void task02() {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2021;
        car1.speed = 100;
        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2023;
        car2.speed = 250;
        System.out.println(car1.brand + " " + car1.model + " " + car1.year + " " + car1.speed);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year + " " + car2.speed);
        if (car1.year > car2.year) {
            System.out.println(car1.model + " новіше");
        } else {
            System.out.println(car2.model + " новіше");
        }
    }

    static void task03() {
        Book emptyBook = new Book();
        System.out.println(emptyBook.title + " " + emptyBook.author + " " + emptyBook.pages + " " + emptyBook.isRead);
    }

    static void task04() {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 7.5;
        rectangle.height = 4.0;
        double area = rectangle.height * rectangle.width;
        double perimeter = (rectangle.height + rectangle.width) * 2;
        System.out.println(area + " " + perimeter);
    }

    static void task05() {
        Product product = new Product();
        product.name = "Монітор";
        product.price = 6500.0;
        product.quantity = 0;
        System.out.println(product.price * product.quantity);
    }

    static void task06() {
        Smartphone smartphone = new Smartphone();
        smartphone.model = "POCO";
        smartphone.batteryLevel = 100;
        smartphone.isTurnedOn = true;
        smartphone.batteryLevel += -35;
        smartphone.isTurnedOn = smartphone.batteryLevel >= 1;
        System.out.println(smartphone.model + " " + smartphone.batteryLevel + " " + smartphone.isTurnedOn);
    }

    static void task07() {
        Point2D a = new Point2D();
        Point2D b = new Point2D();
        a.x = 0;
        a.y = 0;
        b.x = 3;
        b.y = 4;
        System.out.println(Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2)));
    }

    static void task08() {
        Student first = new Student();
        first.name = "Іван";
        Student second = first;
        second.name = "Петро";
        System.out.println(first.name);
        //Виведе Іван, ну бо коли ми створювали second, ми робили не новий об'єкт, рівний first, а посилання на first
    }

    static void task09() {
        Greeter greeter = new Greeter();
        greeter.SayHello();
        greeter.SayHelloTo("Люциус");
    }

    static void task10() {
        Animal cat = new Animal();
        Animal dog = new Animal();
        cat.makeSound();
        dog.makeSound();
        cat.printInfo();
        dog.printInfo();
    }

    static void task11() {
        Counter counter = new Counter();
        for (int i = 0; i < 3; i++) {
            counter.increment();
        }
        counter.decrement();
        counter.printCount();
    }

    static void task12() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.changeColor("Червоний");
        trafficLight.showSignal();
        trafficLight.changeColor("Жовтий");
        trafficLight.showSignal();
        trafficLight.changeColor("Зелений");
        trafficLight.showSignal();
    }

    static void task13() {
        Player player = new Player();
        player.takeDamage(10);
        player.heal(5);
        player.takeDamage(115);
    }

    static void task14() {
        Lamp lamp = new Lamp();
        lamp.status();
        lamp.toggle();
        lamp.status();
        lamp.toggle();
        lamp.status();
    }

    static void task15() {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.displayTime();
        stopwatch.addSeconds(1984);
        stopwatch.displayTime();
    }

    static void task16() {
        Printer printer = new Printer();
        printer.paperCount = 10;
        printer.printDocument("blablabla", 7);
        printer.printDocument("blabla", 5);
    }

    static void task17() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int a = 10;
        int b = 5;
        int numbersAdd = simpleCalculator.add(a, b);
        int numbersSubtract = simpleCalculator.subtrack(a, b);
        int numbersMultiply = simpleCalculator.multiply(a, b);
        double numbersDivide = simpleCalculator.divide(a, b);
        System.out.println(numbersAdd + " " + numbersSubtract + " " + numbersMultiply + " " + numbersDivide);
    }

    static void task18() {
        Circle circle = new Circle();
        circle.radius = 5.0;
        System.out.println(circle.getArea() + " " + circle.getCircumference());
    }

    static void task19() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double inFahrenheit = temperatureConverter.celsiusToFahrenheit((25));
        System.out.println(temperatureConverter.fahrenheitToCelsius(inFahrenheit));
    }

    static void task20() {
        NumbersChecker numbersChecker = new NumbersChecker();
        System.out.println(numbersChecker.isEven(7) + " " + numbersChecker.isPositive(12) + " " + numbersChecker.isPrime(-5));
    }

    static void task21() {
        CurrencyExchange currencyExchange = new CurrencyExchange();
        System.out.printf("%.2f", currencyExchange.toUSD(10000));
    }

    static void task22() {
        Employee employee = new Employee();
        employee.baseSalary = 30000;
        employee.bonusPercentage = 15;
        System.out.println(employee.calculateTax());
    }

    static void task23() {
        TextFormatter textFormatter = new TextFormatter();
        System.out.println(textFormatter.formatTitle("слава тп" + " " + textFormatter.countVowels("СЛАВА ТП")));
    }

    static void task24() {
        Triangle triangle = new Triangle();
        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;
        System.out.println(triangle.getArea());
    }

    static void task25() {
        SecretVault vault = new SecretVault();
        // vault.secretCode = "hacked"; 'secretCode' has private access in 'semester1.practice06.SecretVault'
        System.out.println(vault.verifyCode("бубубу, поставили тут всякого захисту"));
    }

    static void task26() {
        UserAccount userAccount = new UserAccount();
        userAccount.setCredentials("admin", "admin");
        userAccount.changePassword("admin", "hacked");
    }

    static void task27() {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(100);
        System.out.println(bankAccount.withdraw(120));
    }

    static void task28() {
        Thermometer thermometer = new Thermometer();
        thermometer.setTemperature(88);
        System.out.println(thermometer.getTemperature());
    }

    static void task29() {
        CarSpeedometer carSpeedometer = new CarSpeedometer();
        carSpeedometer.accelerate(250);
        System.out.println(carSpeedometer.getSpeed());
        carSpeedometer.brake(250);
        System.out.println(carSpeedometer.getSpeed());
    }

    static void task30() {
        Person alex = new Person();
        Person nick = new Person();
        alex.setName("Alex");
        alex.setAge(20);
        nick.setName("Nicholas");
        nick.setAge(18);
        alex.printSummary();
        nick.printSummary();
    }

    static void task31() {
        DiscountCard card = new DiscountCard("Я");
        card.printCardInfo();
        card.addPurchase(3000);
        card.printCardInfo();
        card.addPurchase(4000);
        card.printCardInfo();
    }

    static void task32() {
        SmartDoorLock lock = new SmartDoorLock();
        lock.enterPin(0000);
        lock.enterPin(0001);
        lock.enterPin(0002);
        lock.enterPin(0003);
    }

    static void task33() {
        GradeBook gradeBook = new GradeBook();
        gradeBook.setData("ЛГГ", new int[]{85, 92, 78, 96, 65});
        System.out.println(gradeBook.getAverage() + " " + gradeBook.getHighestGrade() + " " + gradeBook.getLowestGrade());
    }

    static void task34() {
        ArraysStats stats = new ArraysStats();
        stats.setNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("Парних: " + stats.countEvens());
        System.out.println("Непарних: " + stats.countOdds());
        System.out.println("Сума: " + stats.calculateSum());
    }

    static void task35() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(250.0);
        cart.addItem(480.0);
        cart.addItem(130.0);
        cart.printReceipt();
        cart.applyDiscount(15);
        System.out.println("Після знижки 15%:");
        cart.printReceipt();
    }

    static void task36() {
        TemperatureTracker tracker = new TemperatureTracker();
        tracker.setTemps(new double[]{18.5, 21.0, 25.3, 28.7, 22.1, 19.4, 17.8});
        System.out.println("Днів вище 20°C: " + tracker.countDaysAbove(20));
        tracker.printWeeklyReport();
    }

    static void task37() {
        ArraySearcher searcher = new ArraySearcher();
        searcher.setData(new int[]{10, 25, 3, 47, 8, 92, 56});
        System.out.println("Містить 47: " + searcher.contains(47));
        System.out.println("Індекс 47: " + searcher.findIndex(47));
        System.out.println("Містить 100: " + searcher.contains(100));
        System.out.println("Індекс 100: " + searcher.findIndex(100));
    }

    static void task38() {
        Vector3D vec = new Vector3D();
        vec.setCoords(2, 3, 6);
        System.out.println("Довжина: " + vec.getMagnitude());
        vec.multiplyByScalar(2);
        vec.printVector();
    }

    static void task39() {
        Matrix2D matrix = new Matrix2D();
        matrix.setGrid(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        matrix.printMatrix();
        System.out.println("Сума всіх: " + matrix.getTotalSum());
        System.out.println("Сума рядка 1: " + matrix.getRowSum(1));
    }

    static void task40() {
        MatrixDiagonals md = new MatrixDiagonals();
        md.setMatrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        System.out.println("Головна діагональ: " + md.getMainDiagonalSum());
        System.out.println("Побічна діагональ: " + md.getAntiDiagonalSum());
        System.out.println("Симетричні: " + md.isDiagonalSymmetric());
    }

}
