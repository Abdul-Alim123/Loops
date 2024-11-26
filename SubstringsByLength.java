import java.util.Scanner;

public class SubstringsByLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        for (int length = 1; length <= word.length(); length++) {
            for (int i = 0; i <= word.length() - length; i++) {
                System.out.println(word.substring(i, i + length));
            }
        }

        scanner.close();
    }
}

