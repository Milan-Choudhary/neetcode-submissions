class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int len = 0;

        HashSet<Character> set = new HashSet<>();
        int left = 0;

        for(int i = 0; i<s.length(); i++){

            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left += 1;
            }

            len = Math.max(i - left + 1,len);
            set.add(s.charAt(i)); 

        }

        return len;


    }
}
