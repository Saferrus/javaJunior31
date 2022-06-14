package blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean canWin = true;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    @Override
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    @Override
    public boolean needsCard() {
        System.out.println("--------------Ваши карты:  -----------");
        this.openHand();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нужна ли карта?");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("да")){
            return true;
        }
        return false;
    }

    @Override
    public void openHand() {
        for (Card c : hand) {
            System.out.println(c);
        }
    }

    public int valuesHand (){
        int res = 0;
        for(Card c:hand){
            res =res+c.getValue();

        }
        return  res;
    }
}
