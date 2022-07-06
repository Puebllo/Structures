package c6_DoublyLinkedList;

import appMain.SolverAbstract;
import c6_DoublyLinkedList.model.DoublyElement;
import c6_DoublyLinkedList.model.DoublyLinkedList;
import c6_DoublyLinkedList.model.MockDTO;

public class DoublyTester extends SolverAbstract {

    DoublyLinkedList dll = null;

    @Override
    protected void initData() {
        dll = new DoublyLinkedList();
    }

    @Override
    protected void solve() {
        MockDTO md = new MockDTO("john","test@test.com", 2137L);
        dll.add(md);
        md = new MockDTO("george" , "test@tset.com", 6435432L);
        dll.add(md);
        md = new MockDTO("smith" , "smith@tset.com", 987567L);
        dll.add(md);
        md = new MockDTO("jack" , "jack@tset.com", 12622345L);
        dll.add(md);
        md = new MockDTO("fred" , "fred@tset.com", 463782L);
        dll.add(md);

        System.out.println("dll count = " + dll.count());
        System.out.print("Elements = " );
        dll.printElements();
        System.out.println();

        System.out.print("Elements Backwards = " );
        dll.printElementsBackwards();
        System.out.println();

        String login = "jack";

        System.out.println("Removing "+ login + " = " +  dll.removeByName(login));

        System.out.println("dll count = " + dll.count());
        System.out.print("Elements = " );
        dll.printElements();
        System.out.println();

        login = "john";
        System.out.println("Removing "+ login + " = " +  dll.removeByName(login));

        System.out.println("dll count = " + dll.count());
        System.out.print("Elements = " );
        dll.printElements();
        System.out.println();

        login = "fred";
        System.out.println("Removing "+ login + " = " +  dll.removeByName(login));

        System.out.println("dll count = " + dll.count());
        System.out.print("Elements = " );
        dll.printElements();
        System.out.println();


        login = "dupa";
        System.out.println("Removing "+ login + " = " +  dll.removeByName(login));

        System.out.println("dll count = " + dll.count());
        System.out.print("Elements = " );
        dll.printElements();
        System.out.println();


    }
}
