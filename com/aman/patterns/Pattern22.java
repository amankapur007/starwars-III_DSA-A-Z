package com.aman.patterns;

public class Pattern22 {
    public static void main(String[] args) {
        int n=4;
        //upper
        for(int i=0;i<n;i++){
            //left
            for(int j=0;j<n;j++){
                if(j>=i){
                    System.out.print(n-i);
                }else{
                    System.out.print(n-j);
                }
            }

            //right
            for(int j=n-2;j>=0;j--){
                if(j>=i){
                    System.out.print(n-i);
                }else{
                    System.out.print(n-j);
                }
            }
            System.out.println();
        }

        //lower
        for(int i=2;i<=n;i++){
            //left
            for(int j=n;j>0;j--){
                if(j>=i){
                    System.out.print(j);
                }else{
                    System.out.print(i);
                }
            }

            //right
            for(int j=2;j<=n;j++){
                if(j>=i){
                    System.out.print(j);
                }else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
