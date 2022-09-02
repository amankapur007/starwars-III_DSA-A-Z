package com.aman.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=6;
        System.out.print("0 1 ");
        fibo(0, 1, n-2);
    }

    private static void fibo(int first, int second, int n) {
        if(n<0){
            return;
        }
        int thrid = first+second;
        System.out.print(thrid+" ");
        fibo(second, thrid, n-1);
    }
}
