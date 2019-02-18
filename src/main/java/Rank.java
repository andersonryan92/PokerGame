public enum Rank{
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    public final int rankValue;

    Rank(final int rankValue) {
        this.rankValue = rankValue;
    }

    public int getRankValue() {
        return this.rankValue;
    }


    public static Rank getRank(int n){

        if(n == 0){
            return Rank.TWO;
        } else if(n == 1){
            return Rank.THREE;
        } else if(n == 2){
            return Rank.FOUR;
        } else if(n == 3){
            return Rank.FIVE;
        } else if(n == 4){
            return Rank.SIX;
        } else if(n == 5){
            return Rank.SEVEN;
        } else if(n == 6){
            return Rank.EIGHT;
        } else if(n == 7){
            return Rank.NINE;
        } else if(n == 8){
            return Rank.TEN;
        } else if(n == 9){
            return Rank.JACK;
        } else if(n == 10){
            return Rank.QUEEN;
        } else if(n == 11){
            return Rank.KING;
        } else if(n == 12){
            return Rank.ACE;
        }

        return null;
    }

}