/*
Three types of Questions regarding pascal's triangle:
1. Given the row number and column number, return the element present there
time complexity: O(n)
space complexity: O(1)
2. Given the row number, print the row
time complexity: O(n)
space complexity: O(1)
3. Given n, print the pascal's triangle upto n
time complexity: O(n^2)
space complexity: O(1)
Simple formula (Depends on zero-based indexing or 1-based indexing):
1. row number and column number given it becomes (n-1)C(r-1) where n = no. of rows and
r = no. of columns. So ans = ans*(n-i)/(i+1)
2. Given row number = ans = ans * (n-1)/i
3. Use a function to generate each row as a list and add each list into a the result list
 */
//Type 1 Solution:
int n = 5;
int r = 3;
int res = 1;
//loop runs for as long as the coloumn is
for (int i = 0; i < r; i++) {
res = res * (n - i) / (i + 1);
}

System.out.println(res);
//Type 2 Solution:
//problem link: https://leetcode.com/problems/pascals-triangle-ii/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        long ans = 1; // use long to be safe
        for (int i = 1; i <= rowIndex; i++) {
            //zero-based indexing
            ans = ans * (rowIndex - i + 1) / i;
            result.add((int) ans);
        }
        return result;
    }
}
//Type 3 Solution:
//problem link: https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<Integer> generateRows(int row){
        long ans = 1;
        List<Integer> res = new ArrayList<>();
        res.add((int)ans);
        for(int i = 1; i < row; i++){
            ans = ans*(row-i);
            ans = ans/i;
            res.add((int)ans);
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 1; i <= numRows;i++){
            answer.add(generateRows(i));
        }
        return answer;
    }
}
