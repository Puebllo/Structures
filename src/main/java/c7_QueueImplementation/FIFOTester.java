package c7_QueueImplementation;

import appMain.SolverAbstract;

public class FIFOTester extends SolverAbstract {

    @Override
    protected void solve() {

        FIFO<String> fifoI = new FIFO<>(3);

        fifoI.offer("Mario");
        fifoI.offer("Luigi");
        fifoI.offer("Wario");

        System.out.print("Queue elements = ");
        fifoI.printElements();
        System.out.println();
        System.out.println("Queue poll = " + fifoI.poll());
        System.out.println("Queue poll = " + fifoI.poll());

        System.out.print("Queue elements = ");
        fifoI.printElements();
        System.out.println();

        fifoI.offer("Peach");
        fifoI.offer("Bowser");
        fifoI.offer("Kirby");

        System.out.print("Queue elements = ");
        fifoI.printElements();
        System.out.println();

        System.out.println("Peek at first queue element = " + fifoI.peek());


    }
}
