import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Part (a): Only the uppercase letters in the string
        System.out.print("Uppercase letters: ");
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                System.out.print(c);
            }
        }
        System.out.println();

        // Part (b): Every second letter of the string
        System.out.print("Every second letter: ");
        for (int i = 1; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
        System.out.println();

        // Part (c): The string with all vowels replaced by an underscore
        System.out.print("String with vowels replaced: ");
        String modified = input.replaceAll("[AEIOUaeiou]", "_");
        System.out.println(modified);

        // Part (d): The number of vowels in the string
        int vowelCount = 0;
        for (char c : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        // Part (e): The positions of all vowels in the string
        System.out.print("Positions of vowels: ");
        for (int i = 0; i < input.length(); i++) {
            if ("AEIOUaeiou".indexOf(input.charAt(i)) != -1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
