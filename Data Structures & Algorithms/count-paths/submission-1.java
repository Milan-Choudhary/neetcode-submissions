class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }        
        
        int ans = compute(m,n,0,0,dp);
        return ans;

    }

    public static int compute(int m,int n,int i,int j,int[][] dp){
        
        if(i == m - 1 && j == n - 1){
            return 1;
        }

        if(i >= m || j >= n){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int right = compute(m,n,i,j+1,dp);
        int down = compute(m,n,i+1,j,dp);

        dp[i][j] = right + down;
        return dp[i][j];
        

    }

}
