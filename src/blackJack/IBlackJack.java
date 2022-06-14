package blackJack;

public interface IBlackJack {
    void dealTwoCardsToAllPlayers();

    void dealRestCardsAllPlayers();

    void printWinner();

    void addPlayerToGame (Player player);
}
