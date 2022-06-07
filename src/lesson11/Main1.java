package lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> first = new LinkedHashSet<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(3);
        second.add(4);
        second.add(5);
        second.add(6);
        second.add(7);

        Collections result = new Collections();

        System.out.println(result.intersection(first,second));




    }
}
