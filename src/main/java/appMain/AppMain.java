package appMain;

import c7_QueueImplementation.FIFOTester;

public class AppMain {
    public static void main(String[] args) {
        SolverAbstract sa = new FIFOTester();
        sa.doSolve();

    }
}
