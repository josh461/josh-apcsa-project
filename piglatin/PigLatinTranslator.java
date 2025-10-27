package piglatin;

public class PigLatinTranslator {
    public static Book translate(Book input) {
        Book translatedBook = new Book();
        translatedBook.setTitle(input.getTitle());
        for (int i = 0; i < input.getLineCount(); i++) {
            translatedBook.appendLine(translate(input.getLine(i)));
        }
        return translatedBook;
    }

    public static String translate(String input) {
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(translateWord(word)).append(" ");
        }
        return result.toString().trim();
    }

    private static String translateWord(String input) {
        if (input.isEmpty()) {
            return input;
        }

        int punctuationIndex = input.length();
        boolean hasPunctuation = false;
        if (!Character.isLetter(input.charAt(input.length() - 1))) {
            punctuationIndex = input.length() - 1;
            hasPunctuation = true;
        }

        String punctuation = "";
        if (hasPunctuation) {
            punctuation = input.substring(punctuationIndex);
        }
        String word = input.substring(0, punctuationIndex);

        boolean isCapitalized = Character.isUpperCase(word.charAt(0));
        boolean isAllCaps = word.equals(word.toUpperCase());

        word = word.toLowerCase();

        int vowelIndex = 0;
        while (vowelIndex < word.length() && !isVowel(word.charAt(vowelIndex))) {
            vowelIndex++;
        }

        if (vowelIndex == word.length()) {
            // If the word doesn't contain any vowels
            vowelIndex = 1;
        }

        String translatedWord;
        if (vowelIndex == 0) {
            translatedWord = word + "way";
        } else {
            translatedWord = word.substring(vowelIndex) + word.substring(0, vowelIndex) + "ay";
        }

        if (isCapitalized && isAllCaps) {
            translatedWord = translatedWord.toUpperCase();
        } else if (isCapitalized) {
            translatedWord = Character.toUpperCase(translatedWord.charAt(0)) + translatedWord.substring(1);
        }

        return translatedWord + punctuation;
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}