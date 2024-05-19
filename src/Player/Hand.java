package Player;

import Player.Cards.PlayingCard;

import java.util.ArrayList;

public class Hand {
    private int handSize = 8;
    private ArrayList<PlayingCard> hand;
    private Deck deck;

    public Hand(Deck deck) {
        this.deck = deck;
        this.hand = new ArrayList<>();
        while (hand.size() < handSize) {
            hand.add(deck.draw());
        }
    }

    public void draw(int index) {
        hand.add(index, deck.draw());
    }

    public void discard(int index) {
        hand.remove(index);
        // draw a new card to replace the discarded card
        draw(index);
    }

    public void discard(PlayingCard card) {
        hand.remove(card);
    }

    public PlayingCard getCard(int index) {
        return hand.get(index);
    }

    public int getSize() {
        return hand.size();
    }

    public ArrayList<PlayingCard> getHand() {
        return hand;
    }

    public void setHandSize(int handSize) {
        this.handSize = handSize;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void setHand(ArrayList<PlayingCard> hand) {
        this.hand = hand;
    }

    public int getHandSize() {
        return handSize;
    }

    public Deck getDeck() {
        return deck;
    }

    public String toString() {
        String handString = "";
        for (PlayingCard card : hand) {
            handString += card.getRankString() + " of " + card.getSuitString() + "\n";
        }
        return handString;
    }

    public ArrayList<PlayingCard> playCards(int[] indices) {
        ArrayList<PlayingCard> cards = new ArrayList<>();
        for (int index : indices) {
            cards.add(hand.get(index));
            discard(index);
        }
        return cards;
    }
}
