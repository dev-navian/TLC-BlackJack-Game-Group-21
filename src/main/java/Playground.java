public class Playground {

    public static void main(String[] args) {
        Game game = new Game();

        game.dealCardsToPlayer(game.playersInTheGame.get(0), 2);
        game.dealCardsToPlayer(game.playersInTheGame.get(1), 2);
        game.dealCardsToPlayer(game.playersInTheGame.get(2), 2);
        // think of automating the above in one method

        game.evaluatePlayerScores();
    }
}
