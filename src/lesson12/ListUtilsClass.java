package lesson12;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListUtilsClass implements ListUtils{
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        LinkedList<String> res = new LinkedList<>();

        for(int i = 0; i< strings.length; i++){
            res.add(strings[i]);
        }
        return res;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        LinkedList<Double> res = new LinkedList<>();
        Collections.sort(data);
        Collections.reverse(data);
        res.addAll(data);
        return res;
    }
}
