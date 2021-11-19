import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void checkingContentOfACard() {
        Card cardOne = new Card(Suit.Spades, Value.FIVE.getPoints());

        Assertions.assertEquals("Card{" + "suit=" + "Spades" + ", value=" + 5 + '}' , cardOne.toString(), "should output: Card{suit=Spades, value=5}");
    }

}