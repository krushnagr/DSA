/********************

Given a 2D binary matrix A(0-based index) of dimensions NxM. Find the minimum number of steps required to reach from (0,0) to (X, Y).
Note: You can only move left, right, up and down, and only through cells that contain 1.

Example 1:

Input:
N=3, M=4
A=[[1,0,0,0], 
   [1,1,0,1],
   [0,1,1,1]]
X=2, Y=3 
Output:
5
Explanation:
The shortest path is as follows:
(0,0)->(1,0)->(1,1)->(2,1)->(2,2)->(2,3).

*************************/

class pair{
    int x,y,d;
    pair(int x,int y,int d){
        this.x = x;
        this.y = y;
        this.d = d;
    }
}
class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        Queue<pair> q = new LinkedList<>();
        int dx[] = {-1,0,1, 0};
        int dy[] = { 0,1,0,-1};
        boolean visited[][] = new boolean[N][M];
        
        q.add(new pair(0,0,0));
        visited[0][0] = true;
        
        while(!q.isEmpty()){
            pair curr = q.poll();
            if(curr.x==X && curr.y == Y)return curr.d;
            for(int i=0;i<4;i++){
                int nx = curr.x + dx[i];
                int ny = curr.y + dy[i];
                if(nx>=0 && ny>=0 && nx<N && ny<M && A[nx][ny]==1 && !visited[nx][ny]){
                    q.add(new pair(nx,ny,curr.d+1));
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }
};
