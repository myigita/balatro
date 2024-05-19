package Player.ScoringHandTypes;

import Player.Cards.PlayingCard;

import java.util.ArrayList;

public abstract class ScoringHand { // abstract class
    private int level = 0;
    private String name;
    private int multiplier;
    private int chips;

    public void setChips(int chips) {
        this.chips = chips;
    }

    public int getChips() {
        return chips;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
