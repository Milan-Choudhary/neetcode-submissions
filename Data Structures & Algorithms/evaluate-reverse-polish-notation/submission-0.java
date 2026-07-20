class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for(int i = 0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                int second = stack.pop();
                int first = stack.pop();
                ans = first + second; 
                stack.push(ans);
            }
            else if(tokens[i].equals("*")){
               int second = stack.pop();
                int first = stack.pop();
                ans = first*second;
                stack.push(ans);
            }
            else if(tokens[i].equals("-")){
               int second = stack.pop();
                int first = stack.pop();
                ans = first-second;
                stack.push(ans);
            }
            else if(tokens[i].equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                ans = first/second;
                stack.push(ans);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));            
            }

           
        }

        return stack.pop();

    }
}
