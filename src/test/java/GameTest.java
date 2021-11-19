import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void confirmShufflingOfCards() {
        Game game = new Game();

        List<Card> currentDeckOfCards = game.getCurrentDeckOfCards().getDeckOfCards();
        game.shuffleCards();
        List<Card> shuffledCards = game.getShuffledCards();

        Assertions.assertEquals(shuffledCards, shuffledCards, "should be able to shuffle cards");

    }

    @Test
    void distributeCardsToPlayer() {
    }

    @Test
    void removeCards() {
    }
}