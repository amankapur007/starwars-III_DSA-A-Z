package com.aman.patterns;

//    A
//   ABA
//  ABCBA
// ABCDCBA
public class Pattern16 {
    public static void main(String[] args) {
      int n=4;
      char a = 'A';
      for(int i=1;i<=n;i++){
        //first adding space
        for(int j=0;j<n-i;j++){
            System.out.print(' ');
        }
        //Adding letter at last
        int j=0;
        for(;j<=i-1;j++){
            System.out.print((char)(a+j));
        }
        //then readding at right with decrement
         for(j=j-1;j>0;j--){
             System.out.print((char)(a+j-1));
         }
        System.out.println();
      }
    }
}
