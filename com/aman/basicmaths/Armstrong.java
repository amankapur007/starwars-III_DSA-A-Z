package com.aman.basicmaths;

public class Armstrong {
    public static void main(String[] args) {
        int num=153;
        int temp = num;
        int sum=0;
        while(temp>0){
            int d =  (int)Math.pow(temp%10,3);
            sum+=d;
            temp/=10;
        }
        if(sum==num){
            System.out.println("ARMSTRONG");
        }else{
            System.out.println("NOT ARMSTRONG");
        }
    }

}
