class Solution {
    public boolean exist(char[][] board, String word) {
        
        boolean[][] grid = new boolean[board.length][board[0].length];
        String res = "";

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    
                    boolean ans = compute(board,i,j,word,grid,res);
                    if(ans == true){
                        return true;
                    }
                }
            }
        }


        return false;

    }

    public static boolean compute(char[][] board,int i,int j,String word,boolean[][] grid,String s){

        if(i >= board.length || j >= board[0].length || i < 0 || j < 0 || grid[i][j] == true){
            return false;
        }

        grid[i][j] = true;

        s += board[i][j];

        if(s.equals(word)){
            return true;
        }


        boolean left = compute(board,i,j-1,word,grid,s);
        boolean right = compute(board,i,j+1,word,grid,s);
        boolean up = compute(board,i-1,j,word,grid,s);
        boolean down = compute(board,i+1,j,word,grid,s);

        grid[i][j] = false;
        

        return left || right || up || down;

    }

}
