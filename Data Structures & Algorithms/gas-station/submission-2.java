class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int ans = -1;
        int current = 0;
        int total = 0;

        for(int i = 0; i<gas.length; i++){

            current += gas[i] - cost[i];
            total += gas[i] - cost[i];

            if(current >= 0 && ans == -1){
                ans = i;
            }
            else if(current < 0){
                current = 0;
                ans = -1;
            }

        }


        return total < 0 ? -1 : ans;

    }
}
