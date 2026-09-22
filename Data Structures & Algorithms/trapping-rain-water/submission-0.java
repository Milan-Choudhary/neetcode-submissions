class Solution {
    public int trap(int[] height) {
        
        int left = 0;
        int right = height.length - 1;

        int[] left_max = new int[height.length];
        left_max[0] = height[0];

        int[] right_max = new int[height.length];
        right_max[height.length - 1] = height[height.length - 1];

        for(int i = 1; i<height.length; i++){
            left_max[i] = Math.max(height[i],left_max[i-1]);
        }

        for(int i = height.length - 2; i>= 0; i--){
            right_max[i] = Math.max(height[i],right_max[i+1]);
        }

        int ans = 0;

        for(int i = 0; i<height.length; i++){
            ans += Math.min(left_max[i],right_max[i]) - height[i];
        }

        return ans;


    }
}
