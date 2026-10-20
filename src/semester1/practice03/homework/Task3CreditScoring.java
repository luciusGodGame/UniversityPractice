package semester1.practice03.homework;

import java.util.Scanner;

public class Task3CreditScoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== СИСТЕМА БАНКІВСЬКОГО СКОРИНГУ ===");
        System.out.print("Введіть вік позичальника: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть офіційний місячний дохід (грн): ");
        double monthlyIncome = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Чи є негативна кредитна історія? (true/false): ");
        boolean hasBadCreditHistory = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Введіть запитувану суму кредиту (грн): ");
        double loanAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введіть бажаний термін (місяців): ");
        int loanMonths = scanner.nextInt();
        scanner.nextLine();
        boolean isValidAge = age >= 21 && age <= 65;
        boolean hasCleanHistory = !hasBadCreditHistory;
        boolean isPaymentAffordable = (loanMonths > 0) && ((loanAmount / loanMonths) <= (monthlyIncome * 0.5));
        if (isValidAge && hasCleanHistory && isPaymentAffordable) {
            double monthlyPayment = Math.round((loanAmount / loanMonths) * 100) / 100.0;
            double rate = (monthlyIncome >= 35000.0) ? 14.5 : 21.0;
            System.out.println("\n------------- РІШЕННЯ СКОРИНГУ -------------" +
                    "\nСтатус заявки:                 СХВАЛЕНО" +
                    "\nОрієнтовний платіж/міс:        " + monthlyPayment + " грн (" + (Math.round((monthlyPayment / monthlyIncome) * 1000) / 10.0) + "% від доходу)" +
                    "\nПерсональна ставка:            " + rate + "% річних" +
                    "\nМаксимально допустимий платіж: " + (monthlyIncome * 0.5) + " грн/міс" +
                    "\n=============================================");
        } else {
            System.out.println("\n------------- РІШЕННЯ СКОРИНГУ -------------" +
                    "\nСтатус заявки:                 ВІДХИЛЕНО");
            if (!isValidAge) {
                System.out.println("Відмова: вік не відповідає критеріям (21-65 років)");
            } else if (!hasCleanHistory) {
                System.out.println("Відмова: виявлено негативну кредитну історію");
            } else {
                System.out.println("Відмова: термін кредиту некоректний або щомісячний платіж перевищує 50% доходу");
            }
            System.out.println("=============================================");
        }
        scanner.close();
    }
}
