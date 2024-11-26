import java.util.Scanner;

public class SquareDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        int sideLength = scanner.nextInt();
        
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = 0; j < sideLength; j++) {
                if (j == 0 || j == sideLength - 1 || i == 0 || i == sideLength - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

