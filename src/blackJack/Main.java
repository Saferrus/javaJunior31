package blackJack;

public class Main {
    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack();
        Player player1 = new Player("Вася");
        Player player2 = new Player("Петя");
        Dealer dealer = new Dealer();

        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);
        blackJack.addPlayerToGame(dealer);

        blackJack.dealTwoCardsToAllPlayers();
        blackJack.dealRestCardsAllPlayers();
        blackJack.printWinner();
    }
}
