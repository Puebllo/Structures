package c7_StackImplementation;

import appMain.SolverAbstract;

public class StackTester extends SolverAbstract {

    @Override
    protected void solve() {

        StackImpl<String> stackI = new StackImpl<>(3);
        System.out.println("Stack capacity = " + stackI.capacity());
        System.out.println("Stack size = " + stackI.size());

        stackI.push("Mario");
        stackI.push("Wario");
        stackI.push("Luigi");

        System.out.println("Stack size = " + stackI.size());
        System.out.println("Stack elements = " + stackI.toString());

        String poppedElement = stackI.pop();
        System.out.println("Popped element = " + poppedElement);

        System.out.println("Stack size = " + stackI.size());
        System.out.println("Stack elements = " + stackI.toString());

        stackI.push("Bowser");
        stackI.push("Peach");

        System.out.println("Stack size = " + stackI.size());
        System.out.println("Stack elements = " + stackI.toString());

        System.out.println("Clear stack");
        stackI.clear();

        System.out.println("Stack size = " + stackI.size());
        System.out.println("Stack elements = " + stackI.toString());
    }
}
