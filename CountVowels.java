import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int vowelCount = 0;
        String vowels = "aeiouyAEIOUY";  // Including both lowercase and uppercase vowels

        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                vowelCount++;
            }
        }

        System.out.println(vowelCount + " vowels");
        scanner.close();
    }
}
