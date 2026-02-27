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
        if (input.length() == 0) {
            return input;
        }
        if (input == null || input.isEmpty()) {
            return input;
        }

        String punctuation = "";
        if (!Character.isLetter(input.charAt(input.length() - 1))) {
            punctuation = String.valueOf(input.charAt(input.length() - 1));
            input = input.substring(0, input.length() - 1);
            if (input.length() == 0) {
                return input;
            }
        }
    

        boolean isCapitalized = Character.isUpperCase(input.charAt(0));
        input = input.toLowerCase();

        int vowelIndex = 0;
        while (vowelIndex < input.length() && !isVowel(input.charAt(vowelIndex))) {
            vowelIndex++;
        }

        String translatedWord;
        if (vowelIndex == 0) {
            translatedWord = input + "ay";
        } else if (vowelIndex == input.length()) {
            translatedWord = input + "ay";
        } else {
            translatedWord = input.substring(vowelIndex) + input.substring(0, vowelIndex) + "ay";
        }

        if (isCapitalized) {
            translatedWord = Character.toUpperCase(translatedWord.charAt(0)) + translatedWord.substring(1);
        }

        return translatedWord + punctuation;
    }
    
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}