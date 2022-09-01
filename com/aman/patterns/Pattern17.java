package com.aman.patterns;

// E
// D E
// C D E
// B C D E
// A B C D E
public class Pattern17 {
    public static void main(String[] args) {
      int n=5;
      char a = 'A';
      for(int i=0;i<n;i++){
        for(int j=n-i-1;j<n;j++){
            System.out.print((char)(a+j)+" ");
        }
        System.out.println();
      }   
    }
}
