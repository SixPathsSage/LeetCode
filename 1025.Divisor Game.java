class Solution {
    // https://leetcode.com/problems/divisor-game/
    // https://www.youtube.com/watch?v=UbE4-ONpJcc
    
    public boolean divisorGame(int n) {
        // return solveByDP(n);
        return solveByMath(n);
    }
    
    private boolean solveByMath(int n) {
        return n % 2 == 0;
    }
    
    private boolean solveByDP(int n) {
        int[] dp = new int[1001];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }
    
    private boolean helper(int n, int[] dp) {
        if(n == 1) { return false; }
        
        for(int i = 1; i*i < n; i ++) {
            if(n % i == 0) {
                if(dp[i] != -1) { return dp[i] == 1; }
                if(helper(n-1, dp) == false) {
                    dp[n] = 1;
                    return true;
                }
                
                if(i != 1 && helper(n-(n/i), dp) == false) {
                    dp[n] = 1;
                    return true;
                }
            }
        }
        dp[n] = 0;
        return false;
    }
}