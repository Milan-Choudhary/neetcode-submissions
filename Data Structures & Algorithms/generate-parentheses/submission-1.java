class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> list = new ArrayList<>();

        compute(list,0,0,"",n);

        return list;

    }

    public static void compute(List<String> list,int open,int close,String str,int n){

        if(open == n && close == n){
            list.add(str);
            return;
        }

        if(open < n){
            
            compute(list,open+1,close,str + "(",n);
        }

        if(open > close){
            compute(list,open,close+1,str + ")",n);
        }


    }


}
