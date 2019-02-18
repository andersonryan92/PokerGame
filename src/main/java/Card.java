import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Card {

    private final Rank rank;
    private final Suit suit;

    public Card(final Rank rank, final Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    private final static Map<String, Card> CARD_CACHE = initCache();

    private static Map<String, Card> initCache() {
        final Map<String, Card> cache = new HashMap<String, Card>();
        for (final Suit suit : Suit.values()) {
            for (final Rank rank : Rank.values()) {
                cache.put(cardKey(rank, suit), new Card(rank, suit));
            }
        }
        return Collections.unmodifiableMap(cache);
    }

    static Card getCard(final Rank rank, final Suit suit) {
        final Card card = CARD_CACHE.get(cardKey(rank, suit));
        if (card != null) {
            return card;
        }
        throw new RuntimeException("Invalid card ! " + rank + " " + suit);
    }

    public Rank getRank() {
        return this.rank;
    }

    public int getRankValue(){
        return rank.getRankValue();
    }

    public Suit getSuit() {
        return this.suit;
    }

    private static String cardKey(final Rank rank, final Suit suit) {
        return rank + " of " + suit;
    }












    public static String formatCard(String rank, String suit){
        return rank + " of " + suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.rank, this.suit);
    }

}
