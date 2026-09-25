class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int ans = 0;

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    int val = compute(grid,i,j);
                    ans = Math.max(ans,val);
                }
            }
        }

        return ans;

    }

    public static int compute(int[][] grid,int i,int j){

        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
            return 0;
        }

        grid[i][j] = 0;          

        int left = compute(grid,i,j-1);
        int right = compute(grid,i,j+1);
        int up = compute(grid,i-1,j);
        int down = compute(grid,i+1,j);

        return 1 + left + right + up + down;

    }

}
