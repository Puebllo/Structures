package c1_recursion;

import appMain.SolverAbstract;

import java.util.HashMap;

public class Fibonacci extends SolverAbstract {

    HashMap<Integer,Integer> fiboCache = new HashMap<>();

    int[] fiboCacheArray = new int[10000];
    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void solve() {
        //============= CLASSIC FIBO ====================
/*
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 46; i++){
            System.out.println("Fibonacci ["+i+"] = " + doFibonacci(i));
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Normal Fibonacci time = " + elapsed + "ms");
*/

        //============= CACHED FIBO HASHMAP ====================
/*        long start2 = System.currentTimeMillis();
        for (int i = 0 ; i < 9000; i++){
            System.out.println("Cached Fibonacci HM ["+i+"] = " + doFibonacciWithCache(i));
        }
        long elapsed2 = System.currentTimeMillis() - start2;
        System.out.println("Cached Fibonacci HM time = " + elapsed2 + "ms");*/

        //============= CACHED FIBO ARRAY ====================
        long start3 = System.currentTimeMillis();
        for (int i = 0 ; i < 9000; i++){
            System.out.println("Cached Fibonacci Array ["+i+"] = " + doFibonacciWithCacheArray(i));
        }
        long elapsed3 = System.currentTimeMillis() - start3;
        System.out.println("Cached Fibonacci Array time = " + elapsed3 + "ms");
    }

    private int doFibonacci(int val) {
        if (val < 2){
            return val;
        }else{
           return doFibonacci(val -1) + doFibonacci(val -2);
        }
    }

    private int doFibonacciWithCache(int val) {
        if (fiboCache.containsKey(val)){
            return fiboCache.get(val);
        }
        int res;
        if (val < 2){
            res = val;
        }else{
            res = doFibonacciWithCache(val -1) + doFibonacciWithCache(val -2);
        }
        fiboCache.put(val, res);
        return res;
    }

    private int doFibonacciWithCacheArray(int val) {

        int res = 0;
        if (fiboCacheArray[val] != 0) {
            return fiboCacheArray[val];
        }
        if (val < 2){
            res = val;
        }else{
            res = doFibonacciWithCache(val -1) + doFibonacciWithCache(val -2);
        }
        fiboCacheArray[val] = res;
        return res;
    }



}
