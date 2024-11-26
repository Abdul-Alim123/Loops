import java.util.Scanner;

public class LoopComputations {
    public static void main(String[] args) {
        int sumEven = 0;
        for (int i = 2; i <= 100; i += 2) {
            sumEven += i;
        }
        System.out.println("Sum of all even numbers between 2 and 100: " + sumEven);

        int sumSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumSquares += i * i;
        }
        System.out.println("Sum of all squares between 1 and 100: " + sumSquares);

        System.out.println("Powers of 2 from 2^0 to 2^20:");
        for (int i = 0; i <= 20; i++) {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        int sumOdd = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            }
        }
        System.out.println("Sum of all odd numbers between " + a + " and " + b + ": " + sumOdd);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sumOddDigits = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sumOddDigits += digit;
            }
            number /= 10;
        }
        System.out.println("Sum of all odd digits: " + sumOddDigits);
    }
}
