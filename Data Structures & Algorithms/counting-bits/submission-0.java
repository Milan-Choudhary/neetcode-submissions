class Solution {
    public int[] countBits(int n) {

        int c = 0;
        int[] ans = new int[n+1];

        for(int i = 0; i<=n; i++){

            int num = i;
            c = 0;

            while(num > 0){

            int val = num%2;

            if(val == 1){
                c += 1;
            }

            num = num/2;

            }

            ans[i] = c;

        }

        return ans;

    }
}
