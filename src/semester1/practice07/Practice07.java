package semester1.practice07;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер завдання (1-40): ");
        int task = scanner.nextInt();
        scanner.nextLine();

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
        }
        scanner.close();
    }

    public static void Task1() {
        Book defaultBook = new Book();
        Book originalBook = new Book("Назва", "Автор", 1984, 14.0);
        defaultBook.printInfo();
        originalBook.printInfo();
    }

    public static void Task2() {
        Student student = new Student("Люциус", 99, 444);
        Student student1 = new Student("Люциус", 17, 3.4);
        student.printStudent();
        student1.printStudent();
    }

    public static void Task3() {
        BankAccount card = new BankAccount("12341234", "Люциус", 4.0);
        card.deposit(444);
        card.withdraw(500);
    }

    public static void Task4() {
        Point2D point1 = new Point2D();
        Point2D point2 = new Point2D(4.0, 9.0);
        System.out.println(point2.distanceTo(3.0, 1.0));
        System.out.println(point1.distanceToOrigin());
    }

    public static void Task5() {
        Product phone = new Product("Телефон", 1400.0, 91, "Електроніка");
        phone.printProduct();
        phone.applyDiscount(20);
        phone.printProduct();
    }

    public static void Task6() {
        Time time = new Time(23, 59, 59);
        time.tick();
        time.toStandartString();
    }

    public static void Task7() {
        Rectangle rectangle = new Rectangle(4, 5);
        Rectangle square = new Rectangle(3);
        System.out.println(rectangle.getArea() == square.getArea());
        System.out.println(rectangle.getPerimeter() == square.getPerimeter());
    }

    public static void Task8() {
        Employee employee = new Employee(1234, "Няняня", "Тактичний кіт", 1);
        employee.raiseSalary(15);
        employee.printBadge();
    }

    public static void Task9() {
        User user = new User();
        user.printProfile();
    }

    public static void Task10() {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction(1);
        Fraction fraction3 = new Fraction(4, 10);
        fraction1.print();
        fraction2.print();
        fraction3.print();
    }

    public static void Task11() {
        Car car = new Car();
        car.startEngine();
        car.drive(150);
    }

    public static void Task12() {
        SmartBulb bulb = new SmartBulb(1, 1, true);
        SmartBulb bulb1 = new SmartBulb(200);
        SmartBulb bulb2 = new SmartBulb();
        bulb.printStatus();
        bulb1.printStatus();
        bulb2.printStatus();
    }

    public static void Task13() {
        String sql = new QueryBuilder("users").select("id, name, email").where("age >= 18").build();
    }

    public static void Task14() {
        CoffeOrder coffeOrder = new CoffeOrder("Лате");
        coffeOrder.printReceipt();
    }

    public static void Task15() {
        Box box = new Box(4, "Дерево");
        Box clone = new Box(box);
        box.printBox();
        clone.printBox();
    }

    public static void Task16() {
        FlightTicket ticket = new FlightTicket("1234", "Люциус", "1234", "Житомир", "Житомир");
    }

    public static void Task17() {
        int a1 = 4;
        int b1 = 6;
        double a2 = 9.0;
        double b2 = 10.0;
        String text1 = "AAA";
        String text2 = "BBBB";
        MathOperations math = new MathOperations();
        math.add(a1, b1);
        math.add(a2, b2);
        math.add(a1, b1, a1);
        math.add(text1, text2);
        math.multiply(a1, b1);
        math.multiply(a2, b2);
        math.multiply(text1, a1);
    }

    public static void Task18() {
        DocumentPrinter printer = new DocumentPrinter();
        printer.print(123);
        printer.print("Ла ла ла ла");
        printer.print(Math.PI, 2);
        printer.print(new String[]{"Ла", "Ла ла", "Ла ла ла", "Ла ла ла ла"});
        printer.print("Лалалала", true);
    }

    public static void Task19() {
        AreaCalculator calc = new AreaCalculator();
        calc.calculateArea(12);
        calc.calculateArea(12, 12);
        calc.calculateArea(12, true);
        calc.calculateAreaTriangle(12, 12, 12);
        calc.calculateArea(12, 12, 12);
    }

    public static void Task20() {
        Logger logger = new Logger();
        logger.log("Кінець програми");
        logger.log("ERROR", "Кінець програми");
        logger.log("ERROR", 0, "Кінець програми");
        logger.log("[ERROR]", "Кінець програми", true);
    }

    public static void Task21() {
        int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] arrString = {"Лалала", "Няняня", "Мямямя"};
        ArraySearcher searcher = new ArraySearcher();
        searcher.find(arrInt, 5);
        searcher.find(arrInt, 5, 5);
        searcher.find(arrString, "бебебе");
        searcher.find(arrString, "лалала", true);
    }

    public static void Task22() {
        DataService data = new DataService(0, 0, 0);
        data.add(15, 3, 2024);
        data.printDate();
        data.add(20);
        data.printDate();
        data.add(0, 3);
    }

    public static void Task23() {
        SalaryCalculator calc = new SalaryCalculator();
        calc.calculate(10000);
        calc.calculate(10000, 1000);
        calc.calculate(10000, 10, true);
        calc.calculate(1000, 5, 250);
    }

    public static void Task24() {
        int[] arr = new int[]{12, 5, 8, 19, 24, 3, 14};
        ArrayFilter filter = new ArrayFilter();
        filter.filter(arr, 5);
        filter.filter(arr, 3, 10);
        filter.filter(arr, true);
    }

    public static void Task25() {
        UserAccount user = new UserAccount("User", "User");
        UserAccount user1 = new UserAccount("Admin", "Admin");
        UserAccount user2 = new UserAccount("SuperUser", "SuperUser");
        user.getId();
        user1.getId();
        user2.getId();
    }

    public static void Task26() {
        for (int i = 0; i < 6; i++) {
            System.out.println(ServerConfig.connect());
        }
    }

    public static void Task27() {
        MathUtils.factorial(14);
        MathUtils.power(4, -2);
        MathUtils.gcd(20, 10);
        MathUtils.clamp(11, 10, 20);
    }

    public static void Task28() {
        System.out.println(CurrencyExchange.eurToUah(100));
        CurrencyExchange.updateRates(19.0, 19.0);
        System.out.println(CurrencyExchange.eurToUah(100));
    }

    public static void Task29() {
        FleetCar car1 = new FleetCar("123", 1.1);
        FleetCar car2 = new FleetCar("124", 1.5);
        FleetCar car3 = new FleetCar("125", 2.0);
        car1.addTrip(10);
        car2.addTrip(16);
        car3.addTrip(7);
        FleetCar.printFleetSummary();
    }

    public static void Task30() {
        StringUtils.isPalandrome("qwertyytrewq");
        StringUtils.reverse("Aboba");
        StringUtils.countVowels("qwertyuiopasdfghjklzxcvbnm");
        StringUtils.maskCardNumber("123412341234");
    }

    public static void Task31() {
        GameSession game1 = GameSession.createSession("Хрін");
        GameSession game2 = GameSession.createSession("Хрін");
        GameSession game3 = GameSession.createSession("Хрін");
        GameSession game4 = GameSession.createSession("Хрін");
        System.out.println(game4 == null ? "Сервер 4 не існує" : "Сервер 4 існує");
    }

    public static void Task32() {
        PhysicsEngine.restEnergy(0.001);
        PhysicsEngine.freeFallDistance(5.0);
    }

    public static void Task33() {
        LineSegment line = new LineSegment(1.0, 5.0, 3.0, 7.0);
        line.printSegment();
    }

    public static void Task34() {
        ClientAccount ivan = new ClientAccount("1234", "Іван", 10000);
        ClientAccount maria = new ClientAccount("0000", "Марія", 2000);
        ivan.transfetTo(maria, 3500);
        ivan.printAccount();
        maria.printAccount();
    }

    public static void Task35() {
        CarWithEngine car = new CarWithEngine("Мерседес", "Бенс", new Engine("1234", 100, false));
        car.startCar();
        car.turnOff();
        car.printSpecs();
    }

    public static void Task36() {
        Computer computer = new Computer("Картопля",
                new Processor("Варена картопелька", 1, 4),
                new Memory(4, 10, 10),
                1);
        computer.updateMemory(new Memory(32, 4800, 99999));
        computer.printSpecs();
    }

    public static void Task37() {
        Hero hero = new Hero("Герой", 100, 10, 5);
        Hero antiHero = new Hero("Антигерой", 100, 10, 5);
        while (hero.isAlive() && antiHero.isAlive()) {
            hero.attack(antiHero);
            antiHero.attack(hero);
        }
        if (!hero.isAlive()) {
            System.out.println(hero.getName() + " падає на підлогу. Його очі мертві й неживі.");
        }
        if (!antiHero.isAlive()) {
            System.out.println(antiHero.getName() + " падає на підлогую Його очі мертві й неживі");
        }
        System.out.println("Переможцем став: " + (hero.isAlive() ? hero.getName() : antiHero.isAlive() ? antiHero.getName() : "ніхто"));
    }

    public static void Task38() {
        Order order = new Order(new Customer("Покупець", 100));
        order.addProduct(new OrderProduct(123, "Яблуко", 60));
        order.checkout();
        order.checkout();
    }

    public static void Task39() {
        Vector3D vector1 = new Vector3D(1, 0, 0);
        Vector3D vector2 = new Vector3D(0, 1, 0);
        vector1.add(vector2);
        vector1.dotProduct(vector2);
        vector1.isOrthogonalTo(vector2);
    }

    public static void Task40() {
        LibraryCatalog libraryOfRuina = new LibraryCatalog(5);
        libraryOfRuina.addBook(new BookItem("0", "Книжка Роланда", "Бібліотека"));
        libraryOfRuina.addBook(new BookItem("1", "Книжка Данте", "Бібліотека"));
        libraryOfRuina.addBook(new BookItem("2", "Книжка Ксяо", "Бібліотека"));
        libraryOfRuina.borrowBook("Книжка Роланда");
        libraryOfRuina.borrowBook("Книжка Роланда");
    }
}
