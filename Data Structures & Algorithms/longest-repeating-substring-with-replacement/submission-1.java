class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] freq = new int[26];

        int left = 0;
        int right = 0;

        int len = 0;

        int max_freq = 0;

        while(right < s.length()){
            freq[s.charAt(right) - 'A'] += 1;

            max_freq = Math.max(max_freq,freq[s.charAt(right) - 'A']);

            while(((right - left + 1) - max_freq) > k){

                freq[s.charAt(left) - 'A'] -= 1;

                left += 1;               
                
            }

            len = Math.max(right - left + 1,len);

            right += 1;

        }

        return len;

    }
}
