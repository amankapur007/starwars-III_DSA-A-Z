package com.aman.recursion;

public class StringPalindrome{
    public static void main(String[] args) {
        String str="MADAM1";
        if(palin(str, 0,str.length()-1)){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }
    }

    private static boolean palin(String str, int start, int end) {
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return palin(str, start+1, end-1);
    }

}