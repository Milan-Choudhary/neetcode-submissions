class Solution {
    public boolean canJump(int[] nums) {
        
        int maxreach = 0;
        int reach = 0;

        for(int i = 0; i<nums.length; i++){
            if(maxreach < i){
                return false;
            }
            
            reach = i + nums[i];

            if(reach > maxreach){
                maxreach = reach;
            }

            if(maxreach >= nums.length - 1){
                return true;
            }

            
        }

        return false;

    }
}
