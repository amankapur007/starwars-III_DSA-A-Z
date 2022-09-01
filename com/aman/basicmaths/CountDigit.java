package com.aman.basicmaths;

//I/P: 12345
//O/P: 5
public class CountDigit {
    public static void main(String[] args) {
        int n=1235564;
        System.out.println((int)Math.floor(Math.log10(n)+1));
    }
}
