import java.util.Scanner;
import java.util.ArrayList;

class DataSet {
    private ArrayList<Double> values;

    public DataSet() {
        values = new ArrayList<>();
    }

    public void add(double value) {
        values.add(value);
    }

    public double getAverage() {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    public double getSmallest() {
        double smallest = Double.MAX_VALUE;
        for (double value : values) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    public double getLargest() {
        double largest = Double.MIN_VALUE;
        for (double value : values) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    public double getRange() {
        return getLargest() - getSmallest();
    }
}

public class TemperatureStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSet dataSet = new DataSet();

        System.out.println("Enter a set of floating-point values (type 'done' to finish):");

        while (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
            dataSet.add(value);
        }

        // After input, output the results
        System.out.println("Average: " + dataSet.getAverage());
        System.out.println("Smallest: " + dataSet.getSmallest());
        System.out.println("Largest: " + dataSet.getLargest());
        System.out.println("Range: " + dataSet.getRange());

        scanner.close();
    }
}

