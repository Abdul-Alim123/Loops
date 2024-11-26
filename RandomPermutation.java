import java.util.Random;
import java.util.Scanner;

public class RandomPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        for (int k = 0; k < word.length(); k++) {
            int i = random.nextInt(word.length() - 1);  // Pick random position i (not the last position)
            int j = random.nextInt(word.length() - i - 1) + i + 1;  // Pick random position j > i

            String first = word.substring(0, i);  // Substring before i
            String middle = word.substring(i + 1, j);  // Substring between i and j
            String last = word.substring(j + 1);  // Substring after j

            word = first + word.charAt(j) + middle + word.charAt(i) + last;  // Swap characters i and j
        }

        System.out.println("Randomly permuted word: " + word);
        scanner.close();
    }
}
