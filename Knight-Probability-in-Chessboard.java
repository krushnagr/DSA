/***********************
On an n x n chessboard, a knight starts at the cell (row, column) and attempts to make exactly k moves. 
The rows and columns are 0-indexed, so the top-left cell is (0, 0), and the bottom-right cell is (n - 1, n - 1).

A chess knight has eight possible moves it can make, as illustrated below. Each move is two cells in a cardinal direction, 
then one cell in an orthogonal direction.

Each time the knight is to move, it chooses one of eight possible moves uniformly at random (even if the piece would go off the chessboard) and moves there.

The knight continues moving until it has made exactly k moves or has moved off the chessboard.

Return the probability that the knight remains on the board after it has stopped moving.

 

Example 1:

Input: n = 3, k = 2, row = 0, column = 0
Output: 0.06250
Explanation: There are two moves (to (1,2), (2,1)) that will keep the knight on the board.
From each of those positions, there are also two moves that will keep the knight on the board.
The total probability the knight stays on the board is 0.0625.

**************************/

class Solution {

    boolean isValide(int ni, int nj, int n) {
    if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
        return true;
    }
    return false;
}

    public double knightProbability(int n, int k, int r, int c) {
        double curr[][] = new double[n][n];
        double next[][] = new double[n][n];

        curr[r][c] = 1;
        for(int m=0;m<k;m++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(curr[i][j]!=0){
                        int ni = i-2;
                        int nj = j+1;
                        if(isValide(ni,nj,n)){
                            next[ni][nj] += curr[i][j]/8.0;
                        }

                        ni = i-1;
                        nj = j+2;
                        if(isValide(ni,nj,n)){
                            next[ni][nj] += curr[i][j]/8.0;
                        }

                        ni = i+1;
                        nj = j+2;
                        if(isValide(ni,nj,n)){
                            next[ni][nj] += curr[i][j]/8.0;
                        }

                        ni = i+2;
                        nj = j+1;
                        if(isValide(ni,nj,n)){
                            next[ni][nj] += curr[i][j]/8.0;
                        }

                        ni = i+2;
                        nj = j-1;
                        if(isValide(ni,nj,n)){
                            next[ni][nj] += curr[i][j]/8.0;
                        }

                        ni = i+1;
                        nj = j-2;
                        if(isValide(ni,nj,n)){
                            next[ni][nj] += curr[i][j]/8.0;
                        }

                        ni = i-1;
                        nj = j-2;
                        if(isValide(ni,nj,n)){
                            next[ni][nj] += curr[i][j]/8.0;
                        }

                        ni = i-2;
                        nj = j-1;
                        if(isValide(ni,nj,n)){
                            next[ni][nj] += curr[i][j]/8.0;
                        }

                    }
                }
                
            }
            curr = next;
            next = new double[n][n];
        }
        double sum =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum += curr[i][j];
            }
        }
        return sum;
    }
}
