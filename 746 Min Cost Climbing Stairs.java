class Solution {
    // https://leetcode.com/problems/min-cost-climbing-stairs/
    
    public int minCostClimbingStairs(int[] cost) {
        // return Math.min(minCost(cost, 0), minCost(cost, 1));
        return minCost(cost);
    }
    
    // Top Down DP
    Map<Integer, Integer> map = new HashMap<>();
    private int minCost(int[] cost, int index) {
        if(index >= cost.length) {
            return 0;
        }
        if(map.containsKey(index)) { return map.get(index); }
        int oneStep = minCost(cost, index + 1);
        int twoSteps = minCost(cost, index + 2);
        int result = cost[index] + Math.min(oneStep, twoSteps);
        map.put(index, result);
        return result;
    }
    
    //Bottom Up DP
    private int minCost(int[] cost) {
        int dp1 = 0; // Cost of i+1 = 0
        int dp2 = 0; // Cost of i+2 = 0
        
        for(int i = cost.length-1; i >= 0; i --) {
            int minCost = Math.min(dp1, dp2) + cost[i];
            dp1 = dp2;
            dp2 = minCost;
        }
        
        return Math.min(dp1, dp2);
    }
}