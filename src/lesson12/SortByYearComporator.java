package lesson12;

import java.util.Comparator;

public class SortByYearComporator implements Comparator<Coin> {

    @Override
    public int compare(Coin o1, Coin o) {

        if(o1.getYear() != o.getYear()){
            return o1.getYear() - o.getYear();
        }

        if (o1.getDiametr() != o.getDiametr()){
            return Double.compare(o1.getDiametr(), o.getDiametr());
        }

        if (o1.getNominal() != o.getNominal()) {
            return o1.getNominal()-o.getNominal();
        }

        if(!o1.getMetall().equals(o.getMetall())){
            return o1.getMetall().compareTo(o.getMetall());
        }
        return 0;
    }
}
