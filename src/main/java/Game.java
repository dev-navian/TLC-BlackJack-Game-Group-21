import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {

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
    public void distributeCardsToPlayer(Player player, int numberOfCards) {

        if (numberOfCards == 2) {
            player.setPlayerCards(
                    List.of(getShuffledCards().get(0), getShuffledCards().get(1))
            );
            // removing the first card from the deck of shuffled cards
            removeCards();
            // removing the second card from the deck of shuffled cards
            removeCards();
        } else if (numberOfCards == 1) {
            player.getPlayerCards().add(getShuffledCards().get(0));
            removeCards();
        } else {
            System.out.println("Cannot give out the stated number of cards");
        }


    }

    // remove cards based on index
    public void removeCards() {
        deck.getDeckOfCards().remove(0);
    }

}
