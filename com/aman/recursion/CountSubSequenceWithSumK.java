package com.aman.recursion;

import java.util.ArrayList;

/**
 * Time Complexity - 2^n * n
 * Space Complexity - n
 */
public class CountSubSequenceWithSumK {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int count = printSequence(0, new ArrayList<>(),arr, 0,2);
        System.out.println(count);
    }

    private static int printSequence(int index, ArrayList list, int[] arr, int sum, int target) {
        if(index==arr.length){
            if(sum==target){
            //System.out.println(list.toString());
            return 1;
            }
            return 0 ;
        }
        //take the element
        list.add(arr[index]);
        int left = printSequence(index+1, list, arr, sum+arr[index], target);
        //Not taking the element
        list.remove(list.size()-1);
        int right = printSequence(index+1, list, arr, sum, target);
        return left+right;
    }
}
