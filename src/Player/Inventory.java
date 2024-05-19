package Player;

import Player.Cards.*;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<JokerCard> jokerCards;
    private ArrayList<Card> consumableCards; // spectral, tarot and planet cards

    // TODO add all hand levels
    private int highCardLevel = 1;
    private int flushFiveLevel = 1;

    private int bonusChips = 0;
    private int bonusFlatMultiplier = 0;
    private int bonusMultMultiplier = 0;

    public ArrayList<JokerCard> getJokerCards() {
        return jokerCards;
    }

    public void setJokerCards(ArrayList<JokerCard> jokerCards) {
        this.jokerCards = jokerCards;
    }

    public ArrayList<Card> getConsumableCards() {
        return consumableCards;
    }

    public void setConsumableCards(ArrayList<Card> consumableCards) {
        this.consumableCards = consumableCards;
    }

    public int getHighCardLevel() {
        return highCardLevel;
    }

    public void setHighCardLevel(int highCardLevel) {
        this.highCardLevel = highCardLevel;
    }

    public int getFlushFiveLevel() {
        return flushFiveLevel;
    }

    public void setFlushFiveLevel(int flushFiveLevel) {
        this.flushFiveLevel = flushFiveLevel;
    }

    public int getBonusChips() {
        return bonusChips;
    }

    public void setBonusChips(int bonusChips) {
        this.bonusChips = bonusChips;
    }

    public int getBonusFlatMultiplier() {
        return bonusFlatMultiplier;
    }

    public void setBonusFlatMultiplier(int bonusFlatMultiplier) {
        this.bonusFlatMultiplier = bonusFlatMultiplier;
    }

    public int getBonusMultMultiplier() {
        return bonusMultMultiplier;
    }

    public void setBonusMultMultiplier(int bonusMultMultiplier) {
        this.bonusMultMultiplier = bonusMultMultiplier;
    }
}
