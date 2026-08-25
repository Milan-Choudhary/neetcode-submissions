class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        
        int k = s1.length();

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char ele : s1.toCharArray()){
            map1.put(ele,map1.getOrDefault(ele,0)+1);
        }

        for(int i = 0; i<k; i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }

        if(map2.equals(map1)){
            return true;
        }

        for(int i = k; i<s2.length(); i++){
            int index = i - k;
            map2.put(s2.charAt(index),map2.get(s2.charAt(index))-1); 

            if(map2.get(s2.charAt(index)) == 0){
                map2.remove(s2.charAt(index));
            }

            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);

            if(map2.equals(map1)){
              return true;

            }

        }

        return false;

    }
}
