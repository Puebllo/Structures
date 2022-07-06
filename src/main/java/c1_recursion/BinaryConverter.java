package c1_recursion;

import appMain.SolverAbstract;

public class BinaryConverter extends SolverAbstract {

    int number = 13;
    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void solve() {
        decToBin(number);
    }

    private void decToBin(int number) {
        if (number !=0){
            decToBin(number/2);
            System.out.println(number%2);
        }else {
            System.out.println("0");
        }
    }
}
