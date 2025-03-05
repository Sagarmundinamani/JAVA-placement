import java.util.*;

public class MostRepeatedLettersWord {
    
    public static String findWordWithMostRepeatedLetters(String paragraph) {
        String[] words = paragraph.split("\\s+"); // Split by whitespace
        String maxWord = "";
        int maxRepeatedLetters = 0;
        
        for (String word : words) {
            int repeatedLetters = countMaxRepeatedLetter(word);
            if (repeatedLetters > maxRepeatedLetters) {
                maxRepeatedLetters = repeatedLetters;
                maxWord = word;
            }
        }
        
        return maxWord;
    }
    
    private static int countMaxRepeatedLetter(String word) {
        int[] letterCounts = new int[26]; // For 'a' to 'z'
        int maxCount = 0;
        
        for (char c : word.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                letterCounts[c - 'a']++;
                maxCount = Math.max(maxCount, letterCounts[c - 'a']);
            }
        }
        
        return maxCount > 1 ? maxCount : 0; // Only count repeated letters
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();
        
        String result = findWordWithMostRepeatedLetters(paragraph);
        System.out.println("Word with most repeated letters: " + result);
        
        scanner.close();
    }
}
