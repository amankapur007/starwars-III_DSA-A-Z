package com.aman.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFreq {
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        Map<Integer, Integer> m = new HashMap<>();
        for(int i:arr){
            if(m.containsKey(i)){
                m.put(i, m.get(i)+1);
            }else{
                m.put(i, 1);
            }
        }
        System.out.println(m.toString());
    }
}
