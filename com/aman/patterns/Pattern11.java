package com.aman.patterns;

// 1
// 01
// 101
// 0101
// 10101
public class Pattern11 {
    public static void main(String[] args) {
        int num=1;
        int n =5;
        for(int i=1;i<=n;i++){
            int temp = num;
            for(int j=0;j<i;j++){
                System.out.print(temp);
                temp = temp==1?0:1;
            }
            System.out.println();
            num = num==1?0:1;
        }

    }
}
