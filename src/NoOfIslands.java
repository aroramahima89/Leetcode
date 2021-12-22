public class NoOfIslands {
    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][];
        for(int i=0;i<grid.length;i++){
            visited[i]=new boolean[grid[0].length];
        }
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    visited[i][j]=true;
                    count++;
                    dfs(grid,visited,i,j);
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid,boolean[][] visited,int i,int j){
        if(grid[i][j]=='0' || i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return;
        }
        if(i>=0 && j-1>=0 && i<grid.length && j-1<grid[0].length && grid[i][j-1]=='1' && !visited[i][j-1]){
            visited[i][j-1]=true;
            dfs(grid,visited,i,j-1);
        }
        if(i>=0 && j+1>=0 && i<grid.length && j+1<grid[0].length && grid[i][j+1]=='1' && !visited[i][j+1]){
            visited[i][j+1]=true;
            dfs(grid,visited,i,j+1);
        }
        if(i-1>=0 && j>=0 && i-1<grid.length && j<grid[0].length && grid[i-1][j]=='1' && !visited[i-1][j]){
            visited[i-1][j]=true;
            dfs(grid,visited,i-1,j);
        }
        if(i+1>=0 && j>=0 && i+1<grid.length && j<grid[0].length && grid[i+1][j]=='1' && !visited[i+1][j]){
            visited[i+1][j]=true;
            dfs(grid,visited,i+1,j);
        }

    }
}