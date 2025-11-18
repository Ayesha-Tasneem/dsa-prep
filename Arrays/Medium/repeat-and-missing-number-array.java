//problem link: https://www.interviewbit.com/problems/repeat-and-missing-number-array/
//time complexity: O(n) - linear time complexity
//space complexity: O(n)
public class Solution {
    public int[] repeatedNumber(final int[] A) {
        Set<Integer> set = new HashSet<>();
        long n = A.length;
        int a = 0;
        //to prevent overflow
        long expected_sum = (n * ( n+ 1)) / 2;
        long actual_sum = 0;
        for(int num : A){
            actual_sum += num;
            if(set.contains(num)){
                a = num;
            }
            else{
                set.add(num);
            }
        }
        long diff = expected_sum-actual_sum;
        long b = a+diff;
        return new int[]{a,(int)b};
    }
}
