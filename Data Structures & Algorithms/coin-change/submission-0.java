class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int ans = compute(coins,amount,0);

        return ans >= Integer.MAX_VALUE/2 ? -1 : ans;

    }

    public static int compute(int[] nums, int t,int i){

        if(i >= nums.length || t < 0){
            return Integer.MAX_VALUE/2;
        }

        if(t == 0){
            return 0;
        }

        int pick = 1 + compute(nums,t-nums[i],i);
        int not_pick = compute(nums,t,i+1);

        return Math.min(pick,not_pick);


    }
}
