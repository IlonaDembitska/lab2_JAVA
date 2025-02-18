//Сума цифр двозначного числа
import java.util.Scanner;

public class lab22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть двозначне число: ");
        int num = scanner.nextInt();

        int firstDigit = num / 10; // Перша цифра
        int secondDigit = num % 10; // Друга цифра

        int sum = firstDigit + secondDigit;
        System.out.println("Сума цифр: " + sum);
    }
}

