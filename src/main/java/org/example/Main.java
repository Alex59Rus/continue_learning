package org.example;

import java.util.*;

import static org.example.HelperClass.*;

public class Main {
    public static void main(String[] args) {
            int[] nums = {1,2,3,4,5};
            int[] newNums = new int[nums.length];
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
            Collections.reverse(list);
            //print(list);
            for (int i = nums.length, j = 0; i != 0; i--, j++) {
                newNums[j] = nums[i - 1];
            }
            print(nums);
            print(newNums);
    }
}