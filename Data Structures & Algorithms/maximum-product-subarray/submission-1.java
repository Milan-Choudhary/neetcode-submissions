class Solution {
    public int maxProduct(int[] nums) {
        
        int product = 1;
        int ans = -11;

        for(int i = 0; i<nums.length; i++){
            product *= nums[i];

            ans = Math.max(ans,product);

            if(product == 0){
                product = 1;
            }
        }

        product = 1;

        for(int i = nums.length - 1; i >= 0; i--){
            product *= nums[i];

            ans = Math.max(ans,product);

            if(product == 0){
                product = 1;
            }
        }


        return ans;


    }
}
