package com.aman.basicmaths;

//i/p: 12345
//o/p: 54321
public class ReverseNumber {
    public static void main(String[] args) {
        int n=1235;
        int rev = 0;
        while(n>0){
            int d = n%10;
            rev = rev*10+d;
            n=n/10;
        }
        System.out.println(rev);
    }
    
}
