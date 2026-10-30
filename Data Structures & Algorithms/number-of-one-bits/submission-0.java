class Solution {
    public int hammingWeight(int n) {
        
        int c = 0;

        while(n > 0){

            int val = n%2;

            if(val == 1){
                c += 1;
            }

            n = n/2;

        }

        return c;

    }
}
