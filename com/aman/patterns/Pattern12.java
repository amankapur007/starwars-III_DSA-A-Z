package com.aman.patterns;

// 1      1
// 12    21
// 123  321
// 12344321
public class Pattern12 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=n;j>0;j--){
                if(j>i){
                    System.out.print(" ");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
