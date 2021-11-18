import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Card card = new Card(Suit.Clubs, Value.EIGHT.getPoints());
        Deck deck = new Deck();
        Dealer dealer = new Dealer();
        // player
        Player player = new Player("Player one");

//        System.out.println(card);
//        System.out.println();
//        System.out.println(deck.getDeckOfCards());
//        System.out.println();
//        System.out.println(deck.getDeckOfCards());
////        System.out.println();
//        System.out.println("Shuffling deck of cards");
//        System.out.println(deck.getDeckOfCards());
//        System.out.println();
//        dealer.shuffleCards();
//        System.out.println("Getting index 0...");
//        System.out.println(dealer.getShuffledCards().get(0));

        System.out.println(player.getPlayerCards());
        dealer.distributeCardsToPlayer(player);
        System.out.println(player.getPlayerCards());

    }

}
