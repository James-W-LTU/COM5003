import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String originalSentence = scanner.nextLine();


        System.out.println("\nOriginal sentence: " + originalSentence);

        String upperCaseSentence = originalSentence.toUpperCase();
        System.out.println("Sentence in uppercase: " + upperCaseSentence);

        String[] words = originalSentence.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words in the sentence: " + wordCount);

        String reversedSentence = new StringBuilder(originalSentence).reverse().toString();
        System.out.println("Sentence reversed: " + reversedSentence);

        boolean containsJava = originalSentence.toLowerCase().contains("java");
        System.out.println("Sentence contains the word 'Java': " + (containsJava ? "Yes" : "No"));

        String replacedSpacesSentence = originalSentence.replace(" ", "_");
        System.out.println("Sentence with spaces replaced with underscores: " + replacedSpacesSentence);

        System.out.println("\nFinal replaced sentence: " + replacedSpacesSentence);
    }
}
