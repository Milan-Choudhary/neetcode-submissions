class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int ans = compute(s,t,0,0,dp);
        return ans;

    }

    public static int compute(String s,String t,int i,int j,int[][] dp){
        
        if(i == t.length()){
            return 1;
        }


        if(j >= s.length()){
            return 0;
        }

        if(dp[j][i] != -1){
            return dp[j][i];
        }

        int pick = 0;

        if(s.charAt(j) == t.charAt(i)){
            pick = compute(s,t,i+1,j+1,dp);
        }

        int skip = compute(s,t,i,j+1,dp);

        dp[j][i] =  pick + skip;

        return dp[j][i];


    }

}
