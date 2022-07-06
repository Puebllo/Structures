package c1_recursion;

import appMain.SolverAbstract;

public class GCD extends SolverAbstract {

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void solve() {
        int a = 62;
        int b = 30;

        System.out.println("GCD for "+a+" and "+b+" is = "+ gcdPerfect(a,b));
    }

    //Greatest Common Divisor - my shitty implementation
    private int gcd(int a, int b) {
        //there's no gcd other than 1
        if (a<b){
            return 1;
        }
        int rest = a-b;
        if (rest != b){
           return gcd(rest,b);
        }
        return rest;
    }

    private int gcdPerfect(int a, int b) {
        if (b>a){
            return gcdPerfect(a,b-a);
        }
        if (b<a){
            return gcdPerfect(a-b,b);
        }
        else {
            return b;
        }
    }
}
