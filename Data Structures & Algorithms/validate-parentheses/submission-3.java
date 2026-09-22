class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        int i = 0;

        while(i < s.length()){
            
            while( i < s.length() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){

                if(stack.size() == 0){
                    return false;
                }
                char ch = stack.pop();

                if((s.charAt(i) == ')' && ch != '(' ) || (s.charAt(i) == '}' && ch != '{' ) || (s.charAt(i) == ']' && ch != '[')){
                    return false;
                }

                i += 1;
               
            }

            if(i != s.length())
            stack.push(s.charAt(i));

            i += 1;
        }


        return stack.size() == 0;

    }
}
