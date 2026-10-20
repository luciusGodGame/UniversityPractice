package semester1.practice01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Введіть завдання:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 5 -> task5();
                case 6 -> task6();
                case 7 -> task7();
                case 8 -> task8();
                case 9 -> task9();
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

    public static void task1(){
        System.out.println("Hello, Word!");
    }

    public static void task2(){
        System.out.println("Привіт, мене звати Люциус, і я починаю вивчати Java!");
    }

    public static void task3(){
        System.out.println("Порядок у коді - порядок у думках.");
    }

    public static void task4(){
        System.out.println("Студент: Люциус");
        System.out.println("Група: ******");
        System.out.println("Спеціальність: Комп'ютерні науки");
    }

    public static void task5(){
        System.out.println("Початок програми.\n\nКінець програми.");
    }

    public static void task6(){
        System.out.println("Звіт про виконання роботи\n\n-------------------------");
    }

    public static void task7(){
        System.out.println("******\n*JAVA*\n******");
    }

    public static void task8(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }

    public static void task9(){
        System.out.print("Java - ");
        System.out.print("це об'єктно-орієнтовна ");
        System.out.print("мова програмування.");
    }

    public static void task10(){
        System.out.print("Вчитися,");
        System.out.print("розбиратися,");
        System.out.print("практикуватися,");
        System.out.println("перемагати!");
    }

    public static void task11(){
        System.out.print("Сьогодні");
        System.out.print(" чудовий день");
        System.out.println("для програмування.");
        System.out.println("Завтра буде ще кращий!");
    }

    public static void task12(){
        System.out.print("3...");
        System.out.print("2...");
        System.out.print("1...");
        System.out.print("Старт!");
    }

    public static void task13(){
        System.out.print("[ID]");
        System.out.print("[Ім'я]");
        System.out.print("[Статус]");
    }

    public static void task14(){
        System.out.println("Завантаження: [=====>    ] 50%");
    }
    public static void task15(){
        System.out.print("[x] Встановити JDK та IntelliJ IDEA");
        System.out.println("[ ] розв'язати 40 завдань практики");
    }

    public static void task16(){
        System.out.print("Місто: Київ |");
        System.out.print("Тел: +380000000000 |");
        System.out.print("Email: student@univ.edu");
    }

    public static void task17(){
        System.out.println("Україна\nмісто Львів\nвулиця Степана Бандери, 12");
    }
    public static void task18(){
        System.out.println("\n" +
                "Реве та стогне Дніпр широкий,\n" +
                "Сердитий вітер завива,\n" +
                "Додолу верби гне високі,\n" +
                "Горами хвилю підійма.");
    }

    public static void task19(){
        System.out.println("№\tТовар\tКількість\tЦіна\n" +
                "1\tЗошит\t3\t\t45 грн\n" +
                "2\tРучка\t2\t\t30 грн");
    }

    public static void task20(){
        System.out.println("Пара\tЧас\t\tПредмет\n" +
                "1\t08:30\t\tВища математика\n" +
                "2\t10:10\t\tОснови програмування\n" +
                "3\t11:50\t\tАнглійська мова");
    }

    public static void task21(){
        System.out.println("Сократ сказав: \"Я знаю тільки те, що я нічого не знаю\".");
    }
    public static void task22(){
        System.out.println("Мій улюблений фантастичний фільм — \"Інтерстеллар\" режисера Крістофера Нолана.");
    }

    public static void task23(){
        System.out.println("C:\\Users\\Student\\Desktop\\JavaProjects\\Practice01\\Main.java");
    }

    public static void task24(){
        System.out.println("Java\n" +
                "\tце\n" +
                "\t\tпросто\n" +
                "\t\t\tта\n" +
                "\t\t\t\tпотужно!");
    }

    public static void task25(){
        System.out.println(100);
        System.out.println(-45);
        System.out.println(0);
        System.out.println(3.14159);
    }

    public static void task26(){
        System.out.print("15 + 28 = ");
        System.out.println(15 + 28);
    }

    public static void task27(){
        System.out.println("Мій приблизний вік:");
        System.out.println(2026-2008);
    }

    public static void task28(){
        System.out.println("Кількість секунд у добі:");
        System.out.println(24 * 60 * 60);
    }

    public static void task29(){
        System.out.println("20 / 6 у цілих числах дорівнює:");
        System.out.println(20 / 6);
    }

    public static void task30(){
        System.out.println("20.0 / 6.0 у дійсних числах дорівнює:");
        System.out.println(20.0 / 6.0);
    }

    public static void task31(){
        System.out.println("Результат виразу (10 + 5) * 4 - 20 / 2:\n");
        System.out.println((10 + 5) * 4 - 20 / 2);
    }

    public static void task32(){
        System.out.println("Периметр кімнати (м)");
        System.out.println((6 + 4) * 2);
        System.out.println("Площа кімнати (кв. м)");
        System.out.println(6 * 4);
    }

    public static void task33(){
        System.out.println("*****\n*****\n*****");
    }

    public static void task34(){
        System.out.println("*****\n*   *\n*   *\n*****");
    }

    public static void task35(){
        System.out.println("#\n##\n###\n####\n#####");
    }

    public static void task36(){
        System.out.println("  [o_o]\n" +
                " /|   |\\\n" +
                "  d   b");
    }

    public static void task37(){
        System.out.println("   *\n" +
                "  ***\n" +
                " *****\n" +
                "*******\n" +
                "  |||");
    }

    public static void task38(){
        System.out.println("   /\\\n" +
                "  /  \\\n" +
                " /____\\\n" +
                " | [] |\n" +
                " |____|");
    }

    public static void task39(){
        System.out.println(
                  "  ** " +
                "\n *  *" +
                "\n  ***" +
                "\n *  *" +
                "\n*   *");
    }

    public static void task40(){
        System.out.println("+------------------------------------+\n" +
                "|          IT-STORE ЧЕК              |\n" +
                "+------------------------------------+\n" +
                "| Товар\t\tК-сть\tЦіна         |\n" +
                "| Флешка 64GB\t2\t150 грн      |\n" +
                "| Мишка USB\t1\t400 грн      |\n" +
                "+------------------------------------+\n" +
                "| Разом до сплати (грн):             |\n" +
                "| ");
        System.out.print(2 * 150 + 1 * 400);
        System.out.println("                                |\n" +
                "+------------------------------------+\n" +
                "|      Дякуємо за покупку!           |\n" +
                "+------------------------------------+");
    }
}
