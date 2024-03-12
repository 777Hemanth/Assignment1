import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine().toLowerCase(); // Convert the string to lowercase
        
        // Count vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        // Output result
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        
        scanner.close();
    }
}
