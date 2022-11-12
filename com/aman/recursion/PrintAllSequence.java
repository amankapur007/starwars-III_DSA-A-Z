package com.aman.recursion;

import java.util.ArrayList;

/**
 * Time Complexity - 2^n * n
 * Space Complexity - n
 */
public class PrintAllSequence {
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        printSequence(0, new ArrayList<>(),arr);
    }

    private static void printSequence(int index, ArrayList list, int[] arr) {
        if(index==arr.length){
            System.out.println(list.toString());
            return;
        }
        //take the element
        list.add(arr[index]);
        printSequence(index+1, list, arr);
        //Not taking the element
        list.remove(list.size()-1);
        printSequence(index+1, list, arr);
    }
}
