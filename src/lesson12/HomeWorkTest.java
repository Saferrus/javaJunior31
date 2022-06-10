package lesson12;

import java.util.*;

public class HomeWorkTest {
    public static void main(String[] args) {
        ListUtilsClass string = new ListUtilsClass();
        System.out.println(string.asList("mana-mana","paaaap-pap-pababp","mana-mana"));
        System.out.println("_______________________________________");

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(3.0);
        numbers.add(5.0);
        numbers.add(7.0);
        numbers.add(9.0);
        numbers.add(2.0);
        numbers.add(4.0);
        numbers.add(6.0);
        numbers.add(8.0);
        ListUtilsClass res = new ListUtilsClass();
        System.out.println(res.sortedList(numbers));
        System.out.println("_______________________________________");



        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(3);
        numbers1.add(5);
        numbers1.add(7);
        numbers1.add(9);
        numbers1.add(2);
        numbers1.add(4);
        numbers1.add(6);
        numbers1.add(80);


        HashSet<String> string1 = new HashSet<>();
        string1.add("bbbb");
        string1.add("aaaa");
        string1.add("cccc");

        SetUtilsClass res1 = new SetUtilsClass();
        System.out.println(res1.orderedSet(numbers1,string1));

        System.out.println("______________________________________");
        SetUtilsClass res2 = new SetUtilsClass();
        System.out.println(res2.customOrderSet(10,2,7,1,9));


    }
}
