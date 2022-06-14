package blackJack;

import java.util.ArrayList;

public class BlackJack implements IBlackJack {

    private ArrayList<Player> players = new ArrayList<>();
    private Koloda koloda = new Koloda();

    @Override
    public void dealTwoCardsToAllPlayers() {
        for (Player p : players) {
            p.addCardToHand(koloda.getRandomCard());
            p.addCardToHand(koloda.getRandomCard());
        }
    }


    @Override
    public void dealRestCardsAllPlayers() {
        for (Player p : players) {
            while (p.needsCard()) {
                p.addCardToHand(koloda.getRandomCard());
            }
        }

    }

    @Override
    public void printWinner() {
        /**
         * 21 21 21 24
         * !!!!!!!22 23 24 25 крупье
         * 19 19 16 18  19 -19
         * 18 12 20 23  20
         */

        for (Player p : players) {
            if (p.valuesHand() > 21) {
                p.setCanWin(false);
            }
        }

        if (countPlayersCanWin() == 0) {
            for (Player p : players) {
                if (p instanceof Dealer) {
                    System.out.println("-----ВЫЙГРАЛ КРУПЬЕ-------");
                    p.openHand();
                    return;
                }
            }
        }
        //Проходимся и узнаем бал победителя.
        int valueWinner = 0;
        for (Player p1 : players) {
            if (p1.isCanWin() && p1.valuesHand() > valueWinner) {
                valueWinner = p1.valuesHand();

            }
        }

        for (Player p : players) {
            if (p.valuesHand() == valueWinner) {
                System.out.println("------WINNER------" + p.getName());
                p.openHand();
            }
        }
    }


    @Override
    public void addPlayerToGame(Player player) {
        players.add(player);

    }

    private int countPlayersCanWin() {
        int count = 0;
        for (Player p : players) {
            if (p.isCanWin()) {
                count++;
            }
        }
        return count;
    }
}
