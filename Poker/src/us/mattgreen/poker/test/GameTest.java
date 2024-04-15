package us.mattgreen.poker.test;

import org.junit.Before;
import org.junit.Test;
import us.mattgreen.poker.Card;
import us.mattgreen.poker.Game;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static us.mattgreen.poker.Face.*;
import static us.mattgreen.poker.Suit.*;

public class GameTest {
    private Card[] hand;
    private Card[] loserHand;
    private Card[] threeHand;
    private Card[] fourHand;
    private Card[] flushHand;
    private Card[] straightHand;

    @Before
    public void setUp() {
        hand = new Card[]{new Card(JACK,CLUBS, 11), new Card(FIVE,CLUBS, 5), new Card(JACK,SPADES, 11)};
        loserHand = new Card[]{new Card(JACK,CLUBS, 11), new Card(FIVE,DIAMONDS, 5), new Card(QUEEN,SPADES, 12),new Card(TEN,HEARTS, 10),new Card(TWO,CLUBS, 2)};
    }

    @Test
    public void twoOfAKindTest() {

        assertTrue("Two of a kind should have matched",Game.twoOfAKind(hand));
        assertFalse("Two of a kind should not have matched",Game.twoOfAKind(loserHand));
    }

    @Test
    public void threeOfAKindTest(){
        threeHand = new Card[]{new Card(SIX,CLUBS, 6), new Card(FIVE,CLUBS, 5), new Card(SIX,SPADES, 6), new Card(JACK,HEARTS, 11), new Card(SIX,DIAMONDS, 6)};
        assertTrue("Three of a kind should have matched",Game.ThreeOfAKind(threeHand));
        assertFalse("Three of a kind should not have matched",Game.ThreeOfAKind(loserHand));
    }

    @Test
    public void fourOfAKindTest(){
        fourHand = new Card[]{new Card(JACK,CLUBS, 11), new Card(FIVE,CLUBS, 5), new Card(JACK,SPADES, 11), new Card(JACK,HEARTS, 11), new Card(JACK,DIAMONDS, 11)};
        assertTrue("Four of a kind should have matched",Game.fourOfAKind(fourHand));
        assertFalse("Four of a kind should not have matched",Game.fourOfAKind(loserHand));
    }

    @Test
    public void flushTest(){
        flushHand = new Card[]{new Card(EIGHT,HEARTS, 8), new Card(FIVE,HEARTS, 5), new Card(TWO,HEARTS, 2), new Card(JACK,HEARTS, 11), new Card(SEVEN,HEARTS, 7)};
        assertTrue("Flush should have matched",Game.flush(flushHand));
        assertFalse("Flush should not have matched",Game.flush(loserHand));
    }


}
