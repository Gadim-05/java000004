
package CardGame;

class Card {
    private String suit;
    private String rank;
    private int point;

     static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
     static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
     static final int[] points = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.point = getPointValue(rank);
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getPoint() {
        return point;
    }

    private int getPointValue(String rank) {
        for (int i = 0; i < ranks.length; i++) {
            if (ranks[i].equals(rank)) {
                return points[i];
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return rank + " " + suit;
    }
}
