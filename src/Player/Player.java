package Player;

public class Player {
    private String name;
    private Hand hand;
    private Deck deck;
    private int score;
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.deck = new Deck();
        this.hand = new Hand(this.deck);
        this.inventory = new Inventory();
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

    public Inventory getInventory() {
        return inventory;
    }
}
