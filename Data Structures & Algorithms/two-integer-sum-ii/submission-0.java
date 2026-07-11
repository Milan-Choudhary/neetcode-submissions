class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] ans = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                left = left + 1;
                right = right + 1;
                break;
            }
            else if(sum > target){
                right -= 1;
            }
            else{
                left += 1;
            }

        }

        ans[0] = left;
        ans[1] = right;

        return ans;


    }
}
