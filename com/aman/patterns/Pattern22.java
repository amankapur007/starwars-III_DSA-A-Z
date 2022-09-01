package com.aman.patterns;


//These question are hit and try
// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444
public class Pattern22 {
    public static void main(String[] args) {
        int n=4;
        //upper
        for(int i=0;i<n;i++){
            //left- left we want n-i 
            //4444 => 4-0 (i=0, j=0)
            //4333 => 4-i (i=1, j=increses) but only if j becomes greter then i
            for(int j=0;j<n;j++){
                if(j>=i){
                    System.out.print(n-i);
                }else{
                    System.out.print(n-j);
                }
            }

            //right
            //right vice versa
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
