package CardGame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Deck {
    public List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (String suit : Card.suits) {
            for (String rank : Card.ranks) {
                cards.add(new Card(suit, rank));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> deal(int numCards) {

        List<Card> dealtCards = new ArrayList<>(cards.subList(0, numCards));
        cards = cards.subList(numCards, cards.size());
        return dealtCards;
    }
}
