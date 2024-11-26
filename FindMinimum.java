import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean first = true;
        double minimum = 0;

        while (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();

            if (first) {
                minimum = value;
                first = false;
            } else if (value < minimum) {
                minimum = value;
            }
        }

        System.out.println("The minimum value is: " + minimum);
        scanner.close();
    }
}
