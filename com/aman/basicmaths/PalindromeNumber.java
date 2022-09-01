package com.aman.basicmaths;

// i/p: 54322345
// o/p: PALINDROME
public class PalindromeNumber {
    public static void main(String[] args) {
        int n= 54322345;
        int rev = reverse(n);
        if(n==rev){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }
        
    }

    private static int reverse(int n) {
        int rev = 0;
        while(n>0){
            int d = n%10;
            rev = rev*10+d;
            n=n/10;
        }
        return rev;
    }
}
