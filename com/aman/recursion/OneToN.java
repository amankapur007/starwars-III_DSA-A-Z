package com.aman.recursion;

//https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
public class OneToN {
    public static void main(String[] args) {
        int n = 10;
        printTill(n);
    }

    private static void printTill(int n) {
        if(n==0){
            return;
        }
        printTill(n-1);
        System.out.print(n+" ");
    }
}
