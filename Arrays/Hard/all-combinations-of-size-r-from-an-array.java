//problem-link: https://www.geeksforgeeks.org/dsa/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
//time complexity: O(C(n, r) * r)
//space complexity: O(C(n, r) * r) - result
//backtracking
import java.util.*;

class Solution {
    public List<List<Integer>> combineFromArray(int[] arr, int r) {
        //create a list to return all combinations
        List<List<Integer>> result = new ArrayList<>();
        //function call
        backtrack(arr, 0, r, new ArrayList<>(), result);
        return result;
    }
//helper function to track current pair, start index,result list
    private void backtrack(int[] arr, int start, int r, List<Integer> current, List<List<Integer>> result) {
        //if r elements in current list - return
        if (current.size() == r) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            //add current element of the array and use backtrack function to add the next
            current.add(arr[i]);   // choose
            backtrack(arr, i + 1, r, current, result);
            //backtrack
            current.remove(current.size() - 1); // undo
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {10, 20, 30, 40};
        int r = 2;

        List<List<Integer>> ans = sol.combineFromArray(arr, r);
        System.out.println(ans);
    }

}
