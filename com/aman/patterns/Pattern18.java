package com.aman.patterns;


// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // adding * in left
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // adding space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            // adding * in right
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            // adding * in left
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // adding space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            // adding * in right
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
