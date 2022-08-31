package com.aman.patterns;

//*****
//*****
//*****
//*****
//*****
class Pattern1{
    public static void main(String[] args) {
        int n =5;
        StringBuilder p =new StringBuilder();
        for(int i=0;i<n;i++){
            p.append("*");
        }   
        
        for(int i=0;i<n;i++){
            System.out.println(p);        }
    }
}

//complexity : O(N)