import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's price for one dollar in Japanese yen: ");
        double yenPerDollar = scanner.nextDouble();

        // Convert dollars to yen
        while (true) {
            System.out.print("Enter a dollar amount to convert to yen (0 to stop): ");
            double dollars = scanner.nextDouble();

            if (dollars == 0) {
                break;
            }

            double yen = dollars * yenPerDollar;
            System.out.println(dollars + " USD is " + yen + " JPY");
        }

        // Convert yen to dollars
        while (true) {
            System.out.print("Enter a yen amount to convert to dollars (0 to stop): ");
            double yen = scanner.nextDouble();

            if (yen == 0) {
                break;
            }

            double dollars = yen / yenPerDollar;
            System.out.println(yen + " JPY is " + dollars + " USD");
        }

        System.out.println("Program ended.");
    }
}

