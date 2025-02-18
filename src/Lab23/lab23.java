package Lab23;

import java.util.Scanner;

public class lab23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Завдання 1
        printRange();

        // Завдання 2
        printSequence();

        // Завдання 3
        printDivisors();

        // Завдання 4
        printFactorial();

        // Завдання 5
        countSymmetricTimes();

        // Завдання 6
        countLuckyNumbers();

        scanner.close();
    }

    // Завдання 1
    public static void printRange() {
        System.out.println("Числа від 500 до 650 з кроком 10 (for):");
        for (int i = 500; i <= 650; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Числа від 500 до 650 з кроком 10 (while):");
        int i = 500;
        while (i <= 650) {
            System.out.print(i + " ");
            i += 10;
        }
        System.out.println();

        System.out.println("Числа від 500 до 650 з кроком 10 (do-while):");
        i = 500;
        do {
            System.out.print(i + " ");
            i += 10;
        } while (i <= 650);
        System.out.println();
    }

    // Завдання 2
    public static void printSequence() {
        int a = 2;
        System.out.println("Послідовність 2a - 1 (менше 5000):");
        while (a < 5000) {
            System.out.print(a + " ");
            a = 2 * a - 1;
        }
        System.out.println();
    }

    // Завдання 3
    public static void printDivisors() {
        System.out.println("Дільники числа 10:");
        for (int i = 1; i <= 10; i++) {
            if (10 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Завдання 4
    public static void printFactorial() {
        int factorial = 1;
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }
        System.out.println("Факторіал 10 (for): " + factorial);

        factorial = 1;
        int i = 1;
        while (i <= 10) {
            factorial *= i;
            i++;
        }
        System.out.println("Факторіал 10 (while): " + factorial);
    }

    // Завдання 5
    public static void countSymmetricTimes() {
        int count = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                String time = String.format("%02d:%02d", h, m);
                if (time.charAt(0) == time.charAt(4) && time.charAt(1) == time.charAt(3)) {
                    count++;
                }
            }
        }
        System.out.println("Кількість симетричних комбінацій на годиннику: " + count);
    }

    // Завдання 6
    public static void countLuckyNumbers() {
        int count = 0;
        for (int i = 0; i <= 999999; i++) {
            int sum1 = (i / 100000) + ((i / 10000) % 10) + ((i / 1000) % 10);
            int sum2 = ((i / 100) % 10) + ((i / 10) % 10) + (i % 10);
            if (sum1 == sum2) {
                count++;
            }
        }
        System.out.println("Кількість щасливих чисел: " + count);
    }
}

