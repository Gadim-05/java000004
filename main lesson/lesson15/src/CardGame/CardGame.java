package CardGame;
import java.util.ArrayList;
import java.util.List;

class CardGame {
    private Deck deck;
    private List<Player> players;

    public CardGame() {
        deck = new Deck();
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void dealCards(int numCards) {
        for (Player player : players) {
            player.receiveCards(deck.deal(numCards));
        }
    }

    public void showHands() {
        for (Player player : players) {
            System.out.println(player.getName() + "'s hand: " + player.showHand());
        }
    }

    public void determineWinner() {
        Player winner = null;
        int highestPoints = 0;

        for (Player player : players) {
            int points = player.calculatePoints();
            System.out.println(player.getName() + " has " + points + " points.");
            if (points > highestPoints) {
                highestPoints = points;
                winner = player;
            }
        }

        if (winner != null) {
            System.out.println("The winner is " + winner.getName() + " with " + highestPoints + " points!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        CardGame game = new CardGame();

        Player player1 = new Player("Qedim");
        Player player2 = new Player("Teymur");

        game.addPlayer(player1);
        game.addPlayer(player2);

        game.dealCards(3);

        game.showHands();

        game.determineWinner();
    }
}
