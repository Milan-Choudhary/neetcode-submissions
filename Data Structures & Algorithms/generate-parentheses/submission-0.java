class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        compute(list,0,0,str,n);

        return list;

    }

    public static void compute(List<String> list,int open,int close,StringBuilder str,int n){

        if(open == n && close == n){
            list.add(str.toString());
            return;
        }

        if(open < n){
            str.append("(");
            compute(list,open+1,close,str,n);
            str.setLength(str.length() - 1);
        }

        if(open > close){
            str.append(")");
            compute(list,open,close+1,str,n);
            str.setLength(str.length() - 1);
        }


    }


}
