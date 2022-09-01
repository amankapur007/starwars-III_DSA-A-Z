package com.aman.basicmaths;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=9;
        boolean flag = false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag =  true;
                break;
            }
        }
        if(flag){
            System.out.println("NOT A PRIME");
        }else{
            System.out.println("PRIME");
        }
    }
}
