package com.aman.patterns;

// A
// AB
// ABC
// ABCD
// ABCDE
public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            char s = 'A';
            for(int j=0;j<=i;j++){
                System.out.print((char)(s+j));
            }
            System.out.println();
        }
    }
}
