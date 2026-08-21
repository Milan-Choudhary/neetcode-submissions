class Solution {
    public int change(int amount, int[] coins) {
        
        int[][] dp = new int[coins.length+1][amount+1];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int ans = compute(amount,coins,0,dp);

        return ans;

    }

    public static int compute(int t,int[] coins,int i,int[][] dp){

        if(t == 0){
            return 1;
        }

        if(i >= coins.length || i < 0 || t < 0){
            return 0;
        }

        if(dp[i][t] != -1){
            return dp[i][t];
        }

        int a = compute(t-coins[i],coins,i,dp);
        int b = compute(t,coins,i+1,dp);

        dp[i][t] = a+b;

        return dp[i][t];


    }

}
