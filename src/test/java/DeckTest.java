import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void confirmingNumberOfCardsInTheDeck() {
        Deck deckOne = new Deck();

        int numberOfCardsInTheDeck = deckOne.getDeckOfCards().size();

        Assertions.assertEquals(52, numberOfCardsInTheDeck, "a deck should have 52 cards");
    }
}