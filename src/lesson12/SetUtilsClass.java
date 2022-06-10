package lesson12;

import java.util.*;

public class SetUtilsClass implements SetUtils {

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        TreeSet<String> res = new TreeSet<>();
        ArrayList<Integer> numbers = new ArrayList<>(collection1);
        Collections.sort(numbers);
        Collections.reverse(numbers);
        String s = String.valueOf(numbers);
        res.add(s);
        res.addAll(set2);
        TreeSet <String> treereverse = new TreeSet<String>();

        treereverse = (TreeSet)res.descendingSet();


        return treereverse;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
        res.add(val1);
        res.add(val2);
        res.add(val3);
        res.add(val4);
        res.add(val5);

        return res;
    }
}
