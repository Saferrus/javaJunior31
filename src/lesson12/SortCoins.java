package lesson12;

import java.util.Comparator;
import java.util.TreeSet;

public class SortCoins {
    public static void printSortByYear(TreeSet<Coin> coins) {

        TreeSet<Coin> sorted = new TreeSet<>(new SortByYearComporator());
        sorted.addAll(coins);

        for (Coin c : sorted) {
            System.out.println(c);

        }

    }

    public static void printSortByYearToFrom(TreeSet<Coin> coins) {
        TreeSet<Coin> sorted = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o) {

                if (o1.getYear() != o.getYear()) {
                    return o.getYear() - o1.getYear();
                }

                if (o1.getDiametr() != o.getDiametr()) {
                    return Double.compare(o.getDiametr(), o1.getDiametr());
                }

                if (o1.getNominal() != o.getNominal()) {
                    return o.getNominal() - o1.getNominal();
                }
                if (!o1.getMetall().equals(o.getMetall())) {
                    return o.getMetall().compareTo(o1.getMetall());
                }

                return 0;
            }
        });



        sorted.addAll(coins);

        for (Coin c : sorted) {
            System.out.println(c);

        }
    }
}
