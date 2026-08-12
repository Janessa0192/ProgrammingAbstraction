class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int prev1 = 0;
        int prev2 = 0;
        int result = prev1;

        int n = cost.length;

        for(int i=2;i<=n;i++){

            result = Math.min(prev1+cost[i-1],prev2+cost[i-2]);
            prev2 = prev1;
            prev1 = result;

        }

        return result;
        
    }
}