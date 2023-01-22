package c9_javaUtlis;

import appMain.SolverAbstract;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsIterators extends SolverAbstract {

    @Override
    protected void solve() {
        LinkedList<String> names = new LinkedList<>();
        names.add("Chandler"); names.add("Joey"); names.add("Pheebs"); names.add("Rachel"); names.add("Monica"); names.add("Ross");

        System.out.println("==== FORWARD ITERATION =====");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("==== BACKWARD ITERATION =====");
        Iterator<String> iteratorDesc = names.descendingIterator();
        while (iteratorDesc.hasNext()){
            String name = iteratorDesc.next();
            System.out.println(name);
        }

        System.out.println("==== remove last (current) element from names =====");
        iteratorDesc.remove();
        System.out.println(names);


    }
}
