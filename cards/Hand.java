package cards;

// This class represents a player's hand and stores multiple cards using an array.
public class Hand {

    private Card[] cards;
    private int count;

    public Hand(int maxCards) {
        cards = new Card[maxCards];
        count = 0;
    }

    public void add(Card c) {
        if (c == null) {
            return;
        }
        if (count < cards.length) {
            cards[count] = c;
            count++;
        }
    }

    public int length() {
        return count;
    }

    public Card get(int index) {
        return cards[index];
    }

    public Card remove(int index) {
        Card removed = cards[index];

        for (int i = index; i < count - 1; i++) {
            cards[i] = cards[i + 1];
        }

        cards[count - 1] = null; 
        count--;

        return removed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(cards[i].toString());
        }

        return sb.toString();
    }
}
