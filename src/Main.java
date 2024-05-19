import Game.*;
import Player.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Player 1");

        Deck testDeck = new Deck();
//        testDeck.initialize();
//        testDeck.shuffle();

        testDeck.DEBUGfillDeckWithCard(0, 1);

        Hand testHand = new Hand(testDeck);
        System.out.println(testHand);
        testHand.discard(0);
        System.out.println(testHand);

        int[] cards = {0,1,2,3,4};
        Play play = new Play(player);
        play.handScore(testHand.playCards(cards));
        }
    }