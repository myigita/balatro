package Player;

public class Player {
    private String name;
    private Hand hand;
    private Deck deck;
    private int score;

    public Player(String name) {
        this.name = name;
        this.deck = new Deck();
        this.hand = new Hand(this.deck);
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public Deck getDeck() {
        return deck;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
