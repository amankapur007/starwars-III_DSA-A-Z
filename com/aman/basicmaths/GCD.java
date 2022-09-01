package com.aman.basicmaths;

public class GCD {
    public static void main(String[] args) {
        int num1 = 4, num2 = 8;
        int gcd = gcd(num1, num2);
        System.out.println(gcd);
    }

    private static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return gcd(num2, num1 % num2);

    }
}
