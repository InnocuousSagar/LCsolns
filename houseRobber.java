//House robber
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[2] + nums[0];
        for(int i=3;i<n;i++){
            dp[i] = Math.max(dp[i-2],dp[i-3]) + nums[i];
        }
        
        return Math.max(dp[n-1],dp[n-2]);
        
    }
}

// count(coins,n,sum) = count(coins,n,sum-count[n-1]) + count(coins,n-1,sum) coin change