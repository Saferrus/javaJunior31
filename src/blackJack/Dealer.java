package blackJack;

public class Dealer extends Player implements IDealer{
    @Override
    public boolean needsCard() {
        if(this.valuesHand()<18){
            return true;
        }
        return false;
    }
}
