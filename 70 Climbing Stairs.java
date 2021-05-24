/**
* // https://leetcode.com/problems/climbing-stairs/
* // https://www.youtube.com/watch?v=NFJ3m9a1oJQ
*/

class Solution {
    public int climbStairs(int n) {
        int dp1 = 1;
        int dp2 = 1;
        
        for(int i = 2; i <= n; i ++) {
            int dpi = dp1 + dp2;
            dp1 = dp2;
            dp2 = dpi;
        }
        
        return dp2;
    }
}