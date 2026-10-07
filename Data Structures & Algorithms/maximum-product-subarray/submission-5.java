class Solution {
    public int maxProduct(int[] nums) {
        
        int maxProduct = -11;

        int val = 1;

        for(int num : nums){
            val *= num;
            maxProduct = Math.max(maxProduct,val);
            if(val == 0){
                val = 1;
            }
        }

        val = 1;

        for(int i = nums.length - 1; i>=0; i--){
            val *= nums[i];
            maxProduct = Math.max(maxProduct,val);
            if(val == 0){
                val = 1;
            }
        }

        return maxProduct;



    }
}
