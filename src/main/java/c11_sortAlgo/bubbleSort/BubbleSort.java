package c11_sortAlgo.bubbleSort;

import appMain.SolverAbstract;

public class BubbleSort extends SolverAbstract {

    TabInsert ti = null;

    @Override
    protected void initData() {
        ti = new TabInsert(12);
        ti.insert(40);
        ti.insert(2);
        ti.insert(1);
        ti.insert(6);
        ti.insert(18);
        ti.insert(20);
        ti.insert(29);
        ti.insert(32);
        ti.insert(23);
        ti.insert(34);
        ti.insert(39);
        ti.insert(41);

        ti.insert(100); // nie doda
    }

    @Override
    protected void solve() {
        System.out.println("Before bubble sort");
        ti.printAllElements();
        ti.bubbleSort();
        System.out.println("After bubble sort");
        ti.printAllElements();
    }

}
