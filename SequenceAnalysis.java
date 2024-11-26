import java.util.ArrayList;
import java.util.Scanner;

public class SequenceAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part (a): Smallest and largest of the inputs
        System.out.println("Enter integers (type 'done' to stop):");
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.add(num);
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.println("Smallest: " + smallest + ", Largest: " + largest);

        // Part (b): Number of even and odd inputs
        int evenCount = 0, oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Even count: " + evenCount + ", Odd count: " + oddCount);

        // Part (c): Cumulative totals
        System.out.println("Cumulative totals:");
        int cumulativeSum = 0;
        for (int num : numbers) {
            cumulativeSum += num;
            System.out.print(cumulativeSum + " ");
        }
        System.out.println();

        // Part (d): All adjacent duplicates
        System.out.println("Adjacent duplicates:");
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).equals(numbers.get(i - 1))) {
                if (i == 1 || !numbers.get(i).equals(numbers.get(i - 2))) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        }
        System.out.println();

        scanner.close();
    }
}
