class Solution {
    public int maxArea(int[] heights) {
        
        int maxarea = 0;

        int left = 0;
        int right = heights.length - 1;

        while(left <= right){

            if(heights[left] <= heights[right]){
                maxarea = Math.max(maxarea,heights[left]*(right - left));
                left += 1;
            }
            else{
                maxarea = Math.max(maxarea,heights[right]*(right - left));
                right -= 1;
            }

        }

        return maxarea;


    }
}
