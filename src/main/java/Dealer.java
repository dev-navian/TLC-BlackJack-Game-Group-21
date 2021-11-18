import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Random.*;
import java.util.stream.IntStream;

public class Dealer {

    private Deck deck = new Deck();

    // shuffle cards
    // shuffling of cards should only be done at the beginning of the game
    public void shuffleCards() {
        Collections.shuffle(deck.getDeckOfCards());
    }

    // get the shuffled cards
    public List<Card> getShuffledCards() {
      return deck.getDeckOfCards();
    }

    // distributing the cards (Player)
    public void distributeCardsToPlayer(Player player) {
//        int randomOne = (int) Math.ceil(Math.random()*(51+1)+0);
//        int randomTwo = (int) Math.ceil(Math.random()*(51+1)+0);
        Random random = new Random();
        int randomNumberOne = random.nextInt(52);
        int randomNumberTwo = random.nextInt(52);

        player.setPlayerCards(
                List.of(getShuffledCards().get(randomNumberOne), getShuffledCards().get(randomNumberTwo))
        );

    }

}
