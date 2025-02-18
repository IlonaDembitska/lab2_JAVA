package Lab22;

import java.util.Scanner;

public class lab22{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Завдання 1
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();
        checkRange(n);

        // Завдання 2
        System.out.print("Введіть тризначне число: ");
        int threeDigitNumber = scanner.nextInt();
        findLargestDigit(threeDigitNumber);

        // Завдання 3
        System.out.print("Введіть поточний поверх: ");
        int currentFloor = scanner.nextInt();
        System.out.print("Введіть бажаний поверх: ");
        int desiredFloor = scanner.nextInt();
        elevatorSimulation(currentFloor, desiredFloor);

        // Завдання 4
        System.out.print("Виберіть опцію (Так, ОК, Yes, Y, +, Ok, Ні, NO, N, -, No): ");
        String choice = scanner.next();
        contextMenu(choice);

        // Завдання 5
        System.out.print("Введіть три різні числа: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        sortNumbers(a, b, c);

        // Завдання 6
        System.out.print("Введіть секунди (0-28800): ");
        int seconds = scanner.nextInt();
        workDayCountdown(seconds);

        scanner.close();
    }

    // Завдання 1
    public static void checkRange(int n) {
        if (n > 50 && n < 100) {
            System.out.println("Число " + n + " міститься в проміжку (50; 100)");
        } else {
            System.out.println("Число " + n + " не міститься в проміжку (50; 100)");
        }
    }

    // Завдання 2
    public static void findLargestDigit(int n) {
        int first = n / 100;
        int second = (n / 10) % 10;
        int third = n % 10;
        int maxDigit = Math.max(first, Math.max(second, third));
        System.out.println("Найбільша цифра: " + maxDigit);
    }

    // Завдання 3
    public static void elevatorSimulation(int current, int desired) {
        if (desired == 2) {
            desired = current < 2 ? 3 : 1;
        }
        if (desired > current) {
            System.out.println("Ви піднялись на " + desired + " поверх");
        } else if (desired < current) {
            System.out.println("Ви спустились на " + desired + " поверх");
        } else {
            System.out.println("Ви вже на цьому поверсі");
        }
    }

    // Завдання 4
    public static void contextMenu(String choice) {
        switch (choice.toLowerCase()) {
            case "так": case "ок": case "yes": case "y": case "+": case "ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "ні": case "no": case "n": case "-":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Невірний вибір");
        }
    }

    // Завдання 5
    public static void sortNumbers(int a, int b, int c) {
        if (a > b) { int temp = a; a = b; b = temp; }
        if (a > c) { int temp = a; a = c; c = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }
        System.out.println("Відсортовані числа: " + a + " " + b + " " + c);
    }

    // Завдання 6
    public static void workDayCountdown(int seconds) {
        int hoursLeft = seconds / 3600;
        System.out.println(seconds + " секунд");
        if (hoursLeft > 0) {
            System.out.println("До кінця робочого дня залишилось " + hoursLeft + " годин");
        } else {
            System.out.println("До кінця робочого дня залишилось менше 1 години");
        }
    }
}
