import java.util.Scanner;

public class DiamondWithSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        int sideLength = scanner.nextInt();

        // Top half of the diamond
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            if (i > 1) {
                System.out.print(" ");
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Bottom half of the diamond
        for (int i = sideLength; i >= 1; i--) {
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            if (i > 1) {
                System.out.print(" ");
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

