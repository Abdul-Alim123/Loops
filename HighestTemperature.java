import java.util.Scanner;

public class HighestTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        double[] temperatures = new double[12];
        double highestTemperature = Double.MIN_VALUE;
        int monthIndex = -1;

        for (int i = 0; i < 12; i++) {
            System.out.print("Enter the temperature for " + months[i] + ": ");
            temperatures[i] = scanner.nextDouble();

            if (temperatures[i] > highestTemperature) {
                highestTemperature = temperatures[i];
                monthIndex = i;
            }
        }

        System.out.println("The highest temperature was in " + months[monthIndex] + " with a temperature of " + highestTemperature + "°C.");

        scanner.close();
    }
}
