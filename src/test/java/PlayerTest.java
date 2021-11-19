import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PlayerTest {

    @Test
    void getTheNumberOfCardsAPlayerHasByDefault() {
        Player playerOne = new Player("Player One");
        List<Card> playerCards = playerOne.getPlayerCards();

        List<Object> emptyList = new ArrayList<>();

        Assertions.assertEquals(emptyList, playerCards, "a player by default should have an empty list of cards");
    }



}