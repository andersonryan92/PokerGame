import java.util.*;

public class Main {


    public static void main(String[] args) {

        Deck deck = new Deck();
        Hands hands = new Hands();

        ArrayList<Card> deckArray = deck.getDeck();

        Collections.shuffle(deckArray);

//        for (int i = 0; i < deckArray.size(); i++) {
//            System.out.println(deckArray.get(i) + " " + i);
//        }

        System.out.println(" ");
        System.out.println(" ");

        ArrayList<Player> dealtPlayers = dealShuffledCardsToPlayers(9, deckArray);

        int i = 1;
        for (Player player: dealtPlayers) {
            boolean hmm = hands.isPair(player.getCardOne(), player.getCardTwo());
            int total = player.getTotalCardValue(player.getCardOne(), player.getCardTwo());
            String playerCards = String.format("Player %d: " + player.getCards() + " " + hmm + " " + total, i);
            System.out.println(playerCards);


            i++;
        }
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 'Yes' for the flop");
        String answer = scanner.next();

        System.out.println(" ");

        if(answer.equalsIgnoreCase("yes")){
            printTheFlop(deckArray, 9);
        }

        hands.calculateStartingHand(dealtPlayers.get(0).getCardOne(), dealtPlayers.get(0).getCardTwo());



    }


    public static ArrayList<Player> dealShuffledCardsToPlayers(int numPlayers, ArrayList<Card> arr){

        ArrayList<Player> players = new ArrayList<Player>();
        Player playerObject;

        for (int i = 0; i < numPlayers; i++) {
            playerObject = new Player(arr.get(i), arr.get(i + numPlayers));
            players.add(playerObject);
        }
        return players;
    }

    public static void printTheFlop(ArrayList<Card> arr, int numPlayers){

        int startAt = (numPlayers * 2) + 1;

        for (int i = startAt; i < startAt + 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}
