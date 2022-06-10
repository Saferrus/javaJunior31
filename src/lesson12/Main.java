package lesson12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10, 4.5, 1900, "������");
        Coin coin2 = new Coin(10, 4.5, 1900, "������");
        Coin coin3 = new Coin(5, 5.2, 1912, "�������");
        Coin coin4 = new Coin(1, 3.8, 1886, "����");

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);



//        for(Coin c:coins){
//            System.out.println(c);
//        }

        // ��� �� ������ �������� ���������, ������ �������.
        //m� ������� ��������� ����� ������ �� ��� �� ����� ������� ��� ��

        for (Iterator<Coin> iter = coins.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }

        System.out.println("---------------------------------------------------------");

        SortCoins.printSortByYear(coins);

        System.out.println("---------------------------------------------------------");

        SortCoins.printSortByYearToFrom(coins);

    }
}
