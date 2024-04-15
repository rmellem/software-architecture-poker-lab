package us.mattgreen.poker;

import java.util.Arrays;

/**
 * This is a utility class consisting of static methods to determine if a hand matches a specific
 * @author  Dr. Green
 * @version 1.0
 */
public class Game {
    /**
     *
     * @param cards An Array of Card
     * @return True if there are two of a kind and false if not
     */
    public static boolean twoOfAKind(Card[] cards) {
        Arrays.sort(cards, (a, b) -> a.getFace().compareTo(b.getFace()));
        //int numberOFmatches = 0;
        for(int i=0;i < cards.length-1; i++) {
            if (cards[i].getFace().equals(cards[i+1].getFace())) return true;
        }
        return false;
    }

    public static boolean fourOfAKind(Card[] cards){
        Arrays.sort(cards, (a, b) -> a.getFace().compareTo(b.getFace()));
        try{
            for(int i=0;i < cards.length-1; i++) {
                if (cards[i].getFace().equals(cards[i+3].getFace())) return true;
            }
            return false;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            return false;
        }
    }

    public static boolean flush(Card[] cards){
        Arrays.sort(cards, (a, b) -> a.getSuit().compareTo(b.getSuit()));
        try{
            for(int i = 0; i< cards.length; i++) {
                if (cards[i].getSuit().equals(cards[i+4].getSuit())) return true;
            }
            return false;
        }
        catch (ArrayIndexOutOfBoundsException exception){
            return false;
        }
    }

    public static boolean ThreeOfAKind(Card[] cards){
        Arrays.sort(cards, (a, b) -> a.getFace().compareTo(b.getFace()));
        try{
            for(int i=0;i < cards.length-1; i++) {
                if (cards[i].getFace().equals(cards[i+2].getFace())) return true;
            }
            return false;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            return false;
        }
    }


}
