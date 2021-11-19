import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> playerCards;
    private PlayerStatus playerStatus;

    public Player(String name) {
        this.name = name;
        this.playerCards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(List<Card> playerCards) {
        this.playerCards = playerCards;
    }

    public PlayerStatus getPlayerStatus() {
        return playerStatus;
    }

    public void setPlayerStatus(PlayerStatus playerStatus) {
        this.playerStatus = playerStatus;
    }

    public void addCardToPlayerCards(Card card) {
        this.playerCards.add(card);
    }
}
