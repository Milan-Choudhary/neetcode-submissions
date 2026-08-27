class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];

        Arrays.fill(dp,-1);

        int ans = compute(n,0,dp);

        return ans;

    }

    public static int compute(int n,int i,int[] dp){

        if(i == n){
            return 1;
        }

        if(i > n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int a = compute(n,i+1,dp);
        int b = compute(n,i+2,dp);

        dp[i] = a + b;

        return dp[i];


    }

}
