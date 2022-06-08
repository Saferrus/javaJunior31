package lesson11;

import java.util.*;

public class Collections implements CollectionUtils {
    private Collection<Integer> collection;

    public Collections() {

    }

    public Collections(Collection<Integer> numbers) {
        this.collection = numbers;
    }

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> res = new ArrayList<>();
        res.addAll(a);
        res.addAll(b);

        return res;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> res = new LinkedList<>();
        HashSet<Integer> c = new HashSet<>();
        c.addAll(a);
        c.removeAll(b);
        a.removeAll(c);

        c.clear();
        c.addAll(b);
        c.removeAll(a);
        b.removeAll(c);


        res.addAll(a);
        res.addAll(b);
        return res;

    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
        res.addAll(a);
        res.addAll(b);
        return res;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }
}
