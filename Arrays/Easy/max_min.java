//problem link : https://www.geeksforgeeks.org/dsa/maximum-and-minimum-in-an-array/
//time complexity - O(n)
//space complexity = O(1)

import java.util.*;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);

        return result;
    }
}

