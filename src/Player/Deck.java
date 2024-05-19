package Player;

import Player.Cards.Card;
import Player.Cards.PlayingCard;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<PlayingCard> cards;

    public Deck() {
        this.cards = new ArrayList<PlayingCard>();
        initializeDeck();
    }

    private void initializeDeck() {
        // initialize the deck
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                cards.add(new PlayingCard(i, j));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public PlayingCard draw() {
        // pop a card from the deck
        return cards.remove(0);
    }

    public void addCard(Card card) {
        // add a card to the deck
        cards.add((PlayingCard) card);
    }

    public void removeCard(Card card) {
        // remove a card from the deck by card
        cards.remove(card);
    }

    public void removeCard(int index) {
        // remove a card from the deck by index
        cards.remove(index);
    }

    public Card getCard(int index) {
        // get a card from the deck
        return null;
    }

    public int getSize() {
        return cards.size();
    }

    public ArrayList<PlayingCard> getCards() {
        return cards;
    }

    public void setCards(ArrayList<PlayingCard> cards) {
        this.cards = cards;
    }

    public String toString() {
        String result = "";
        for (PlayingCard card : cards) {
            result += (card.getName() + " ");
        }
        return result;
    }

}
