class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);

        int val = nums[0];

        int c = 1;
        int len = c;

        for(int i = 1; i<nums.length; i++){

            if(nums[i] == val + 1){
                val = nums[i];
                c += 1;
            }
            else if(nums[i] == val){
                continue;
            }
            else{
                val = nums[i];
                c = 1;
            }

            len = Math.max(len,c);

        }

        return len;

    }
}
