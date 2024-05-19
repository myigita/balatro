package Player.Cards;

public class PlayingCard extends Card {
    private int value; // A = 10, 2 = 2, 3 = 3, 4 = 4, 5 = 5, 6 = 6, 7 = 7, 8 = 8, 9 = 9, 10 = 10, J = 10, Q = 10, K = 10
    private int suit; // 0 = hearts, 1 = diamonds, 2 = clubs, 3 = spades
    private int rank; // 1 = A, 2 = 2, 3 = 3, 4 = 4, 5 = 5, 6 = 6, 7 = 7, 8 = 8, 9 = 9, 10 = 10, 11 = J, 12 = Q, 13 = K
    private String enhancement = "none";
    private String seal = "none";

    public PlayingCard(int suit, int rank) {
        super();
        this.suit = suit;
        this.rank = rank;
        switch (rank) {
            case 1:
                value = 10;
                break;
            case 11:
                value = 10;
                break;
            case 12:
                value = 10;
                break;
            case 13:
                value = 10;
                break;
            default:
                value = rank;
        }
    }

    public int getSuit() {
        return suit;
    }

    public String getSuitString() {
        switch (suit) {
            case 0:
                return "hearts";
            case 1:
                return "diamonds";
            case 2:
                return "clubs";
            case 3:
                return "spades";
            default:
                return "invalid";
        }
    }

    public int getRank() {
        return rank;
    }

    public String getRankString() {
        switch (rank) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(rank);
        }
    }

    public void setEnhancement(String enhancement) {
        this.enhancement = enhancement;
    }

    public String getEnhancement() {
        return enhancement;
    }

    public void setSeal(String seal) {
        this.seal = seal;
    }

    public String getSeal() {
        return seal;
    }

    public String toString() {
        return getRankString() + " of " + getSuitString()  + " with " + enhancement + " enhancement and " + seal + " seal";
    }

    public String getDescription() {
        return getRankString() + " of " + getSuitString()  + " with " + enhancement + " enhancement and " + seal + " seal";
    }

    public String getName() {
        return getRankString() + " of " + getSuitString();
    }

    public int getValue() {
        return value;
    }
}
