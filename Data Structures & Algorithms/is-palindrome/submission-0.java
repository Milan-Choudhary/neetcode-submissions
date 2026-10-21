class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder res = new StringBuilder();

        String[] arr = s.split(" ");

        for(String str : arr){
            for(char ele : str.toCharArray()){
                if(Character.isLetterOrDigit(ele)){ 
                    if(Character.isDigit(ele)){
                        res.append(ele);
                    }
                    else{
                        res.append(Character.toLowerCase(ele));
                    }
                }
            }
        }

        int left = 0;
        int right = res.length() - 1;

        while(left < right){

            if(res.charAt(left) != res.charAt(right)){
                return false;
            }

            left += 1;
            right -= 1;

        }

        return true;
       

    }
}
