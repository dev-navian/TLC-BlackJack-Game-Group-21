import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Card card = new Card(Suit.Clubs, Value.EIGHT.getPoints());
        Deck deck = new Deck();
        Game game = new Game();
        // player
        Player playerOne = new Player("Player one");
        Player playerTwo = new Player("Player two");

        System.out.println(deck.getDeckOfCards());
        System.out.println();
        System.out.println("Shuffling deck of cards");
        game.shuffleCards();
        System.out.println(game.getShuffledCards());
        System.out.println();
//        System.out.println("Getting index 0...");
//        System.out.println(game.getShuffledCards().get(0));
        System.out.println();
        System.out.println("getting player one cards...");
        game.distributeCardsToPlayer(playerOne, 2);
        System.out.println(playerOne.getPlayerCards().stream().mapToInt(Card -> Card.getValue()).sum());
//        System.out.println("getting player one cards...");
//        System.out.println(playerOne.getPlayerCards());
//        System.out.println();
//        System.out.println("getting shuffled cards...");
//        System.out.println(game.getShuffledCards());

        System.out.println();
        System.out.println("**********");
        game.distributeCardsToPlayer(game.playersInTheGame.get(0), 2);
        System.out.println("getting the number of cards in Player One's possession");
        System.out.println(game.playersInTheGame.get(0).getPlayerCards());
//        System.out.println("getting player two cards...");
//        System.out.println(playerTwo.getPlayerCards());
//        System.out.println();
//        System.out.println("printing the deck of shuffled cards...");
//        System.out.println(game.getShuffledCards());

//        System.out.println();
//        List<Integer> collect = ThreadLocalRandom.current().ints(0, 20).distinct().limit(21).boxed().toList();
//        System.out.println(collect);

    }

}
