package Player.ScoringHandTypes;

import Player.Cards.PlayingCard;

import java.util.ArrayList;

public class HighCard extends ScoringHand{
    private int level = 0;
    private int multiplier = 1 + (level * 1);
    private int chips = 5 + (level * 10);

    public HighCard(int level) {
        super();
        super.setLevel(level);
        super.setChips(chips);
        super.setMultiplier(multiplier);
    }
}
