public class Hands {




    public int calculateStartingHand(Card card1, Card card2){
        int points = 0;

        if (isPair(card1, card2)){
            points += 10;
        }

        Rank rank1 = card1.getRank();
        Rank rank2 = card2.getRank();

        int cardOneValue = rank1.getRankValue();
        int cardTwoValue = rank2.getRankValue();

        points += cardOneValue + cardTwoValue;

        return points;
    }

    public boolean isPair(Card card1, Card card2){

        if(card1.getRank().equals(card2.getRank())){
            return true;
        }
        return false;
    }

    public int getTotalValue(Card card1, Card card2){
        return card1.getRankValue() + card2.getRankValue();
    }

}
