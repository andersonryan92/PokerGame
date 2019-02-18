public enum Suit {

    DIAMONDS(1),
    CLUBS(2),
    HEARTS(3),
    SPADES(4);

    private final int suitValue;

    Suit(final int suitValue) {
        this.suitValue = suitValue;
    }

    public int getSuitValue() {
        return this.suitValue;
    }

    public static Suit getSuit(int n){
        if(n == 0){
            return Suit.SPADES;
        } else if(n == 1){
            return Suit.CLUBS;
        } else if(n == 2){
            return Suit.HEARTS;
        } else if (n == 3){
            return Suit.DIAMONDS;
        }
        return null;
    }
}
