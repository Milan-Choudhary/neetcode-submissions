class Solution {
    public int jump(int[] nums) {

        if(nums.length == 1){
            return 0;
        }

        int index = 0;
        int jumps = 0;
        int curr = 0;

        while(index < nums.length - 1){

            int can_jump = nums[index] + index;
            curr = 0;

            if(can_jump >= nums.length - 1){
                jumps += 1;
                return jumps;
            }

            int moves = index + 1;

            while(moves < nums.length && moves <= can_jump){

                int val = nums[moves] + moves;

                if(val >= curr){
                    index = moves;
                    curr = val;
                }

                moves += 1;

            }

            
            jumps += 1;

        }

        return jumps;

    }
}
