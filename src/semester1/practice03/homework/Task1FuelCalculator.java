package semester1.practice03.homework;

import java.util.Scanner;

public class Task1FuelCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== КАЛЬКУЛЯТОР ПОЇЗДКИ ТА ПАЛЬНОГО ===");
        System.out.print("Введіть відстань поїздки (км): ");
        double distance = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введіть середню витрату на 100 км (л): ");
        double fuelConsumption = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Оберіть тип пального (1 - А-95, 2 - Дизель, 3 - Газ): ");
        int fuelType = scanner.nextInt();
        scanner.nextLine();
        if (distance <= 0 || fuelConsumption <= 0) {
            System.out.println("Помилка: відстань та витрата пального мають бути більшими за нуль");
            scanner.close();
            return;
        }
        String fuelName = switch (fuelType) {
            case 1 -> "Бензин А-95";
            case 2 -> "Дизель";
            case 3 -> "Газ";
            default -> "";
        };
        double pricePerLiter = switch (fuelType) {
            case 1 -> 56.50;
            case 2 -> 52.80;
            case 3 -> 29.40;
            default -> -1;
        };
        if (pricePerLiter == -1) {
            System.out.println("Помилка: невідомий тип пального!");
            scanner.close();
            return;
        }
        double neededFuel = Math.round(((distance * fuelConsumption) / 100.0) * 100) / 100.0;
        double baseCost = Math.round((neededFuel * pricePerLiter) * 100) / 100.0;
        double finalCost = (baseCost >= 2000.0) ? baseCost * 0.95 : baseCost;
        System.out.println("\n---------------- ЗВІТ ПОЇЗДКИ ----------------" +
                "\nОбране пальне:               " + fuelName + " (" + pricePerLiter + " грн/л)" +
                "\nНеобхідно пального:          " + neededFuel + " л" +
                "\nБазова вартість:             " + baseCost + " грн" +
                "\nЗнижка АЗС (5%):             " + Math.round((baseCost - finalCost) * 100) / 100.0 + " грн" +
                "\n----------------------------------------------" +
                "\nПідсумкова сума до сплати:   " + Math.round(finalCost * 100) / 100.0 + " грн" +
                "\n==============================================");
        scanner.close();
    }
}
