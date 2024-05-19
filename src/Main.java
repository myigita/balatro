import Game.Play;
import Player.Deck;
import Player.Hand;

public class Main {
    public static void main(String[] args) {
        Deck testDeck = new Deck();
        testDeck.shuffle();
        //System.out.println(testDeck);
        Hand testHand = new Hand(testDeck);
        System.out.println(testHand);
        testHand.discard(0);
        System.out.println(testHand);
        int[] cards = {0,1,2,3,4};
        Play.countScore(testHand.playCards(cards));
        }
    }