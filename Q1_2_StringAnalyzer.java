import java.util.Scanner;

public class Q1_2_StringAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        // Word count
        String[] words = sentence.split("\\s+");
        System.out.println("Word Count : " + words.length);

        // First and last word
        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        System.out.println("First Word : " + firstWord);
        System.out.println("Last Word : " + lastWord);

        // Find first and last occurrence of 'J'
        char target = 'J';

        int firstIndex = sentence.indexOf(target);
        int lastIndex = sentence.lastIndexOf(target);

        System.out.println("First 'J' index : " + firstIndex);
        System.out.println("Last 'J' index : " + lastIndex);

        // Compare first and last word
        int comparison = firstWord.compareTo(lastWord);

        System.out.println(
            "Comparison (first vs last word) : " + comparison
        );

        // First character
        char[] characters = sentence.toCharArray();
        char firstCharacter = characters[0];

        char firstCharacterUsingCharAt = sentence.charAt(0);
        String firstCharacterString =
                String.valueOf(firstCharacterUsingCharAt);

        System.out.println("First character : " + firstCharacterString);

        // ASCII value
        System.out.println(
            "First character ASCII value : " +
            (int) firstCharacter
        );

        sc.close();
    }
}