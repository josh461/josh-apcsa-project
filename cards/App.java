package cards;

public class App {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.print(5);

        Card c = new Card(0, 10);
        System.out.println(c);

        Hand h = new Hand(5);
        h.add(new Card(3, 12));
        h.add(new Card(2, 0));
        System.out.println(h);
    }
}
