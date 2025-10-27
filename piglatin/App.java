package piglatin;

public class App {
    public static void main(String[] args) {
        int score = TestSuite.run();

        if (score > 4) {
            Book input = new Book();
            input.readFromUrl("Romeo and Juliet", "https://www.gutenberg.org/cache/epub/1513/pg1513.txt");
            Book output = PigLatinTranslator.translate(input);
            output.writeToFile("romeo_and_juliet_pig_latin.txt");
        }
    }
}