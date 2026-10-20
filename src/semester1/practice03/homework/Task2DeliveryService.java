package semester1.practice03.homework;

import java.util.Scanner;

public class Task2DeliveryService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== ТАРИФІКАТОР СЛУЖБИ ДОСТАВКИ ===");
        System.out.print("Введіть вагу відправлення (кг): ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введіть відстань транспортування (км): ");
        int distance = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Оберіть пункт призначення (1 - Відділення, 2 - Поштомат, 3 - Курєр): ");
        int deliveryType = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Чи є у вас карта Premium? (так/ні): ");
        String hasPremiumCard = scanner.nextLine();
        if (weight <= 0 || weight > 50.0) {
            System.out.println("Помилка: вага має бути більшою за 0 та не перевищувати 50 кг");
            scanner.close();
            return;
        }
        if (distance <= 0) {
            System.out.println("Помилка: відстань має бути більшою за нуль");
            scanner.close();
            return;
        }
        String deliveryTypeName = switch (deliveryType) {
            case 1 -> "Відділення";
            case 2 -> "Поштомат";
            case 3 -> "Курєр";
            default -> "";
        };
        double baseTariff = switch (deliveryType) {
            case 1 -> 50.0;
            case 2 -> (weight > 15.0) ? -1 : 60.0;
            case 3 -> 100.0;
            default -> -1;
        };
        if (deliveryType == 2 && baseTariff == -1) {
            System.out.println("Помилка: Поштомат не підтримує вантажі понад 15 кг");
            scanner.close();
            return;
        }
        if (baseTariff == -1) {
            System.out.println("Помилка: некоректний пункт призначення");
            scanner.close();
            return;
        }
        double distanceFee;
        if (distance <= 50) {
            distanceFee = 0.0;
        } else if (distance <= 200) {
            distanceFee = 35.0;
        } else {
            distanceFee = 80.0;
        }
        boolean isPremium = hasPremiumCard.equalsIgnoreCase("так");
        double total = Math.round((baseTariff + distanceFee) * 100) / 100.0;
        double finalCost = isPremium ? Math.round((total * 0.8) * 100) / 100.0 : total;
        System.out.println("\n------------- НАКЛАДНА ДОСТАВКИ -------------" +
                "\nТип доставки:              " + deliveryTypeName + " (базовий тариф: " + baseTariff + " грн)" +
                "\nДоплата за відстань:       " + distanceFee + " грн (" + distance + " км)" +
                "\nСума до знижки:            " + total + " грн" +
                "\nСтатус клієнта:            " + (isPremium ? "Premium (-20%)" : "Стандартний") +
                "\n---------------------------------------------" +
                "\nРАЗОМ ДО СПЛАТИ:           " + finalCost + " грн" +
                "\n=============================================");
        scanner.close();
    }
}
