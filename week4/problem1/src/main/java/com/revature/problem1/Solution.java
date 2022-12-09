package com.revature.problem1;

import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        Arrays.sort(arr);

        int first=0;
        int last = arr.length-1;
        int answer = k+1;


        while (first <=last) {
            int mid = (first +last)/2;

            if(arr[mid] <= answer) {
                if(arr[mid]==answer) {
                    answer++;
                    last--;
                }
                first = mid +1;
            }
            else {
                last = mid-1;
            }

        }
        return answer;

    }
}
