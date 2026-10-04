class Solution {
    public int reverse(int x) {
        
        int max_val = Integer.MAX_VALUE;
        int min_val = Integer.MIN_VALUE;

        long num = 0;

        while(x != 0){
            int val = x%10;
            num = num*10 + val;
            x = x/10;

        }

        if(num > max_val || num < min_val){
            return 0;
        }

        return (int)num;


    }
}
