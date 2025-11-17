//problem link: https://www.geeksforgeeks.org/problems/reverse-an-array/1
//approach: two-pointer method
//time complexity: O(n)
//space complexity: O(1)
class Solution {
    public void reverseArray(int arr[]){
        int n = arr.length;
        int first = 0;
        int last = n-1;
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}