class node{
    int x;
    int y;
    int dist;
    node(int x,int y,int dist){
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<node> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0]!=0 || grid[n-1][m-1]!=0){
            return -1;
        }
        q.add(new node(0,0,1));
        while(!q.isEmpty()){
            node tem = q.poll();
            if (tem.x == n - 1 && tem.y == m - 1) {
                return tem.dist;
            }
            if(tem.y+1 < m && grid[tem.x][tem.y+1]==0){
                q.add(new node(tem.x,tem.y+1,tem.dist+1));
                grid[tem.x][tem.y + 1] = 1;
            }
            if(tem.x+1<n &&grid[tem.x+1][tem.y]==0){
                q.add(new node(tem.x+1,tem.y,tem.dist+1));
                grid[tem.x+1][tem.y] = 1;
            }
            if(tem.x+1<n && tem.y+1<m && grid[tem.x+1][tem.y+1]==0){
                q.add(new node(tem.x+1,tem.y+1,tem.dist+1));
                grid[tem.x+1][tem.y + 1] = 1;
            }
            if (tem.y - 1 >= 0 && grid[tem.x][tem.y - 1] == 0) {
                q.add(new node(tem.x, tem.y - 1, tem.dist + 1));
                grid[tem.x][tem.y - 1] = 1; // Mark the cell as visited
            }
            if (tem.x - 1 >= 0 && grid[tem.x - 1][tem.y] == 0) {
                q.add(new node(tem.x - 1, tem.y, tem.dist + 1));
                grid[tem.x - 1][tem.y] = 1; // Mark the cell as visited
            }
            if (tem.x - 1 >= 0 && tem.y - 1 >= 0 && grid[tem.x - 1][tem.y - 1] == 0) {
                q.add(new node(tem.x - 1, tem.y - 1, tem.dist + 1));
                grid[tem.x - 1][tem.y - 1] = 1; // Mark the cell as visited
            }
            if (tem.x - 1 >= 0 && tem.y + 1 < m && grid[tem.x - 1][tem.y + 1] == 0) {
                q.add(new node(tem.x - 1, tem.y + 1, tem.dist + 1));
                grid[tem.x - 1][tem.y + 1] = 1; // Mark the cell as visited
            }
            if (tem.x + 1 < n && tem.y - 1 >= 0 && grid[tem.x + 1][tem.y - 1] == 0) {
                q.add(new node(tem.x + 1, tem.y - 1, tem.dist + 1));
                grid[tem.x + 1][tem.y - 1] = 1; // Mark the cell as visited
            }
        }
        return -1;
    }
}
