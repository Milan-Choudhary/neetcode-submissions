class Solution {
    public int numIslands(char[][] grid) {
        
        int ans = 0;

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    compute(grid,i,j);
                    ans += 1;
                }
            }
        }

        return ans;


    }

    public static void compute(char[][] grid,int i,int j){


        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }

        if(grid[i][j] == '1'){
            grid[i][j] = '0';
        }
 
        compute(grid,i,j-1);
        compute(grid,i,j+1);
        compute(grid,i-1,j);
        compute(grid,i+1,j);

    }

}
