class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int val = -10001;
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];

        for(int i = 0; i<k; i++){
            dq.addLast(nums[i]);
            val = Math.max(val,nums[i]);
        }

        int index = 0;
        ans[index++] = val;


        for(int i = k; i<nums.length; i++){
            int num = dq.pollFirst();
            dq.addLast(nums[i]);

            if(val == num){
                val = -10001;

                for(int j = i-k+1; j<=i; j++){
                    val = Math.max(nums[j],val);
                }
            }else{
                val = Math.max(val,nums[i]);
            }

            ans[index++] = val;
            

        }

        return ans;


    }
}
