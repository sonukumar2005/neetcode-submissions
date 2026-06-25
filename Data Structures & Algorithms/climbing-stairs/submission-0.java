class Solution {
    public int f(int[] dp, int n){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = f(dp, n-1) + f(dp, n-2);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }
        return f(dp,n);
    }
}
