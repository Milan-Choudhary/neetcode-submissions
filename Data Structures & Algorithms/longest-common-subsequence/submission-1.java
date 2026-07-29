class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] matrix = new int[text1.length()+1][text2.length()+1];

        for(int[] arr : matrix){
            Arrays.fill(arr,-1);
        }
        
        int ans = compute(text1,text2,0,0,matrix);

        return ans;

    }

    public static int compute(String text1,String text2,int i,int j,int[][] matrix){

        if(i >= text1.length() || j >= text2.length()){
            return 0;
        }

        if(text1.charAt(i) == text2.charAt(j)){
            return 1 + compute(text1,text2,i+1,j+1,matrix);
        }

        if(matrix[i][j] != -1){
            return matrix[i][j];
        }
        

       return matrix[i][j] = Math.max(compute(text1,text2,i+1,j,matrix),compute(text1,text2,i,j+1,matrix));       



    }

}
