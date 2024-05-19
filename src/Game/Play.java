package Game;

import Player.Cards.PlayingCard;
import Player.Player;
import Player.ScoringHandTypes.FlushFive;
import Player.ScoringHandTypes.HighCard;
import Player.ScoringHandTypes.ScoringHand;

import java.util.ArrayList;

public class Play {
    private Player player;
    private final int HIGH_CARD = 0;
    private final int PAIR = 1;
    private final int TWO_PAIR = 2;
    private final int THREE_OF_A_KIND = 3;
    private final int STRAIGHT = 4;
    private final int FLUSH = 5;
    private final int FULL_HOUSE = 6;
    private final int FOUR_OF_A_KIND = 7;
    private final int STRAIGHT_FLUSH = 8;
    private final int ROYAL_FLUSH = 9;
    private final int FIVE_OF_A_KIND = 10;
    private final int FLUSH_HOUSE = 11;
    private final int FLUSH_FIVE = 12;

    public Play(Player player) {
        this.player = player;
    }

    public int handScore(ArrayList<PlayingCard> cards) {
        // basic hands:

        // high card = 5*1
        // pair = 10*2
        // two pair = 20*2
        // three of a kind = 30*3
        // straight = 30*4
        // flush = 35*4
        // full house = 40*4
        // four of a kind = 60*7
        // straight flush = 100*8
        // royal flush = 100*8

        // secret hands:
        // 5 of a kind = 120*12
        // flush house = 140*14
        // flush five = 160*16

        System.out.println("Cards: " + cards);
        ScoringHand scoringHand = getScoringHandType(cards);
        // triggerCards(scoringHand, cards);
        System.out.println("Scoring Hand: " + scoringHand.getClass().getSimpleName());
        int chips = scoringHand.getChips();
        int multiplier = scoringHand.getMultiplier();
        // TODO add joker handling
        int score = chips * multiplier;
        System.out.println("Score: " + score);
        return score;
    }

    public ScoringHand getScoringHandType(ArrayList<PlayingCard> playedHand) {
        ScoringHand scoringHand = null;
        // check for flush five
        if (playedHand.get(0).getSuit() == playedHand.get(1).getSuit() &&
                playedHand.get(0).getSuit() == playedHand.get(2).getSuit() &&
                playedHand.get(0).getSuit() == playedHand.get(3).getSuit() &&
                playedHand.get(0).getSuit() == playedHand.get(4).getSuit()) {
            scoringHand = new FlushFive(player.getInventory().getFlushFiveLevel());
        }
        // if no match, then it is a high card
        else {
            scoringHand = new HighCard(player.getInventory().getHighCardLevel());
        }
        return scoringHand;
    }

}
