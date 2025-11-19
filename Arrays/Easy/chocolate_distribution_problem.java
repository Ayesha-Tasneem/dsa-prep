//problem link: https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
//time complexity: O(nlogn)
//space complexity: O(1)
//sliding window
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        if(m == 0 || arr.size() == 0) return 0;
        if(m > arr.size()) return -1;
        Collections.sort(arr);
        int n = arr.size();
        int min = Integer.MAX_VALUE;
        //sliding window
        for(int i = 0; i + m -1 < n; i++){
            int diff = arr.get(i + m - 1) - arr.get(i);
            min = Math.min(diff,min);
        }
        return min;
    }
}