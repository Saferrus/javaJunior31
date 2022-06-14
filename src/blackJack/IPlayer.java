package blackJack;

public interface IPlayer {
    void addCardToHand (Card card);

    boolean needsCard ();

    void openHand ();
}
