package CardGame;
import java.util.ArrayList;
import java.util.List;
class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void receiveCards(List<Card> cards) {
        hand.addAll(cards);
    }

    public int calculatePoints() {
        int totalPoints = 0;
        for (Card card : hand) {
            totalPoints += card.getPoint();
        }
        return totalPoints;
    }

    public String showHand() {
        StringBuilder shand = new StringBuilder();
        for (Card card : hand) {
            shand.append(card).append(", ");
        }
        return shand.toString();
    }
}