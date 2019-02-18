public class Player {

    private Card cardOne;
    private Card cardTwo;

    public Player(Card cardOne, Card cardTwo) {
        this.cardOne = cardOne;
        this.cardTwo = cardTwo;
    }

    public Card getCardOne() {
        return cardOne;
    }

    public void setCardOne(Card cardOne) {
        this.cardOne = cardOne;
    }

    public Card getCardTwo() {
        return cardTwo;
    }

    public void setCardTwo(Card cardTwo) {
        this.cardTwo = cardTwo;
    }

    public String getCards(){
        return cardOne.toString()  + " | " + cardTwo.toString();
    }

    public int getTotalCardValue(Card cardOne, Card cardTwo){
        return cardOne.getRankValue() + cardTwo.getRankValue();
    }


}
