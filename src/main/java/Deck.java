import java.util.ArrayList;

public class Deck {


    public Deck() {

    }

    public ArrayList<Card> getDeck(){

        ArrayList<Card> theDeck = new ArrayList<Card>();

        int counter = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                theDeck.add(Card.getCard(Rank.getRank(j), Suit.getSuit(i)));
                counter++;
            }
        }
        return theDeck;
    }
}
