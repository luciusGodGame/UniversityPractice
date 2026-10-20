package semester1.practice05;

import java.util.Arrays;
import java.util.Scanner;

public class practice05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер завдання (1-40): ");
        int task = scanner.nextInt();
        scanner.nextLine();

        switch (task) {
            case 1 -> Task1();
            case 2 -> Task2();
            case 3 -> Task3();
            case 4 -> Task4(scanner);
            case 5 -> Task5();
            case 6 -> Task6();
            case 7 -> Task7();
            case 8 -> Task8();
            case 9 -> Task9();
            case 10 -> Task10();
            case 11 -> Task11();
            case 12 -> Task12(scanner);
            case 13 -> Task13(scanner);
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
        int[] numbers = new int[5];
        for (int num : numbers) {
            System.out.print(num + " | ");
        }
        System.out.println();
        numbers[0] = 10;
        numbers[2] = 30;
        numbers[4] = 50;
        System.out.println(Arrays.toString(numbers));
    }

    public static void Task2() {
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четверг", "П'ятниця", "Субота", "Неділя"};
        System.out.println(days.length);
        System.out.println(days[0]);
        System.out.println(days[days.length - 1]);
        days[5] = "Вихідний (сб)";
        days[6] = "Вихідний (нд)";
        System.out.println(Arrays.toString(days));
    }

    public static void Task3() {
        double[] prices = {120.50, 45.00, 890.99, 15.30, 420.00};
        System.out.println(Arrays.toString(prices));
        prices[2] = prices[2] * 0.8;
        System.out.println(Arrays.toString(prices));
    }

    public static void Task4(Scanner scanner) {
        int length;
        do {
            System.out.println("Введіть число");
            length = scanner.nextInt();
            scanner.nextLine();
        } while (length <= 0);
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = ++i;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void Task5() {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[numbers.length - i - 1] + " | ");
        }
    }

    public static void Task6() {
        int[] numbers = new int[10];
        numbers[0] = 1;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] * 2;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void Task7() {
        int[] original = {3, 7, 1, 9, 4};
        int[] copy = new int[original.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = original[i];
        }
        copy[0] = 999;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));
    }

    public static void Task8() {
        int[] grades = {95, 84, 70, 99, 65, 88, 92};
        int sum = 0;
        for (int i : grades) {
            sum += i;
        }
        double middle = sum / (grades.length * 1.00);
        System.out.println("Сума: " + sum + " Середній бал:  " + middle);
    }

    public static void Task9() {
        int[] temps = {18, 21, 15, 24, 13, 27, 20};
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < temps.length; i++) {
            if (temps[minIndex] > temps[i]) {
                minIndex = i;
            }
            if (temps[maxIndex] < temps[i]) {
                maxIndex = i;
            }
        }
        System.out.println("Мінімальна:" + temps[minIndex] + " з індексом:" + minIndex);
        System.out.println("Максимальна:" + temps[maxIndex] + " з індексом:" + maxIndex);
    }

    public static void Task10() {
        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};
        int belowZero = 0;
        int overZero = 0;
        int zero = 0;
        for (int i : data) {
            if (i > 0) {
                overZero++;
            }
            if (i < 0) {
                belowZero++;
            }
            if (i == 0) {
                zero++;
            }
        }
        System.out.println(overZero + " " + belowZero + " " + zero);
    }

    public static void Task11() {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        int even = 0;
        int oddSum = 0;
        for (int i : numbers) {
            if ((i % 2) == 0) {
                even++;
            } else {
                oddSum += i;
            }
        }
        System.out.println(even + " -  парних | Сума непарних -" + oddSum);
    }

    public static void Task12(Scanner scanner) {
        int[] students = {1042, 2031, 3055, 4018, 5099};
        do {
            int searchFor = scanner.nextInt();
            scanner.nextLine();
            for (int i : students) {
                if (i == searchFor) {
                    System.out.println("Студента знайдено");
                    return;
                }
            }
            System.out.println("Студента з таким номером не знайдено");
        } while (true);
    }

    public static void Task13(Scanner scanner) {
        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};
        System.out.println("Введіть число 1-6:");
        int input = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (int i : rolls) {
            if (i == input) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void Task14() {
        int[] salary = {18000, 25000, 32000, 15000, 41000, 29000};
        int sum = 0;
        for (int i : salary) {
            sum += i;
        }
        int middle = sum / salary.length;
        for (int i : salary) {
            if (i > middle) {
                System.out.print(i + " | ");
            }
        }
    }

    public static void Task15() {
        double[] prices = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};
        double min = prices[0];
        double max = prices[0];
        for (double i : prices) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println(max - min);
        System.out.printf("%.2f", max - min);
    }

    public static void Task16() {
        String[] city = {"Київ", "Львів", "Харків", "Одеса", "Дніпро"};
        for (String i : city) {
            System.out.println("Ласкаво просимо до міста " + i);
        }
    }

    public static void Task17() {
        double[] salaries = {20000.0, 25000.0, 18000.0, 30000.0};
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = salaries[i] * 1.10;
        }
        System.out.println(Arrays.toString(salaries));
    }

    public static void Task18() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int temp;
        for (int i = 0; i < (arr.length / 2); i++) {
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Task19() {
        int[] base = {2, 4, 6, 8, 10};
        int[] squares = new int[base.length];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = (int) Math.pow(base[i], 2);
        }
        System.out.println(Arrays.toString(base));
        System.out.println(Arrays.toString(squares));
    }

    public static void Task20() {
        int[] numbers = {1, 2, 3, 4};
        boolean isSorted = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }
    }

    public static void Task21() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        System.out.println(Arrays.toString(c));
    }

    public static void Task22() {
        int[] test = {45, 12, 89, 3, 27};
        System.out.println(Arrays.toString(test));
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        Arrays.fill(test, -1);
        System.out.println(Arrays.toString(test));
    }

    public static void Task23() {
        int[][] table = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < table.length; i++) {
            for (int ii = 0; ii < table[i].length; ii++) {
                System.out.print(table[i][ii] + " \t");
            }
            System.out.println();
        }
    }

    public static void Task24() {
        int[][] matrix = {
                {10, 20, 30, 40},
                {50, 60, 70, 80}
        };
        System.out.println(matrix.length + " " + matrix[0].length + " " + matrix[0][0] + " " +
                matrix[0][matrix[0].length - 1] + " " + matrix[matrix.length - 1][0] + " " +
                matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1]);

    }

    public static void Task25() {
        int[][] grid = new int[3][4];
        int count = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int ii = 0; ii < grid[i].length; ii++) {
                grid[i][ii] = count++;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int ii = 0; ii < grid[i].length; ii++) {
                System.out.print(grid[i][ii] + " \t");
            }
            System.out.println();
        }
    }

    public static void Task26() {
        int[][] randomGrid = new int[4][3];
        for (int i = 0; i < randomGrid.length; i++) {
            for (int ii = 0; ii < randomGrid[i].length; ii++) {
                randomGrid[i][ii] = (int) (Math.random() * 90 + 10);
            }
        }
        System.out.println(Arrays.deepToString(randomGrid));
        for (int i = 0; i < randomGrid.length; i++) {
            for (int ii = 0; ii < randomGrid[i].length; ii++) {
                System.out.print(randomGrid[i][ii] + " \t");
            }
            System.out.println();
        }
    }

    public static void Task27() {
        int[][] multTable = new int[9][9];
        for (int i = 0; i < multTable.length; i++) {
            for (int ii = 0; ii < multTable[i].length; ii++) {
                multTable[i][ii] = (i + 1) * (ii + 1);
            }
        }
        for (int i = 0; i < multTable.length; i++) {
            for (int ii = 0; ii < multTable[i].length; ii++) {
                System.out.print(multTable[i][ii] + " \t");
            }
            System.out.println();
        }
    }

    public static void Task28() {
        int[][] table = new int[9][9];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
        }
        for (int i = 0; i < table.length; i++) {
            for (int ii = 0; ii < table[i].length; ii++) {
                System.out.print(table[i][ii] + " \t");
            }
            System.out.println();
        }
    }

    public static void Task29() {
        int[][] table = new int[4][4];
        Arrays.fill(table[1], 0);
        for (int i = 0; i < table.length; i++) {
            table[i][2] = 7;
        }
        for (int i = 0; i < table.length; i++) {
            for (int ii = 0; ii < table[i].length; ii++) {
                System.out.print(table[i][ii] + " \t");
            }
            System.out.println();
        }
    }

    public static void Task30() {
        int[][] table = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                count++;
                sum += table[i][j];
            }
        }
        double middle = sum / (count * 1.00);
        System.out.println(sum + " " + count + " " + middle);
    }

    public static void Task31() {
        int[][] table = new int[][]{
                {19, 84, 0, 11},
                {13, 50, 34, 64},
                {14, 67, 88, 69}
        };
        int[] rowSums = new int[3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                rowSums[i] += table[i][j];
            }
        }
        for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Рядок " + i + ": сума = " + rowSums[i]);
        }
    }

    public static void Task32() {
        int[][] table = new int[][]{
                {19, 84, 0},
                {13, 50, 34},
                {14, 67, 88}
        };
        int[] colSums = new int[3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                colSums[j] += table[i][j];
            }
        }
        for (int i : colSums) {
            System.out.print(i + " ");
        }
    }

    public static void Task33() {
        int[][] table = new int[][]{
                {19, 84, 0, 11},
                {13, 50, 34, 64},
                {14, 67, 88, 69}
        };
        int maxFirstIndex = 0;
        int maxSecondIndex = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] > table[maxFirstIndex][maxSecondIndex]) {
                    maxFirstIndex = i;
                    maxSecondIndex = j;
                }
            }
        }
        System.out.println("Максимум: " + table[maxFirstIndex][maxSecondIndex] + " у комірці [" + maxFirstIndex + ", " + maxSecondIndex + "]");
    }

    public static void Task34() {
        int[][] table = new int[][]{
                {19, 84, 0, 11},
                {13, 50, 34, 64},
                {14, 67, 88, 69}
        };
        int sumMain = 0;
        int sumSecond = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j) {
                    sumMain += table[i][j];
                }
                if ((i + j) == (table.length - 1)) {
                    sumSecond += table[i][j];
                }
            }
        }
        if (sumMain > sumSecond) {
            System.out.println(sumMain + " > " + sumSecond);
        } else if (sumMain < sumSecond) {
            System.out.println(sumMain + " < " + sumSecond);
        } else {
            System.out.println(sumMain + " = " + sumSecond);
        }
    }

    public static void Task35() {
        int[][] table = new int[][]{
                {19, 84, 0},
                {13, 50, 34},
                {14, 67, 88}
        };
        int[][] transposed = new int[table.length][table[0].length];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                transposed[j][i] = table[i][j];
            }
        }
        System.out.println(Arrays.deepToString(table));
        System.out.println(Arrays.deepToString(transposed));
    }

    public static void Task36() {
        int[][] ladder = new int[4][];
        for (int i = 0; i < ladder.length; i++) {
            ladder[i] = new int[i + 1];
            ladder[i][i + 1] = i;
        }
        for (int i = 0; i < ladder.length; i++) {
            for (int ii = 0; ii < ladder[i].length; ii++) {
                System.out.print(ladder[i][ii] + " \t");
            }
            System.out.println();
        }
    }

    public static void Task37() {
        String[][] weekSchedule = new String[][]{
                {"Вища математика", "Основи програмування", "Фізика"},
                {"Англійська мова", "Історія України"},
                {"Основи програмування", "Основи програмування", "Бази даних", "Фізвиховання"},
                {"Дискретна математика"},
                {"Філософія", "Основи алгоритмізації", "Практикум"}};
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четверг", "П'ятниця"};
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + ": " + Arrays.toString(weekSchedule[i]));
        }
    }

    public static void Task38() {
        int[][] pascal = new int[5][];
        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];
            for (int j = 0; j < pascal[i].length; j++) {
                if ((j == 0) || (j == (pascal[i].length - 1))) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(pascal));
    }

    public static void Task39() {
        int[][][] cube = new int[3][3][3];
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = i + j + k;
                }
            }
        }
        for (int i = 0; i < cube.length; i++) {
            System.out.println("--- Шар " + i + " ---");
            for (int j = 0; j < cube[i].length; j++) {
                System.out.println(Arrays.toString(cube[i][j]));
                System.out.println();
            }
        }
    }

    public static void Task40() {
        double[][][] weather = new double[3][7][2];
        for (int i = 0; i < weather.length; i++) {
            for (int j = 0; j < weather[i].length; j++) {
                weather[i][j][0] = (int) (Math.random() * 5 + 15);
                weather[i][j][1] = (int) (Math.random() * 10 - 5);
            }
        }
        int tempSum = 0;
        int[] coldestNight = new int[]{0, 0};
        for (int i = 0; i < weather.length; i++) {
            for (int j = 0; j < weather[i].length; j++) {
                tempSum += weather[i][j][0];
                if (weather[i][j][1] < weather[coldestNight[0]][coldestNight[1]][1]) {
                    coldestNight = new int[]{i, j};
                }
            }
        }
        System.out.println((tempSum / 21) + " | " + weather[coldestNight[0]][coldestNight[1]][1]);
    }
}