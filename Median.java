package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Median {


	

    public static void main(String[] args) {

        // 1) Median of Two Sorted Arrays
        int[] nums1 =  {1, 2, 3, 4, 9};
        int[] nums2 = { 2, 3, 5, 7, 8,};

        List<Integer> array = new ArrayList<>();

        int j = 0;
        int k = 0;

        for (int i = 0; i < nums1.length + nums2.length - 1; i++) {
            if (nums1[k] >= nums2[j])
            	array.add(nums2[j++]);
            else {
            	array.add(nums1[k++]);
            }
        }
        System.out.println("The median of Two Sorted Arrays is :");
        if(array.size() % 2 == 0){
            System.out.println((array.get(array.size() / 2)
                    + array.get((array.size() / 2) -1))/2f);
        }
        else{
            System.out.println(array.get(array.size() / 2));
        }
    }
}