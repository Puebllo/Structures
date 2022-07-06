package c6_LinkedList;


import appMain.SolverAbstract;
import c6_LinkedList.model.ELEMENT;
import c6_LinkedList.model.LinkedList;

public class LinkedListTester extends SolverAbstract {

    int data[] = {};
    int singleData[] = {};
    LinkedList ll = new LinkedList();
    LinkedList ll2 = new LinkedList();

    @Override
    protected void initData() {
        data = new int[]{21,37,9,11,4,20};
        singleData = new int[]{21};
    }

    @Override
    protected void solve() {
        for (int ele:data) {
            ll.addNewElement(ele);
        }
        System.out.print("Zawartosc ll = "); ll.printElements(); System.out.println();

        int valSearch = 21;
        ELEMENT search = ll.getElementByValue(valSearch);
        if (search!=null){
            System.out.println("znaleziono element o wartosci  =" + search.getValue() + " REF=["+Integer.toHexString(System.identityHashCode(search))+"]");
        }else{
            System.out.println("nie znaleziono elementu o wartosci  =" + valSearch+ " REF=["+Integer.toHexString(System.identityHashCode(search))+"]");
        }

        int newSortedVal = 5;
        ll.addSortedElementASC(newSortedVal);

        System.out.print("Zawartosc ll = "); ll.printElements(); System.out.println();

        for (int ele:data) {
            ll2.addSortedElementASC(ele);
        }
        System.out.print("Zawartosc ll2 = "); ll2.printElements(); System.out.println();

        System.out.println("RemoveFirst");
        ll2.removeFirst();
        System.out.print("Zawartosc ll2 = "); ll2.printElements(); System.out.println();

        System.out.println("RemoveLast");
        ll2.removeLast();
        System.out.print("Zawartosc ll2 = "); ll2.printElements(); System.out.println();

    }
}
