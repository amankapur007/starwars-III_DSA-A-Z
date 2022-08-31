package com.aman.patterns;

// *********
//  *******
//   *****
//    ***
//     *
public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=4;i>=0;i--){
            for(int j=0;j<n-(i+1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("*");
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }    
}
