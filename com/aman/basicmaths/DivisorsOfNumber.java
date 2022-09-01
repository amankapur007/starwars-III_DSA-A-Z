package com.aman.basicmaths;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        int n=36;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                int d = n/i;
                System.out.print(d+" ,");
                if(i!=n/i) System.out.print(i+" ,");    
            }
        }
    }
}
