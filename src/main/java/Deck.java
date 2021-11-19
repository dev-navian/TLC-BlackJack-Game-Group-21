import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deckOfCards;

    public Deck() {
        this.deckOfCards = new ArrayList<>();

        for (Suit s: Suit.values()) {
            for (Value v: Value.values()) {
                this.deckOfCards.add(new Card(s, v.getPoints()));
            }
        }
    }

    // get deck of cards
    public List<Card> getDeckOfCards() {
        return this.deckOfCards;
    }

}
