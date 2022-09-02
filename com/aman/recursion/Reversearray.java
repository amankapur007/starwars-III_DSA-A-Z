package com.aman.recursion;

import java.util.Arrays;

public class Reversearray{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        rev(a, 0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void rev(int[] a, int start, int end) {
        if(start>=end){
            return;
        }
        int temp =a[start];
        a[start]=a[end];
        a[end]=temp;
        rev(a, start+1, end-1);
    }
}