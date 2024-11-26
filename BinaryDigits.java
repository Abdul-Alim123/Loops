import java.util.Scanner;

public class BinaryDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        while (number > 0) {
            System.out.println(number % 2);
            number /= 2;
        }

        scanner.close();
    }
}

