package semester1.practice04.homework;

import java.util.Scanner;

public class Task3FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Скільки чисел згенерувати (N >= 3): ");
        int n = scanner.nextInt();
        int f1 = 1;
        int f2 = 1;
        double lastRatio = 1.0;
        System.out.println();
        System.out.println("№ 1  | Число: " + f1);
        System.out.println("№ 2  | Число: " + f2);
        for (int i = 3; i <= n; i++) {
            int next = f1 + f2;
            double ratio = (double) next / f2;
            double roundedRatio = Math.round(ratio * 1000000) / 1000000.0;
            System.out.println("№ " + i + " | Число: " + next + " | Відношення F(n)/F(n-1) = " + roundedRatio);
            f1 = f2;
            f2 = next;
            lastRatio = roundedRatio;
        }
        System.out.println();
        System.out.println("Підсумок: знайдено наближення Золотого перетину: " + lastRatio);
        System.out.println("Еталонне значення:                             " + 1.618034);
        System.out.println("=========================================");
        scanner.close();
    }
}
