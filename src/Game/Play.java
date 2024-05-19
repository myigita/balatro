package Game;

import Player.Cards.PlayingCard;

import java.util.ArrayList;

public class Play {

    public static int countScore(ArrayList<PlayingCard> cards) {
        int chips = 0;
        int multiplier = 1;
        int score = 0;
        System.out.println("Cards: " + cards);
        // check for pairs
        for (int i = 0; i < cards.size(); i++) {
            for (int j = i + 1; j < cards.size(); j++) {
                if (cards.get(i).getRank() == cards.get(j).getRank()) {
                    System.out.println("Pair: " + cards.get(i).getRankString() + " " + cards.get(j).getRankString());
                    chips = 15;
                    chips += cards.get(i).getValue();
                    multiplier = 2;
                    score += chips * multiplier;
                }
            }
        }
        System.out.println("Score: " + score);
        return score;
    }
}
