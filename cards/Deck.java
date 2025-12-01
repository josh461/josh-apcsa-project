package cards;

import java.util.Random;

// This class models a standard 52-card deck.
// Supports shuffling, cutting, drawing, and printing cards.

public class Deck {

    private Card[] cards;
    private int topIndex; 

    public Deck() {
        cards = new Card[52];
        int index = 0;

        for (int suit = 0; suit < 4; suit++) {
            for (int value = 0; value < 13; value++) {
                cards[index] = new Card(suit, value);
                index++;
            }
        }

        topIndex = 0;
    }

    public void shuffle() {
        Random rand = new Random();

        for (int i = cards.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }

        topIndex = 0;
    }

    public void cut(int index) {
        if (topIndex != 0 || index <= 0 || index >= cards.length) {
            return;
        }

        Card[] newOrder = new Card[52];
        int newIndex = 0;

        for (int i = index; i < cards.length; i++) {
            newOrder[newIndex] = cards[i];
            newIndex++;
        }

        for (int i = 0; i < index; i++) {
            newOrder[newIndex] = cards[i];
            newIndex++;
        }

        cards = newOrder;
        topIndex = 0;
    }

    public Card draw() {
        if (topIndex >= cards.length) {
            return null;
        }
        Card c = cards[topIndex];
        topIndex++;
        return c;
    }

    public void print(int count) {
        if (count < 0) {
            return;
        }

        int available = cards.length - topIndex;
        int toPrint = Math.min(count, available);

        for (int i = 0; i < toPrint; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(cards[topIndex + i].toString());
        }
        System.out.println();
    }
}
