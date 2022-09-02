package com.aman.recursion;

public class FactorialOfN {
    public static void main(String[] args) {
        int n=6;
        int f = factN(n);
        System.out.println(f);
    }

    private static int factN(int n) {
        if(n<=1){
            return 1;
        }

        return n*factN(n-1);
    }
}
