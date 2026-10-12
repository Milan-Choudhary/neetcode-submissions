class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }

        String res = "";
       
        for(int left = 0; left<s.length(); left++){
        for(int right = left; right<s.length(); right++){
            boolean val = ifisPalindrome(left,right,s);
            if(val == true && (right - left + 1) > res.length()){
                 res = s.substring(left,right+1);
              }

            }
        }

        return res;

    }

    public static boolean ifisPalindrome(int left,int right,String s){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left += 1;
            right -= 1;
        }

        return true;
    }
}