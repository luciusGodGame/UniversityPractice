package semester1.practice06.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5AnimeHeroBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Asta asta = new Asta();
        VeryEvilEnemy ricardo = new VeryEvilEnemy();
        int roundNumber = 1;
        boolean isTheEnd = false;
        boolean actionUsed = false;
        System.out.println("================ ЛЮКСОВА ПЕРУКАРНЯ ================");
        System.out.println("Перед входом зявився " + ricardo.getName() + ", схоже живим повернеться лише один");
        while (!isTheEnd) {
            while (true) {
                System.out.println("\n--- Раунд" + roundNumber + " ---");
                System.out.print("""
                        Оберіть дію Асти:
                        [1] Удар мечем Демоноборця (+20 енергії)
                        [2] Застосувати комбо-навички
                        Ваш вибір:
                        """);
                int choice;
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    scanner.nextLine();
                    System.out.print("Неправильний ввід, спробуйте знову \n");
                    continue;
                }
                switch (choice) {
                    case 1: {
                        ricardo.takeDamage(asta.basicSwordAttack());
                        actionUsed = true;
                        scanner.nextLine();
                        break;
                    }
                    case 2: {
                        int input = chooseCombo(scanner);
                        if (input < 4) {
                            ricardo.takeDamage(asta.useSkill(input));
                            actionUsed = true;
                        }
                        break;
                    }
                    default: {
                        scanner.nextLine();
                        System.out.print("Неправильний ввід, спробуйте знову \n");
                    }
                }
                if (actionUsed) {
                    actionUsed = false;
                    roundNumber++;
                    if (ricardo.isAlive()) {
                        asta.takeDamage(ricardo.attacking());
                    }
                    asta.showStatus();
                    System.out.println("[СТАТУС]" + ricardo.getName() + ": " + ricardo.showHp());
                    System.out.println("================================================");
                    if (!asta.isAlive() || !ricardo.isAlive()) {
                        isTheEnd = true;
                        break;
                    }
                }
            }
        }
        if (!asta.isAlive()) {
            System.out.println(asta.getName() + " схоплюється й падає безсило, його очі мертві й неживі..");
        }
        if (!ricardo.isAlive()) {
            System.out.println(ricardo.getName() + " схоплюється й падає безсило, його очі мертві й неживі..");
        }
    }

    private static int chooseCombo(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("""
                    Оберіть комбо:
                    [1] Удар демоноборця (25 енергії)
                    [2] Чорний Ураган (50 енергії)
                    [3] Метеорит Демона (75 енергії)
                    [4] Форма Чорного дракона (100 енергії)
                    [5] Назад
                    Ваш вибір:""");
            int input;
            try {
                input = scanner.nextInt() - 1;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();
            if ((input >= 0) && (input < 5)) {
                return input;
            }
        }
    }
}
