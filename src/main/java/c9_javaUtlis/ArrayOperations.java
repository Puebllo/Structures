package c9_javaUtlis;

import appMain.SolverAbstract;

import java.util.Arrays;

public class ArrayOperations extends SolverAbstract {

    @Override
    protected void solve() {
    int[] t1 ={1,2,3};
    int[] t2 = {4,5,6,7};

    int t12[] = new int[t1.length+t2.length];
    System.arraycopy(t1,0,t12,0,t1.length);
    System.arraycopy(t2,0,t12,t1.length,t2.length);
        System.out.println(Arrays.toString(t12));
    }
}
