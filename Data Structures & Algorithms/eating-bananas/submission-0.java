class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        long left = 1;
        long right = 0;

        for(int p : piles){
            right += p;
        }

        long ans = -1;

        while(left <= right){
            long mid = left + (right - left)/2;

            if(isPossible(mid,piles,h)){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }

        }

        return (int)ans;

    }

    public static boolean isPossible(long mid,int[] piles,int h){

        long c = 0;

        for(int val : piles){
            if(val%mid == 0){
                c += val/mid;
            }
            else{
                c += val/mid + 1;
            }

        }

        return c <= h;

    }

}
