class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();

        while(n != 1){

            if(set.size() != 0 && set.contains(n)){
                return false;
            }

            set.add(n);

            int copy = n;
            int sum = 0;

            while(copy > 0){
                int val = copy%10;
                sum = sum + val*val;
                copy = copy/10;
            }

            n = sum;

        }

        return true;


    }
}
