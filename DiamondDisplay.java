import java.util.Scanner;

public class DiamondDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        int sideLength = scanner.nextInt();

        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = sideLength - 1; i >= 1; i--) {
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
